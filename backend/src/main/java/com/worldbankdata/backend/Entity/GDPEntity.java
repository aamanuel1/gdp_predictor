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
@Table(name = "gdp")
public class GDPEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GDP_id")
    private double GDPID;

    //        @OneToOne
    //        @MapsId
    //        @JoinColumn(name = "country_name")
    private String CountryName;

    private String GDPIndicatorName;

    private double GDP1980;
    private double GDP1981;
    private double GDP1982;
    private double GDP1983;
    private double GDP1984;
    private double GDP1985;
    private double GDP1986;
    private double GDP1987;
    private double GDP1988;
    private double GDP1989;
    private double GDP1990;
    private double GDP1991;
    private double GDP1992;
    private double GDP1993;
    private double GDP1994;
    private double GDP1995;
    private double GDP1996;
    private double GDP1997;
    private double GDP1998;
    private double GDP1999;
    private double GDP2000;
    private double GDP2001;
    private double GDP2002;
    private double GDP2003;
    private double GDP2004;
    private double GDP2005;
    private double GDP2006;
    private double GDP2007;
    private double GDP2008;
    private double GDP2009;
    private double GDP2010;
    private double GDP2011;
    private double GDP2012;
    private double GDP2013;
    private double GDP2014;
    private double GDP2015;
    private double GDP2016;
    private double GDP2017;
    private double GDP2018;
    private double GDP2019;
    private double GDP2020;
    private double GDP2021;

    public GDPEntity(double GDPID, String countryName, String GDPIndicatorName, double GDP1980,
                          double GDP1981, double GDP1982, double GDP1983, double GDP1984,
                          double GDP1985, double GDP1986, double GDP1987, double GDP1988,
                          double GDP1989, double GDP1990, double GDP1991, double GDP1992,
                          double GDP1993, double GDP1994, double GDP1995, double GDP1996,
                          double GDP1997, double GDP1998, double GDP1999, double GDP2000,
                          double GDP2001, double GDP2002, double GDP2003, double GDP2004,
                          double GDP2005, double GDP2006, double GDP2007, double GDP2008,
                          double GDP2009, double GDP2010, double GDP2011, double GDP2012,
                          double GDP2013, double GDP2014, double GDP2015, double GDP2016,
                          double GDP2017, double GDP2018, double GDP2019, double GDP2020,
                          double GDP2021) {

        this.GDPID = GDPID;
        CountryName = countryName;
        this.GDPIndicatorName = GDPIndicatorName;
        this.GDP1980 = GDP1980;
        this.GDP1981 = GDP1981;
        this.GDP1982 = GDP1982;
        this.GDP1983 = GDP1983;
        this.GDP1984 = GDP1984;
        this.GDP1985 = GDP1985;
        this.GDP1986 = GDP1986;
        this.GDP1987 = GDP1987;
        this.GDP1988 = GDP1988;
        this.GDP1989 = GDP1989;
        this.GDP1990 = GDP1990;
        this.GDP1991 = GDP1991;
        this.GDP1992 = GDP1992;
        this.GDP1993 = GDP1993;
        this.GDP1994 = GDP1994;
        this.GDP1995 = GDP1995;
        this.GDP1996 = GDP1996;
        this.GDP1997 = GDP1997;
        this.GDP1998 = GDP1998;
        this.GDP1999 = GDP1999;
        this.GDP2000 = GDP2000;
        this.GDP2001 = GDP2001;
        this.GDP2002 = GDP2002;
        this.GDP2003 = GDP2003;
        this.GDP2004 = GDP2004;
        this.GDP2005 = GDP2005;
        this.GDP2006 = GDP2006;
        this.GDP2007 = GDP2007;
        this.GDP2008 = GDP2008;
        this.GDP2009 = GDP2009;
        this.GDP2010 = GDP2010;
        this.GDP2011 = GDP2011;
        this.GDP2012 = GDP2012;
        this.GDP2013 = GDP2013;
        this.GDP2014 = GDP2014;
        this.GDP2015 = GDP2015;
        this.GDP2016 = GDP2016;
        this.GDP2017 = GDP2017;
        this.GDP2018 = GDP2018;
        this.GDP2019 = GDP2019;
        this.GDP2020 = GDP2020;
        this.GDP2021 = GDP2021;
    }

    public GDPEntity(String countryName, String GDPIndicatorName, double GDP1980,
                          double GDP1981, double GDP1982, double GDP1983, double GDP1984,
                          double GDP1985, double GDP1986, double GDP1987, double GDP1988,
                          double GDP1989, double GDP1990, double GDP1991, double GDP1992,
                          double GDP1993, double GDP1994, double GDP1995, double GDP1996,
                          double GDP1997, double GDP1998, double GDP1999, double GDP2000,
                          double GDP2001, double GDP2002, double GDP2003, double GDP2004,
                          double GDP2005, double GDP2006, double GDP2007, double GDP2008,
                          double GDP2009, double GDP2010, double GDP2011, double GDP2012,
                          double GDP2013, double GDP2014, double GDP2015, double GDP2016,
                          double GDP2017, double GDP2018, double GDP2019, double GDP2020,
                          double GDP2021) {

        CountryName = countryName;
        this.GDPIndicatorName = GDPIndicatorName;
        this.GDP1980 = GDP1980;
        this.GDP1981 = GDP1981;
        this.GDP1982 = GDP1982;
        this.GDP1983 = GDP1983;
        this.GDP1984 = GDP1984;
        this.GDP1985 = GDP1985;
        this.GDP1986 = GDP1986;
        this.GDP1987 = GDP1987;
        this.GDP1988 = GDP1988;
        this.GDP1989 = GDP1989;
        this.GDP1990 = GDP1990;
        this.GDP1991 = GDP1991;
        this.GDP1992 = GDP1992;
        this.GDP1993 = GDP1993;
        this.GDP1994 = GDP1994;
        this.GDP1995 = GDP1995;
        this.GDP1996 = GDP1996;
        this.GDP1997 = GDP1997;
        this.GDP1998 = GDP1998;
        this.GDP1999 = GDP1999;
        this.GDP2000 = GDP2000;
        this.GDP2001 = GDP2001;
        this.GDP2002 = GDP2002;
        this.GDP2003 = GDP2003;
        this.GDP2004 = GDP2004;
        this.GDP2005 = GDP2005;
        this.GDP2006 = GDP2006;
        this.GDP2007 = GDP2007;
        this.GDP2008 = GDP2008;
        this.GDP2009 = GDP2009;
        this.GDP2010 = GDP2010;
        this.GDP2011 = GDP2011;
        this.GDP2012 = GDP2012;
        this.GDP2013 = GDP2013;
        this.GDP2014 = GDP2014;
        this.GDP2015 = GDP2015;
        this.GDP2016 = GDP2016;
        this.GDP2017 = GDP2017;
        this.GDP2018 = GDP2018;
        this.GDP2019 = GDP2019;
        this.GDP2020 = GDP2020;
        this.GDP2021 = GDP2021;
    }
}
