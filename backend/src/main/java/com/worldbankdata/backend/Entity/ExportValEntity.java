package com.worldbankdata.backend.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "export_value")
public class ExportValEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "exportVal_id")
    private double exportValID;

    //        @OneToOne
    //        @MapsId
    //        @JoinColumn(name = "country_name")
    private String CountryName;

    private String exportValIndicatorName;

    private double exportVal1980;
    private double exportVal1981;
    private double exportVal1982;
    private double exportVal1983;
    private double exportVal1984;
    private double exportVal1985;
    private double exportVal1986;
    private double exportVal1987;
    private double exportVal1988;
    private double exportVal1989;
    private double exportVal1990;
    private double exportVal1991;
    private double exportVal1992;
    private double exportVal1993;
    private double exportVal1994;
    private double exportVal1995;
    private double exportVal1996;
    private double exportVal1997;
    private double exportVal1998;
    private double exportVal1999;
    private double exportVal2000;
    private double exportVal2001;
    private double exportVal2002;
    private double exportVal2003;
    private double exportVal2004;
    private double exportVal2005;
    private double exportVal2006;
    private double exportVal2007;
    private double exportVal2008;
    private double exportVal2009;
    private double exportVal2010;
    private double exportVal2011;
    private double exportVal2012;
    private double exportVal2013;
    private double exportVal2014;
    private double exportVal2015;
    private double exportVal2016;
    private double exportVal2017;
    private double exportVal2018;
    private double exportVal2019;
    private double exportVal2020;
    private double exportVal2021;

    public ExportValEntity(double exportValID, String countryName, String exportValIndicatorName, double exportVal1980,
                          double exportVal1981, double exportVal1982, double exportVal1983, double exportVal1984,
                          double exportVal1985, double exportVal1986, double exportVal1987, double exportVal1988,
                          double exportVal1989, double exportVal1990, double exportVal1991, double exportVal1992,
                          double exportVal1993, double exportVal1994, double exportVal1995, double exportVal1996,
                          double exportVal1997, double exportVal1998, double exportVal1999, double exportVal2000,
                          double exportVal2001, double exportVal2002, double exportVal2003, double exportVal2004,
                          double exportVal2005, double exportVal2006, double exportVal2007, double exportVal2008,
                          double exportVal2009, double exportVal2010, double exportVal2011, double exportVal2012,
                          double exportVal2013, double exportVal2014, double exportVal2015, double exportVal2016,
                          double exportVal2017, double exportVal2018, double exportVal2019, double exportVal2020,
                          double exportVal2021) {

        this.exportValID = exportValID;
        CountryName = countryName;
        this.exportValIndicatorName = exportValIndicatorName;
        this.exportVal1980 = exportVal1980;
        this.exportVal1981 = exportVal1981;
        this.exportVal1982 = exportVal1982;
        this.exportVal1983 = exportVal1983;
        this.exportVal1984 = exportVal1984;
        this.exportVal1985 = exportVal1985;
        this.exportVal1986 = exportVal1986;
        this.exportVal1987 = exportVal1987;
        this.exportVal1988 = exportVal1988;
        this.exportVal1989 = exportVal1989;
        this.exportVal1990 = exportVal1990;
        this.exportVal1991 = exportVal1991;
        this.exportVal1992 = exportVal1992;
        this.exportVal1993 = exportVal1993;
        this.exportVal1994 = exportVal1994;
        this.exportVal1995 = exportVal1995;
        this.exportVal1996 = exportVal1996;
        this.exportVal1997 = exportVal1997;
        this.exportVal1998 = exportVal1998;
        this.exportVal1999 = exportVal1999;
        this.exportVal2000 = exportVal2000;
        this.exportVal2001 = exportVal2001;
        this.exportVal2002 = exportVal2002;
        this.exportVal2003 = exportVal2003;
        this.exportVal2004 = exportVal2004;
        this.exportVal2005 = exportVal2005;
        this.exportVal2006 = exportVal2006;
        this.exportVal2007 = exportVal2007;
        this.exportVal2008 = exportVal2008;
        this.exportVal2009 = exportVal2009;
        this.exportVal2010 = exportVal2010;
        this.exportVal2011 = exportVal2011;
        this.exportVal2012 = exportVal2012;
        this.exportVal2013 = exportVal2013;
        this.exportVal2014 = exportVal2014;
        this.exportVal2015 = exportVal2015;
        this.exportVal2016 = exportVal2016;
        this.exportVal2017 = exportVal2017;
        this.exportVal2018 = exportVal2018;
        this.exportVal2019 = exportVal2019;
        this.exportVal2020 = exportVal2020;
        this.exportVal2021 = exportVal2021;
    }

    public ExportValEntity(String countryName, String exportValIndicatorName, double exportVal1980,
                          double exportVal1981, double exportVal1982, double exportVal1983, double exportVal1984,
                          double exportVal1985, double exportVal1986, double exportVal1987, double exportVal1988,
                          double exportVal1989, double exportVal1990, double exportVal1991, double exportVal1992,
                          double exportVal1993, double exportVal1994, double exportVal1995, double exportVal1996,
                          double exportVal1997, double exportVal1998, double exportVal1999, double exportVal2000,
                          double exportVal2001, double exportVal2002, double exportVal2003, double exportVal2004,
                          double exportVal2005, double exportVal2006, double exportVal2007, double exportVal2008,
                          double exportVal2009, double exportVal2010, double exportVal2011, double exportVal2012,
                          double exportVal2013, double exportVal2014, double exportVal2015, double exportVal2016,
                          double exportVal2017, double exportVal2018, double exportVal2019, double exportVal2020,
                          double exportVal2021) {

        CountryName = countryName;
        this.exportValIndicatorName = exportValIndicatorName;
        this.exportVal1980 = exportVal1980;
        this.exportVal1981 = exportVal1981;
        this.exportVal1982 = exportVal1982;
        this.exportVal1983 = exportVal1983;
        this.exportVal1984 = exportVal1984;
        this.exportVal1985 = exportVal1985;
        this.exportVal1986 = exportVal1986;
        this.exportVal1987 = exportVal1987;
        this.exportVal1988 = exportVal1988;
        this.exportVal1989 = exportVal1989;
        this.exportVal1990 = exportVal1990;
        this.exportVal1991 = exportVal1991;
        this.exportVal1992 = exportVal1992;
        this.exportVal1993 = exportVal1993;
        this.exportVal1994 = exportVal1994;
        this.exportVal1995 = exportVal1995;
        this.exportVal1996 = exportVal1996;
        this.exportVal1997 = exportVal1997;
        this.exportVal1998 = exportVal1998;
        this.exportVal1999 = exportVal1999;
        this.exportVal2000 = exportVal2000;
        this.exportVal2001 = exportVal2001;
        this.exportVal2002 = exportVal2002;
        this.exportVal2003 = exportVal2003;
        this.exportVal2004 = exportVal2004;
        this.exportVal2005 = exportVal2005;
        this.exportVal2006 = exportVal2006;
        this.exportVal2007 = exportVal2007;
        this.exportVal2008 = exportVal2008;
        this.exportVal2009 = exportVal2009;
        this.exportVal2010 = exportVal2010;
        this.exportVal2011 = exportVal2011;
        this.exportVal2012 = exportVal2012;
        this.exportVal2013 = exportVal2013;
        this.exportVal2014 = exportVal2014;
        this.exportVal2015 = exportVal2015;
        this.exportVal2016 = exportVal2016;
        this.exportVal2017 = exportVal2017;
        this.exportVal2018 = exportVal2018;
        this.exportVal2019 = exportVal2019;
        this.exportVal2020 = exportVal2020;
        this.exportVal2021 = exportVal2021;
    }
}
