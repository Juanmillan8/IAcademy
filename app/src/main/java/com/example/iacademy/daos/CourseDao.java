package com.example.iacademy.daos;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.iacademy.models.Course;

import java.util.List;

public interface CourseDao {

    @Insert
    long insertCourse(Course course);

    @Update
    void updateCourse(Course course);

    @Delete
    void deleteCourse(Course course);

    @Query("SELECT * FROM course")
    List<Course> getAll();

}
