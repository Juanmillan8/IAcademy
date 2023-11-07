package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity(tableName = "Lesson")
public class Lesson extends DomainEntity{

    @ColumnInfo(name = "lessonDate")
    private LocalDate lessonDate;

    @ColumnInfo(name = "lessonHour")
    private LocalTime lessonHour;

    public Lesson() {

        super();

    }

    public LocalDate getLessonDate() {
        return lessonDate;
    }

    public LocalTime getLessonHour() {
        return lessonHour;
    }

    public void setLessonDate(LocalDate lessonDate) {
        this.lessonDate = lessonDate;
    }

    public void setLessonHour(LocalTime lessonHour) {
        this.lessonHour = lessonHour;
    }
}
