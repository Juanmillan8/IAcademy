package com.example.iacademy.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity(tableName = "Lesson", foreignKeys = {@ForeignKey(entity = Classroom.class, parentColumns = "id",
        childColumns = "classroom_id", onDelete = ForeignKey.CASCADE), @ForeignKey(entity = Course.class, parentColumns = "id",
        childColumns = "course_id", onDelete = ForeignKey.CASCADE)})
public class Lesson extends DomainEntity{

    @ColumnInfo(name = "lessonDate")
    private LocalDate lessonDate;

    @ColumnInfo(name = "lessonHour")
    private LocalTime lessonHour;

    @ColumnInfo(name = "course_id")
    private long courseId;

    @ColumnInfo(name = "classroom_id")
    private long studentId;

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
}
