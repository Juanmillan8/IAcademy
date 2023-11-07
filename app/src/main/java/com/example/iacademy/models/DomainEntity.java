package com.example.iacademy.models;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class DomainEntity {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name= "id")
    private long id;

    public DomainEntity(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
