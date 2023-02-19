# Import libraries
import numpy as np
import pandas as pd
# import matplotlib.pyplot as plt
# import seaborn as sns
from sklearn.model_selection import cross_validate
from sklearn.linear_model import LinearRegression
from sklearn.ensemble import RandomForestRegressor, GradientBoostingRegressor
from sklearn.model_selection import train_test_split
from sklearn.metrics import mean_squared_error, r2_score
from sklearn.model_selection import cross_val_score

# Read the data
GDP_data = pd.read_excel('dataset\API_NY.GDP.MKTP.CD_DS2_en_excel_v2_4770502.xls', usecols=np.r_[0, 24:65], skiprows=3)
literacy_rate_data = pd.read_excel('dataset\API_SE.ADT.LITR.ZS_DS2_en_excel_v2_4773710.xls', usecols=np.r_[0, 24:65], skiprows=3)
mortality_rate_data = pd.read_excel('dataset\API_SP.DYN.IMRT.IN_DS2_en_excel_v2_4770604.xls', usecols=np.r_[0, 24:65], skiprows=3)
population_data = pd.read_excel('dataset\API_SP.POP.TOTL_DS2_en_excel_v2_4770385.xls', usecols=np.r_[0, 24:65], skiprows=3)
EVI_data = pd.read_excel('dataset\API_TX.VAL.MRCH.XD.WD_DS2_en_excel_v2_4774581.xls', usecols=np.r_[0, 24:65], skiprows=3)

# Provided country by user
country_name = 'United States'
# Get the list of country names
countries = GDP_data['Country Name'].unique().tolist()

# DATA PREPROCESSING

# Create a dataframe to store the data for all countries
df = pd.DataFrame(columns=['Country Name', 'Year', 'GDP', 'Literacy Rate', 'Mortality Rate', 'Population', 'Export Value Index'])
for country in countries:
    # Extract the data for the country from each data set
    GDP = GDP_data.loc[GDP_data['Country Name'] == country].iloc[0, 1:].tolist()
    literacy_rate = literacy_rate_data.loc[literacy_rate_data['Country Name'] == country].iloc[0, 1:].tolist()
    mortality_rate = mortality_rate_data.loc[mortality_rate_data['Country Name'] == country].iloc[0, 1:].tolist()
    population = population_data.loc[population_data['Country Name'] == country].iloc[0, 1:].tolist()
    EVI = EVI_data.loc[EVI_data['Country Name'] == country].iloc[0, 1:].tolist()
    
    # Combine the data into a list of tuples
    data = list(zip([country]*len(GDP), GDP_data.columns[1:], GDP, literacy_rate, mortality_rate, population, EVI))
    
    # Append the data to the dataframe
    # df = df.append(pd.DataFrame(data, columns=df.columns))
    df = pd.concat([df, pd.DataFrame(data, columns=df.columns)])

# Get the data for the selected country
model_data = df.loc[df['Country Name'] == country_name]

# Prepare the data to train the model
model_data['Year'] = model_data['Year'].astype(int)
model_GDP = model_data[['Year', 'GDP']]
row_GDP = (model_GDP['Year'] >= 1990) & (model_GDP['Year'] <= 2020)
model_data_GDP = model_GDP.loc[row_GDP, ['GDP']].reset_index(drop=True)
model_data_GDP = model_data_GDP.rename(columns={'GDP': 'GDP in Ten Years'})

model_data = model_data.drop(columns=['GDP'])
row_index = (model_data['Year'] >= 1980) & (model_data['Year'] <= 2010)
columns = ['Year', 'Literacy Rate', 'Population', 'Export Value Index', 'Mortality Rate']
model_data_range = model_data.loc[row_index, columns]

# Training data
train_data = pd.concat([model_data_range, model_data_GDP], axis=1)

# Test data
row_index = (model_data['Year'] >= 2011) & (model_data['Year'] <= 2020)
columns = ['Year', 'Literacy Rate', 'Population', 'Export Value Index', 'Mortality Rate']
test_data = model_data.loc[row_index, columns].reset_index(drop=True)

# Fill the missing values in the training set with mean and drop any column with all values missing
train_data['Literacy Rate'].fillna((train_data['Literacy Rate'].mean()), inplace=True)
train_data['Export Value Index'].fillna((train_data['Export Value Index'].mean()), inplace=True)
train_data['GDP in Ten Years'].fillna((train_data['GDP in Ten Years'].mean()), inplace=True)
train_data['Mortality Rate'].fillna((train_data['Mortality Rate'].mean()), inplace=True)
train_data['Population'].fillna((train_data['Population'].mean()), inplace=True)
train_data.dropna(axis=1, inplace=True)

# Fill the missing values in the test set with mean and drop any column with all values missing
test_data['Literacy Rate'].fillna((test_data['Literacy Rate'].mean()), inplace=True)
test_data['Export Value Index'].fillna((test_data['Export Value Index'].mean()), inplace=True)
test_data['Mortality Rate'].fillna((test_data['Mortality Rate'].mean()), inplace=True)
test_data['Population'].fillna((test_data['Population'].mean()), inplace=True)
test_data.dropna(axis=1, inplace=True)

# Drop the target feature from the train data
X = train_data.drop('GDP in Ten Years', axis=1)
y = train_data['GDP in Ten Years']

# Create a training and a validation set
X_train, X_test, y_train, y_test = train_test_split(X, y, test_size=0.2, random_state=298)

# Train the machine learning model with several models
init_models = { 'Linear Regression': LinearRegression(),
                'Random forest': RandomForestRegressor(random_state=64),
                'Gradient Boosting Regressor': GradientBoostingRegressor(random_state=79),
               }
R2 = []
models_names = []
for i, (key,model) in enumerate(init_models.items()):
    model.fit(X_train, y_train)
    models_names.append(key)
    R2.append(np.mean(cross_val_score(model, X_train, y_train, cv=5)))
models_scores = pd.DataFrame({'Model Name': models_names, 'R2 Score': R2})

# Choose the best model with the highest R2 score
models_scores.sort_values('R2 Score', ascending=False, inplace=True)
best_model = models_scores.iloc[0]

# Fit the data to the best model
best_model_name = best_model['Model Name']
best_model = init_models[best_model_name]
best_model.fit(X_train, y_train)

# Evaluate the model using the validation set
R2_train = []
R2_test = []
y_pred_train = best_model.predict(X_train)
y_pred_test = best_model.predict(X_test)
R2_train.append(r2_score(y_train, y_pred_train))
R2_test.append(r2_score(y_test, y_pred_test))
# Create a dataframe with the R2 scores for each model
models_scores = pd.DataFrame({'Model Name': best_model,'R2 Train': R2_train, 'R2 Test': R2_test})
models_scores

# Predict using new data - the test data
prediction = best_model.predict(test_data)

# Save prediction in a dataframe
# Create a conclusion dataframe and append 'Year' columns
conclusion = pd.DataFrame()
conclusion['Year'] = test_data['Year'] + 10
conclusion['GDP'] = prediction
conclusion

# Save model prediction as a csv file
conclusion.to_csv('prediction.csv', index=False)
