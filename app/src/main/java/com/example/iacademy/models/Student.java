package com.example.iacademy.models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "Student")
public class Student extends Person{

    @ColumnInfo(name = "number")
    private String number;

    @ColumnInfo(name = "dni")
    private String dni;

    @ColumnInfo(name = "familynumber")
    private String familynumber;

    @ColumnInfo(name = "birthdate")
    private String birthdate;

    public Student() {
        super();
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setFamilynumber(String familynumber) {
        this.familynumber = familynumber;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getNumber() {
        return number;
    }

    public String getDni() {
        return dni;
    }

    public String getFamilynumber() {
        return familynumber;
    }

    public String getBirthdate() {
        return birthdate;
    }




}
