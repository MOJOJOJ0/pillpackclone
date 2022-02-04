package com.pillpackclone.familymanager.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
public class Meds implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String medsName;
    private BigDecimal medsCost;

    public Meds() {}

    public Meds(String medsName, BigDecimal medsCost) {
        this.medsName = medsName;
        this.medsCost = medsCost;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", medicine name='" + medsName + '\'' +
                ", medication cost='" + medsCost + '\'' +
                '}';
    }
}
