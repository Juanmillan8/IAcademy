package com.example.iacademy.models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Administrator")
public class Administrator {

    @ColumnInfo(name = "mame")
    private String name;

    @ColumnInfo(name = "surNames")
    private  String surNames;

    @ColumnInfo(name = "email")
    private String email;

    @PrimaryKey(autoGenerate = true)
    private long id;

    public Administrator(String name, String surNames, String email){
        this.name=name;
        this.surNames=surNames;
        this.email=email;


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

    public long getId() {
        return id;
    }
}
