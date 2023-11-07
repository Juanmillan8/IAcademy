package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(tableName = "Classroom")
public class Classroom extends DomainEntity{

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "capacity")
    private long capacity;

    public Classroom() {
        super();
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
