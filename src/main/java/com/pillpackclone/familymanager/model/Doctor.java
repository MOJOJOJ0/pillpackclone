package com.pillpackclone.familymanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Doctor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String doctorName;
    private int nextVisit;

    public Doctor() {}

    public Doctor(String doctorName, int nextVisit) {
        this.doctorName = doctorName;
        this.nextVisit = nextVisit;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", doctor name='" + doctorName + '\'' +
                ", next visit='" + nextVisit + '\'' +
                '}';
    }
}
