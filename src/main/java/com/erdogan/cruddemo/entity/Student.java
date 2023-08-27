package com.erdogan.cruddemo.entity;


import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "id")

    private int id;

    @Column(name = "first_name")
    private String firsName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    // define constructor

    public Student(){

    }

    public Student(String firsName, String lastName, String email) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.email = email;
    }

    // define getters/setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // define toString() method


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
