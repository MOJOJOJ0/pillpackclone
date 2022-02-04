package com.pillpackclone.familymanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


// ! Serialization in Java allows us to convert an
// ! Object to stream that we can send over the network or save it as file or store in DB for later usage.

@Entity // * this class mapped to any db
public class Meds implements Serializable { // ! transforms this class into different types of strings (db to json..)
    @Id // ! ENTITY NEEDS PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.AUTO) // ! how to gen this info, pass in strategy to be specific
    @Column(nullable = false, updatable = false)
    private Long id;
    private String medsName;
    private BigDecimal medsCost;
    //@Column(nullable = false, updatable = false) // ! once set cannot be updated
    // private boolean insuranceCoverage;
    //private String imageUrl;

    public Meds() {}

    public Meds(String medsName, BigDecimal medsCost) {
        this.medsName = medsName;
        this.medsCost = medsCost;
        // this.insuranceCoverage = insuranceCoverage;
        //this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMedsName() {
        return medsName;
    }

    public void setMedsName(String medsName) {
        this.medsName = medsName;
    }

    public BigDecimal getMedsCost() {
        return medsCost;
    }

    public void setMedsCost(BigDecimal medsCost) {
        this.medsCost = medsCost;
    }

//    public boolean getInsuranceCoverage() {
//        return insuranceCoverage;
//    }
//
//    public void setInsuranceCoverage(boolean insuranceCoverage) {
//        this.insuranceCoverage = insuranceCoverage;
//    }

//    public String getImageUrl() {
//        return imageUrl;
//    }

//    public void setImageUrl(String imageUrl) {
//        this.imageUrl = imageUrl;
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", medicine name='" + medsName + '\'' +
                ", medication cost='" + medsCost + '\'' +
                // ", insurance coverage='" + insuranceCoverage + '\'' +
//                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
