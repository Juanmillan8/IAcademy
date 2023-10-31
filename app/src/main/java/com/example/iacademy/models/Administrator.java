package com.example.iacademy.models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Administrator")
public class Administrator extends Person{

    @PrimaryKey(autoGenerate = true)
    private long id;

    public Administrator(String name, String surNames, String email, long id) {
        super(name, surNames, email);
        this.id = id;
    }

    public Administrator() {
        super();
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
