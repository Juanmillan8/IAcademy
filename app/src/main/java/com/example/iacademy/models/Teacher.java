package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "Teacher", foreignKeys = @ForeignKey(entity = Academy.class, parentColumns = "id",
        childColumns = "academy_id", onDelete = ForeignKey.CASCADE))
public class Teacher extends Person{

    @ColumnInfo(name = "number")
    private String number;

    @ColumnInfo(name = "dni")
    private String dni;

    @ColumnInfo(name = "address")
    private String address;

    @ColumnInfo(name = "academy_id")
    private long academy_id;

    public Teacher() {
        super();
    }

    public long getAcademy_id() {
        return academy_id;
    }

    public void setAcademy_id(long academy_id) {
        this.academy_id = academy_id;
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

    public String getNumber() {
        return number;
    }

    public String getDni() {
        return dni;
    }

    public String getAddress() {
        return address;
    }

}
