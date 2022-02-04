package com.pillpackclone.familymanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;


// ! Serialization in Java allows us to convert an
// ! Object to stream that we can send over the network or save it as file or store in DB for later usage.

@Entity // * this class mapped to any db
public class Doctor implements Serializable { // ! transforms this class into different types of strings (db to json..)
    @Id // ! ENTITY NEEDS PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.AUTO) // ! how to gen this info, pass in strategy to be specific
    @Column(nullable = false, updatable = false)
    private Long id;
    private String doctorName;
    private int nextVisit;
    //@Column(nullable = false, updatable = false) // ! once set cannot be updated
   // private boolean insuranceCoverage;
    //private String imageUrl;

    public Doctor() {}

    public Doctor(String doctorName, int nextVisit) {
        this.doctorName = doctorName;
        this.nextVisit = nextVisit;
       // this.insuranceCoverage = insuranceCoverage;
        //this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getNextVisit() {
        return nextVisit;
    }

    public void setNextVisit(int nextVisit) {
        this.nextVisit = nextVisit;
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
                ", doctor name='" + doctorName + '\'' +
                ", next visit='" + nextVisit + '\'' +
               // ", insurance coverage='" + insuranceCoverage + '\'' +
//                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
