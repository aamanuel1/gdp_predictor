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
@Table(name = "population")
public class PopulationEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "population_id")
    private Long popID;

//    @OneToOne
//    @MapsId
//    @JoinColumn(name = "country_name")
    private CountryEntity country;

    private String popIndicatorName;

    private long pop1980;
    private long pop1981;
    private long pop1982;
    private long pop1983;
    private long pop1984;
    private long pop1985;
    private long pop1986;
    private long pop1987;
    private long pop1988;
    private long pop1989;
    private long pop1990;
    private long pop1991;
    private long pop1992;
    private long pop1993;
    private long pop1994;
    private long pop1995;
    private long pop1996;
    private long pop1997;
    private long pop1998;
    private long pop1999;
    private long pop2000;
    private long pop2001;
    private long pop2002;
    private long pop2003;
    private long pop2004;
    private long pop2005;
    private long pop2006;
    private long pop2007;
    private long pop2008;
    private long pop2009;
    private long pop2010;
    private long pop2011;
    private long pop2012;
    private long pop2013;
    private long pop2014;
    private long pop2015;
    private long pop2016;
    private long pop2017;
    private long pop2018;
    private long pop2019;
    private long pop2020;
    private long pop2021;

    public PopulationEntity(Long popID, CountryEntity country, String popIndicatorName, long pop1980, long pop1981,
                            long pop1982, long pop1983, long pop1984, long pop1985, long pop1986, long pop1987,
                            long pop1988, long pop1989, long pop1990, long pop1991, long pop1992, long pop1993,
                            long pop1994, long pop1995, long pop1996, long pop1997, long pop1998, long pop1999,
                            long pop2000, long pop2001, long pop2002, long pop2003, long pop2004, long pop2005,
                            long pop2006, long pop2007, long pop2008, long pop2009, long pop2010, long pop2011,
                            long pop2012, long pop2013, long pop2014, long pop2015, long pop2016, long pop2017,
                            long pop2018, long pop2019, long pop2020, long pop2021) {
        this.popID = popID;
        this.country = country;
        this.popIndicatorName = popIndicatorName;
        this.pop1980 = pop1980;
        this.pop1981 = pop1981;
        this.pop1982 = pop1982;
        this.pop1983 = pop1983;
        this.pop1984 = pop1984;
        this.pop1985 = pop1985;
        this.pop1986 = pop1986;
        this.pop1987 = pop1987;
        this.pop1988 = pop1988;
        this.pop1989 = pop1989;
        this.pop1990 = pop1990;
        this.pop1991 = pop1991;
        this.pop1992 = pop1992;
        this.pop1993 = pop1993;
        this.pop1994 = pop1994;
        this.pop1995 = pop1995;
        this.pop1996 = pop1996;
        this.pop1997 = pop1997;
        this.pop1998 = pop1998;
        this.pop1999 = pop1999;
        this.pop2000 = pop2000;
        this.pop2001 = pop2001;
        this.pop2002 = pop2002;
        this.pop2003 = pop2003;
        this.pop2004 = pop2004;
        this.pop2005 = pop2005;
        this.pop2006 = pop2006;
        this.pop2007 = pop2007;
        this.pop2008 = pop2008;
        this.pop2009 = pop2009;
        this.pop2010 = pop2010;
        this.pop2011 = pop2011;
        this.pop2012 = pop2012;
        this.pop2013 = pop2013;
        this.pop2014 = pop2014;
        this.pop2015 = pop2015;
        this.pop2016 = pop2016;
        this.pop2017 = pop2017;
        this.pop2018 = pop2018;
        this.pop2019 = pop2019;
        this.pop2020 = pop2020;
        this.pop2021 = pop2021;
    }

    public PopulationEntity(CountryEntity country, String popIndicatorName, long pop1980, long pop1981,
                            long pop1982, long pop1983, long pop1984, long pop1985, long pop1986, long pop1987,
                            long pop1988, long pop1989, long pop1990, long pop1991, long pop1992, long pop1993,
                            long pop1994, long pop1995, long pop1996, long pop1997, long pop1998, long pop1999,
                            long pop2000, long pop2001, long pop2002, long pop2003, long pop2004, long pop2005,
                            long pop2006, long pop2007, long pop2008, long pop2009, long pop2010, long pop2011,
                            long pop2012, long pop2013, long pop2014, long pop2015, long pop2016, long pop2017,
                            long pop2018, long pop2019, long pop2020, long pop2021) {
        this.country = country;
        this.popIndicatorName = popIndicatorName;
        this.pop1980 = pop1980;
        this.pop1981 = pop1981;
        this.pop1982 = pop1982;
        this.pop1983 = pop1983;
        this.pop1984 = pop1984;
        this.pop1985 = pop1985;
        this.pop1986 = pop1986;
        this.pop1987 = pop1987;
        this.pop1988 = pop1988;
        this.pop1989 = pop1989;
        this.pop1990 = pop1990;
        this.pop1991 = pop1991;
        this.pop1992 = pop1992;
        this.pop1993 = pop1993;
        this.pop1994 = pop1994;
        this.pop1995 = pop1995;
        this.pop1996 = pop1996;
        this.pop1997 = pop1997;
        this.pop1998 = pop1998;
        this.pop1999 = pop1999;
        this.pop2000 = pop2000;
        this.pop2001 = pop2001;
        this.pop2002 = pop2002;
        this.pop2003 = pop2003;
        this.pop2004 = pop2004;
        this.pop2005 = pop2005;
        this.pop2006 = pop2006;
        this.pop2007 = pop2007;
        this.pop2008 = pop2008;
        this.pop2009 = pop2009;
        this.pop2010 = pop2010;
        this.pop2011 = pop2011;
        this.pop2012 = pop2012;
        this.pop2013 = pop2013;
        this.pop2014 = pop2014;
        this.pop2015 = pop2015;
        this.pop2016 = pop2016;
        this.pop2017 = pop2017;
        this.pop2018 = pop2018;
        this.pop2019 = pop2019;
        this.pop2020 = pop2020;
        this.pop2021 = pop2021;
    }

}
