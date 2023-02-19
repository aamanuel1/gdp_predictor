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
@Table(name = "mortality")
public class MortalityEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "mortality_id")
        private double mortalityID;

//        @OneToOne
//        @MapsId
//        @JoinColumn(name = "country_name")
        private String CountryName;

        private String mortalityIndicatorName;

        private double mortality1980;
        private double mortality1981;
        private double mortality1982;
        private double mortality1983;
        private double mortality1984;
        private double mortality1985;
        private double mortality1986;
        private double mortality1987;
        private double mortality1988;
        private double mortality1989;
        private double mortality1990;
        private double mortality1991;
        private double mortality1992;
        private double mortality1993;
        private double mortality1994;
        private double mortality1995;
        private double mortality1996;
        private double mortality1997;
        private double mortality1998;
        private double mortality1999;
        private double mortality2000;
        private double mortality2001;
        private double mortality2002;
        private double mortality2003;
        private double mortality2004;
        private double mortality2005;
        private double mortality2006;
        private double mortality2007;
        private double mortality2008;
        private double mortality2009;
        private double mortality2010;
        private double mortality2011;
        private double mortality2012;
        private double mortality2013;
        private double mortality2014;
        private double mortality2015;
        private double mortality2016;
        private double mortality2017;
        private double mortality2018;
        private double mortality2019;
        private double mortality2020;
        private double mortality2021;

        public MortalityEntity(double mortalityID, String countryName, String mortalityIndicatorName, double mortality1980, double mortality1981, double mortality1982, double mortality1983, double mortality1984, double mortality1985, double mortality1986, double mortality1987, double mortality1988, double mortality1989, double mortality1990, double mortality1991, double mortality1992, double mortality1993, double mortality1994, double mortality1995, double mortality1996, double mortality1997, double mortality1998, double mortality1999, double mortality2000, double mortality2001, double mortality2002, double mortality2003, double mortality2004, double mortality2005, double mortality2006, double mortality2007, double mortality2008, double mortality2009, double mortality2010, double mortality2011, double mortality2012, double mortality2013, double mortality2014, double mortality2015, double mortality2016, double mortality2017, double mortality2018, double mortality2019, double mortality2020, double mortality2021) {
            this.mortalityID = mortalityID;
            CountryName = countryName;
            this.mortalityIndicatorName = mortalityIndicatorName;
            this.mortality1980 = mortality1980;
            this.mortality1981 = mortality1981;
            this.mortality1982 = mortality1982;
            this.mortality1983 = mortality1983;
            this.mortality1984 = mortality1984;
            this.mortality1985 = mortality1985;
            this.mortality1986 = mortality1986;
            this.mortality1987 = mortality1987;
            this.mortality1988 = mortality1988;
            this.mortality1989 = mortality1989;
            this.mortality1990 = mortality1990;
            this.mortality1991 = mortality1991;
            this.mortality1992 = mortality1992;
            this.mortality1993 = mortality1993;
            this.mortality1994 = mortality1994;
            this.mortality1995 = mortality1995;
            this.mortality1996 = mortality1996;
            this.mortality1997 = mortality1997;
            this.mortality1998 = mortality1998;
            this.mortality1999 = mortality1999;
            this.mortality2000 = mortality2000;
            this.mortality2001 = mortality2001;
            this.mortality2002 = mortality2002;
            this.mortality2003 = mortality2003;
            this.mortality2004 = mortality2004;
            this.mortality2005 = mortality2005;
            this.mortality2006 = mortality2006;
            this.mortality2007 = mortality2007;
            this.mortality2008 = mortality2008;
            this.mortality2009 = mortality2009;
            this.mortality2010 = mortality2010;
            this.mortality2011 = mortality2011;
            this.mortality2012 = mortality2012;
            this.mortality2013 = mortality2013;
            this.mortality2014 = mortality2014;
            this.mortality2015 = mortality2015;
            this.mortality2016 = mortality2016;
            this.mortality2017 = mortality2017;
            this.mortality2018 = mortality2018;
            this.mortality2019 = mortality2019;
            this.mortality2020 = mortality2020;
            this.mortality2021 = mortality2021;
        }

        public MortalityEntity(String countryName, String mortalityIndicatorName, double mortality1980, double mortality1981, double mortality1982, double mortality1983, double mortality1984, double mortality1985, double mortality1986, double mortality1987, double mortality1988, double mortality1989, double mortality1990, double mortality1991, double mortality1992, double mortality1993, double mortality1994, double mortality1995, double mortality1996, double mortality1997, double mortality1998, double mortality1999, double mortality2000, double mortality2001, double mortality2002, double mortality2003, double mortality2004, double mortality2005, double mortality2006, double mortality2007, double mortality2008, double mortality2009, double mortality2010, double mortality2011, double mortality2012, double mortality2013, double mortality2014, double mortality2015, double mortality2016, double mortality2017, double mortality2018, double mortality2019, double mortality2020, double mortality2021) {
            CountryName = countryName;
            this.mortalityIndicatorName = mortalityIndicatorName;
            this.mortality1980 = mortality1980;
            this.mortality1981 = mortality1981;
            this.mortality1982 = mortality1982;
            this.mortality1983 = mortality1983;
            this.mortality1984 = mortality1984;
            this.mortality1985 = mortality1985;
            this.mortality1986 = mortality1986;
            this.mortality1987 = mortality1987;
            this.mortality1988 = mortality1988;
            this.mortality1989 = mortality1989;
            this.mortality1990 = mortality1990;
            this.mortality1991 = mortality1991;
            this.mortality1992 = mortality1992;
            this.mortality1993 = mortality1993;
            this.mortality1994 = mortality1994;
            this.mortality1995 = mortality1995;
            this.mortality1996 = mortality1996;
            this.mortality1997 = mortality1997;
            this.mortality1998 = mortality1998;
            this.mortality1999 = mortality1999;
            this.mortality2000 = mortality2000;
            this.mortality2001 = mortality2001;
            this.mortality2002 = mortality2002;
            this.mortality2003 = mortality2003;
            this.mortality2004 = mortality2004;
            this.mortality2005 = mortality2005;
            this.mortality2006 = mortality2006;
            this.mortality2007 = mortality2007;
            this.mortality2008 = mortality2008;
            this.mortality2009 = mortality2009;
            this.mortality2010 = mortality2010;
            this.mortality2011 = mortality2011;
            this.mortality2012 = mortality2012;
            this.mortality2013 = mortality2013;
            this.mortality2014 = mortality2014;
            this.mortality2015 = mortality2015;
            this.mortality2016 = mortality2016;
            this.mortality2017 = mortality2017;
            this.mortality2018 = mortality2018;
            this.mortality2019 = mortality2019;
            this.mortality2020 = mortality2020;
            this.mortality2021 = mortality2021;
        }

}
