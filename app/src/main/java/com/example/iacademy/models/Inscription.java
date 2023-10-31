package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

import java.time.LocalDateTime;

@Entity(tableName = "Inscription")
public class Inscription {

    @ColumnInfo(name = "registrationTime")
    private LocalDateTime registrationTime;

    public Inscription(LocalDateTime registrationTime) {
        this.registrationTime = registrationTime;
    }

    public LocalDateTime getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(LocalDateTime registrationTime) {
        this.registrationTime = registrationTime;
    }
}