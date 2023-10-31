package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "Classroom")
public class Classroom {

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "capacity")
    private long capacity;

    public Classroom(String name, long capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public long getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(long capacity) {
        this.capacity = capacity;
    }
}
