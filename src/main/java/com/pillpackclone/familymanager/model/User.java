package com.pillpackclone.familymanager.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity // ! this class mapped to any db
public class User implements Serializable { // ! transforms this class into different types of strings (db to json..)
    @Id // ! ENTITY NEEDS PRIMARY KEY
    @GeneratedValue(strategy = GenerationType.IDENTITY) // ! how to gen this info, pass in strategy to be specific
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String imageUrl;

}
