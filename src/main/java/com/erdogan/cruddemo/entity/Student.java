package com.erdogan.cruddemo.entity;


import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")

    private int id;

    private String firsName;


}
