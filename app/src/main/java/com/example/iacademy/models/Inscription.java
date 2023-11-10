package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import java.time.LocalDateTime;

@Entity(tableName = "Inscription", foreignKeys = {@ForeignKey(entity = Student.class, parentColumns = "id",
        childColumns = "student_id", onDelete = ForeignKey.CASCADE), @ForeignKey(entity = Course.class, parentColumns = "id",
        childColumns = "course_id", onDelete = ForeignKey.CASCADE)})
public class Inscription extends DomainEntity{
    @ColumnInfo(name = "registrationTime")
    private LocalDateTime registrationTime;

    @ColumnInfo(name = "course_id")
    private long courseId;

    @ColumnInfo(name = "student_id")
    private long studentId;


    public Inscription() {

        super();

    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public LocalDateTime getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(LocalDateTime registrationTime) {
        this.registrationTime = registrationTime;
    }
}
