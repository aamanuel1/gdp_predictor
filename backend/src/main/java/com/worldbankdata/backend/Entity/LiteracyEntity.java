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
@Table(name = "literacy")
public class LiteracyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "literacy_id")
    private double literacyID;

    //        @OneToOne
    //        @MapsId
    //        @JoinColumn(name = "country_name")
    private String CountryName;

    private String literacyIndicatorName;

    private double literacy1980;
    private double literacy1981;
    private double literacy1982;
    private double literacy1983;
    private double literacy1984;
    private double literacy1985;
    private double literacy1986;
    private double literacy1987;
    private double literacy1988;
    private double literacy1989;
    private double literacy1990;
    private double literacy1991;
    private double literacy1992;
    private double literacy1993;
    private double literacy1994;
    private double literacy1995;
    private double literacy1996;
    private double literacy1997;
    private double literacy1998;
    private double literacy1999;
    private double literacy2000;
    private double literacy2001;
    private double literacy2002;
    private double literacy2003;
    private double literacy2004;
    private double literacy2005;
    private double literacy2006;
    private double literacy2007;
    private double literacy2008;
    private double literacy2009;
    private double literacy2010;
    private double literacy2011;
    private double literacy2012;
    private double literacy2013;
    private double literacy2014;
    private double literacy2015;
    private double literacy2016;
    private double literacy2017;
    private double literacy2018;
    private double literacy2019;
    private double literacy2020;
    private double literacy2021;

    public LiteracyEntity(double literacyID, String countryName, String literacyIndicatorName, double literacy1980,
                          double literacy1981, double literacy1982, double literacy1983, double literacy1984,
                          double literacy1985, double literacy1986, double literacy1987, double literacy1988,
                          double literacy1989, double literacy1990, double literacy1991, double literacy1992,
                          double literacy1993, double literacy1994, double literacy1995, double literacy1996,
                          double literacy1997, double literacy1998, double literacy1999, double literacy2000,
                          double literacy2001, double literacy2002, double literacy2003, double literacy2004,
                          double literacy2005, double literacy2006, double literacy2007, double literacy2008,
                          double literacy2009, double literacy2010, double literacy2011, double literacy2012,
                          double literacy2013, double literacy2014, double literacy2015, double literacy2016,
                          double literacy2017, double literacy2018, double literacy2019, double literacy2020,
                          double literacy2021) {

        this.literacyID = literacyID;
        CountryName = countryName;
        this.literacyIndicatorName = literacyIndicatorName;
        this.literacy1980 = literacy1980;
        this.literacy1981 = literacy1981;
        this.literacy1982 = literacy1982;
        this.literacy1983 = literacy1983;
        this.literacy1984 = literacy1984;
        this.literacy1985 = literacy1985;
        this.literacy1986 = literacy1986;
        this.literacy1987 = literacy1987;
        this.literacy1988 = literacy1988;
        this.literacy1989 = literacy1989;
        this.literacy1990 = literacy1990;
        this.literacy1991 = literacy1991;
        this.literacy1992 = literacy1992;
        this.literacy1993 = literacy1993;
        this.literacy1994 = literacy1994;
        this.literacy1995 = literacy1995;
        this.literacy1996 = literacy1996;
        this.literacy1997 = literacy1997;
        this.literacy1998 = literacy1998;
        this.literacy1999 = literacy1999;
        this.literacy2000 = literacy2000;
        this.literacy2001 = literacy2001;
        this.literacy2002 = literacy2002;
        this.literacy2003 = literacy2003;
        this.literacy2004 = literacy2004;
        this.literacy2005 = literacy2005;
        this.literacy2006 = literacy2006;
        this.literacy2007 = literacy2007;
        this.literacy2008 = literacy2008;
        this.literacy2009 = literacy2009;
        this.literacy2010 = literacy2010;
        this.literacy2011 = literacy2011;
        this.literacy2012 = literacy2012;
        this.literacy2013 = literacy2013;
        this.literacy2014 = literacy2014;
        this.literacy2015 = literacy2015;
        this.literacy2016 = literacy2016;
        this.literacy2017 = literacy2017;
        this.literacy2018 = literacy2018;
        this.literacy2019 = literacy2019;
        this.literacy2020 = literacy2020;
        this.literacy2021 = literacy2021;
    }

    public LiteracyEntity(String countryName, String literacyIndicatorName, double literacy1980,
                          double literacy1981, double literacy1982, double literacy1983, double literacy1984,
                          double literacy1985, double literacy1986, double literacy1987, double literacy1988,
                          double literacy1989, double literacy1990, double literacy1991, double literacy1992,
                          double literacy1993, double literacy1994, double literacy1995, double literacy1996,
                          double literacy1997, double literacy1998, double literacy1999, double literacy2000,
                          double literacy2001, double literacy2002, double literacy2003, double literacy2004,
                          double literacy2005, double literacy2006, double literacy2007, double literacy2008,
                          double literacy2009, double literacy2010, double literacy2011, double literacy2012,
                          double literacy2013, double literacy2014, double literacy2015, double literacy2016,
                          double literacy2017, double literacy2018, double literacy2019, double literacy2020,
                          double literacy2021) {

        CountryName = countryName;
        this.literacyIndicatorName = literacyIndicatorName;
        this.literacy1980 = literacy1980;
        this.literacy1981 = literacy1981;
        this.literacy1982 = literacy1982;
        this.literacy1983 = literacy1983;
        this.literacy1984 = literacy1984;
        this.literacy1985 = literacy1985;
        this.literacy1986 = literacy1986;
        this.literacy1987 = literacy1987;
        this.literacy1988 = literacy1988;
        this.literacy1989 = literacy1989;
        this.literacy1990 = literacy1990;
        this.literacy1991 = literacy1991;
        this.literacy1992 = literacy1992;
        this.literacy1993 = literacy1993;
        this.literacy1994 = literacy1994;
        this.literacy1995 = literacy1995;
        this.literacy1996 = literacy1996;
        this.literacy1997 = literacy1997;
        this.literacy1998 = literacy1998;
        this.literacy1999 = literacy1999;
        this.literacy2000 = literacy2000;
        this.literacy2001 = literacy2001;
        this.literacy2002 = literacy2002;
        this.literacy2003 = literacy2003;
        this.literacy2004 = literacy2004;
        this.literacy2005 = literacy2005;
        this.literacy2006 = literacy2006;
        this.literacy2007 = literacy2007;
        this.literacy2008 = literacy2008;
        this.literacy2009 = literacy2009;
        this.literacy2010 = literacy2010;
        this.literacy2011 = literacy2011;
        this.literacy2012 = literacy2012;
        this.literacy2013 = literacy2013;
        this.literacy2014 = literacy2014;
        this.literacy2015 = literacy2015;
        this.literacy2016 = literacy2016;
        this.literacy2017 = literacy2017;
        this.literacy2018 = literacy2018;
        this.literacy2019 = literacy2019;
        this.literacy2020 = literacy2020;
        this.literacy2021 = literacy2021;
    }
}
