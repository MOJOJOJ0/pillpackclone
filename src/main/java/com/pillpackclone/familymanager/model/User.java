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

}
