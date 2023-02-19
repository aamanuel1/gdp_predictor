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
@Table(name = "data")
public class CombinedDataEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "country_id")
    private Long countryID;


//    @JsonIgnore
//    @OneToOne(mappedBy = "country", cascade = CascadeType.ALL)
//    @PrimaryKeyJoinColumn
    private String countryName;

    private String countryCode;

    public CombinedDataEntity(String countryName, String countryCode){
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

    public CombinedDataEntity(Long countryID, String countryName, String countryCode){
        this.countryID = countryID;
        this.countryName = countryName;
        this.countryCode = countryCode;
    }

}
