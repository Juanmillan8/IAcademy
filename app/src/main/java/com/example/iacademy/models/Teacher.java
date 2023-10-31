package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Teacher")
public class Teacher extends Person{

    @ColumnInfo(name = "number")
    private String number;

    @ColumnInfo(name = "dni")
    private String dni;

    @ColumnInfo(name = "address")
    private String address;

    @PrimaryKey(autoGenerate = true)
    private long id;


    public Teacher(String name, String surNames, String email, String number, String dni, String address, long id) {
        super(name, surNames, email);
        this.number = number;
        this.dni = dni;
        this.address = address;
        this.id = id;
    }

    public Teacher() {
        super();
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
