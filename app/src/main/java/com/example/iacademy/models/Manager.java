package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(tableName = "Manager", foreignKeys = @ForeignKey(entity = Academy.class, parentColumns = "id",
        childColumns = "academy_id", onDelete = ForeignKey.CASCADE))
public class Manager extends Person{

    @ColumnInfo(name = "dni")
    private String dni;

    @ColumnInfo(name = "number")
    private String number;

    @ColumnInfo(name = "academy_id")
    private long academyId;

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

    public long getAcademyId() {
        return academyId;
    }

    public void setAcademyId(long academyId) {
        this.academyId = academyId;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }
}
