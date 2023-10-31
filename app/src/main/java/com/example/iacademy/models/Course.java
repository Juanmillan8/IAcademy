package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.time.LocalDate;

//título, descripción, nivel, capacidad de matrículas, fecha de inicio de
//matriculación, fecha de fin de matriculación, y si está activado o no
@Entity(tableName = "Course")
public class Course {

    @ColumnInfo(name = "title")
    private String title;

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "level")
     private String level;

    @ColumnInfo(name = "capacity")
     private int capacity;

    @ColumnInfo(name = "startDate")
     private LocalDate startDate;

    @ColumnInfo(name = "endDate")
    private LocalDate endDate;

    @ColumnInfo(name = "activated")
    private boolean activated;

    @PrimaryKey(autoGenerate = true)
    private long id;

    public Course(String title, String description, String level, int capacity, LocalDate startDate, LocalDate endDate, boolean active) {
        this.title = title;
        this.description = description;
        this.level = level;
        this.capacity = capacity;
        this.startDate = startDate;
        this.endDate = endDate;
        this.activated = active;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLevel() {
        return level;
    }

    public int getCapacity() {
        return capacity;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public boolean isActivated() {
        return activated;
    }

    public long getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public void setId(long id) {
        this.id = id;
    }
}
