package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity
public abstract class Person {

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "surNames")
    private  String surNames;

    @ColumnInfo(name = "email")
    private String email;

    public Person(String name, String surNames, String email) {
        this.name = name;
        this.surNames = surNames;
        this.email = email;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getSurNames() {
        return surNames;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurNames(String surNames) {
        this.surNames = surNames;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
