package com.pillpackclone.familymanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity // * this class mapped to any db
public class User implements Serializable { // + transforms this class into different types of strings (db to json..)
    @Id // ! ENTITY NEEDS PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.AUTO) // ? how to gen this info, pass in strategy to be specific
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    @Column(nullable = false, updatable = false) // ! once set cannot be updated
    private String phoneNumber;
    private String imageUrl;

    public User() {}

    public User(String name, String email, String phoneNumber, String imageUrl) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.imageUrl = imageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phoneNumber + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}
