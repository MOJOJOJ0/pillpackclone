package com.pillpackclone.familymanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Insurance implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String insuranceName;
    private BigDecimal insuranceCost;
    private boolean insuranceCoverage;

    public Insurance() {}

    public Insurance(String insuranceName, BigDecimal insuranceCost, boolean insuranceCoverage) {
        this.insuranceName = insuranceName;
        this.insuranceCost = insuranceCost;
        this.insuranceCoverage = insuranceCoverage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public BigDecimal getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(BigDecimal insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public boolean getInsuranceCoverage() {
        return insuranceCoverage;
    }

    public void setInsuranceCoverage(boolean insuranceCoverage) {
        this.insuranceCoverage = insuranceCoverage;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", insurance name='" + insuranceName + '\'' +
                ", insurance cost='" + insuranceCost + '\'' +
                ", insurance coverage='" + insuranceCoverage + '\'' +
                '}';
    }
}
