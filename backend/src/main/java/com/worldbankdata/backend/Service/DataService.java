package com.worldbankdata.backend.Service;

import com.worldbankdata.backend.Entity.CombinedDataEntity;
import com.worldbankdata.backend.Entity.GDPEntity;
import com.worldbankdata.backend.Repository.CountryRepository;
import com.worldbankdata.backend.Repository.ExportValRepository;
import com.worldbankdata.backend.Repository.GDPRepository;
import lombok.Data;
import org.python.core.PyException;
import org.python.core.PyObject;
import org.python.util.PythonInterpreter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class DataService {

//    @Autowired
//    private final GDPRepository gdpRepository;
//    @Autowired
//    private final CountryRepository countryRepository;
//    @Autowired
//    private final ExportValRepository exportValRepository;
//
    public DataService(){}

//    public DataService(GDPRepository gdpRepository, CountryRepository countryRepository,
//                       ExportValRepository exportValRepository){
//        this.gdpRepository = gdpRepository;
//        this.countryRepository = countryRepository;
//        this.exportValRepository = exportValRepository;
//    }

    public Double getCountryGDP(String countryName) throws Exception{
//        String result = runModel(countryName);
        double result = 0;
//        ResourceLoader resourceLoader = new DefaultResourceLoader();
//        Resource resource =resourceLoader.getResource("classpath:FutureGDP.csv");
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Aaron\\Documents\\SoftwareClasses\\hackathons\\final\\gdp_predictor\\backend\\src\\main\\resources\\FutureGDP.csv"));
        try{
            String line;
            while((line = br.readLine()) != null){
                String[] countryGDP = line.split(",");
                if(countryGDP[0].equals(countryName)){
                    String stringResult = countryGDP[1];
                    result = Double.parseDouble(stringResult);
                    break;
                }
            }
        } catch(IOException error){
            error.printStackTrace();
        }
        return result;
    }

    public String runModel(String countryName) throws Exception {
//        ProcessBuilder pb = new ProcessBuilder("conda", "init");
//        Process process = pb.start();
//        process.waitFor();
//        ProcessBuilder pb2 = new ProcessBuilder("conda", "activate", "ensf-ml");
//        Process process2 = pb2.start();
//        process2.waitFor();
//        ProcessBuilder pb2 = new ProcessBuilder("conda init && conda activate ensf-ml");
//        Process process2 = pb2.start();
//        BufferedReader reader = new BufferedReader(new InputStreamReader((process2.getInputStream())));
//        String line1;
//        while((line1 = reader.readLine()) != null){
//            System.out.println(line1);
//        }
//        process2.waitFor();
//        ProcessBuilder pb2 = new ProcessBuilder("conda", "activate", "ensf-ml");
//        Process process2 = pb2.start();
//        process2.waitFor();
//        Runtime.getRuntime().exec("cmd /C \"conda init && conda activate ensf-ml\"");
        ProcessBuilder pb3 = new ProcessBuilder("C:/ProgramData/Anaconda3/envs/ensf-ml/python.exe",
                "C:/Users/Aaron/Documents/SoftwareClasses/hackathons/gdp_predictor/model/GDP_Predictor.py");
        pb3.redirectErrorStream(true);
        Process process3 = pb3.start();
        BufferedReader reader1 = new BufferedReader(new InputStreamReader((process3.getInputStream())));
        String line;
        while((line = reader1.readLine()) != null){
            System.out.println(line);
        }
        return "finished";
    }
}
