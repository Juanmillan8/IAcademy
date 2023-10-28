package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Manager")
public class Manager {

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "surNames")
    private String surNames;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "dni")
    private String dni;

    @ColumnInfo(name = "number")
    private String number;

    @PrimaryKey(autoGenerate = true)
    private long id;

    public Manager(String name, String surNames, String email, String dni, String number){
        this.name=name;
        this.surNames=surNames;
        this.email=email;
        this.dni=dni;
        this.number=number;



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

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public String getDni() {
        return dni;
    }

    public String getNumber() {
        return number;
    }

    public long getId() {
        return id;
    }
}
