package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Manager")
public class Manager extends Person{

    @ColumnInfo(name = "dni")
    private String dni;

    @ColumnInfo(name = "number")
    private String number;

    @PrimaryKey(autoGenerate = true)
    private long id;

    public Manager() {
        super();
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDni() {
        return dni;
    }

    public String getNumber() {
        return number;
    }

}
