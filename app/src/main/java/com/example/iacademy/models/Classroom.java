package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(tableName = "Classroom", foreignKeys = @ForeignKey(entity = Lesson.class, parentColumns = "id",
        childColumns = "lesson_id", onDelete = ForeignKey.CASCADE))
public class Classroom extends DomainEntity{

    @ColumnInfo(name = "name")
    private String name;

    @ColumnInfo(name = "capacity")
    private long capacity;

    @ColumnInfo(name = "lesson_id")
    private long lesson_id;

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
