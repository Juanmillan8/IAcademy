package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Teacher")
public class Teacher {

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "surNames")
    private String surNames;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "number")
    private String number;

    @ColumnInfo(name = "dni")
    private String dni;

    @ColumnInfo(name = "address")
    private String address;

    @PrimaryKey(autoGenerate = true)
    private long id;

    public Teacher(String name, String surNames, String email, String number, String dni, String address){
        this.name=name;
        this.surNames=surNames;
        this.email=email;
        this.number=number;
        this.dni=dni;
        this.address=address;



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

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getNumber() {
        return number;
    }

    public String getDni() {
        return dni;
    }

    public String getAddress() {
        return address;
    }

    public long getId() {
        return id;
    }
}
