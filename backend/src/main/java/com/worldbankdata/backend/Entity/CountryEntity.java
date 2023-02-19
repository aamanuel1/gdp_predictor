package com.worldbankdata.backend.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "countries")
public class CountryEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "country_id")
    private Long countryID;


//    @JsonIgnore
//    @OneToOne(mappedBy = "country", cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
    private String countryName;

    private String countryCode;

    public CountryEntity(String countryName, String countryCode){
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public CountryEntity(Long countryID, String countryName, String countryCode){
        this.countryID = countryID;
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

}
