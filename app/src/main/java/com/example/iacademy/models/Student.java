package com.example.iacademy.models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "Student")
public class Student {

    @ColumnInfo(name ="name")
    private String name;

    @ColumnInfo(name = "surname")
    private String surname;

    @ColumnInfo(name = "email")
    private String email;

    @ColumnInfo(name = "number")
    private String number;

    @ColumnInfo(name = "dni")
    private String dni;

    @ColumnInfo(name = "familynumber")
    private String familynumber;

    @ColumnInfo(name = "birthdate")
    private String birthdate;

    public Student(String name, String surname, String email, String number, String dni, String familynumber, String birthdate) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.number = number;
        this.dni = dni;
        this.familynumber = familynumber;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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

    public String getFamilynumber() {
        return familynumber;
    }

    public String getBirthdate() {
        return birthdate;
    }


}
