package com.example.iacademy.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.iacademy.models.Lesson;

import java.util.List;

@Dao
public interface LessonDao {

    @Insert
    long insertLesson(Lesson lesson);

    @Update
    void updateLesson(Lesson lesson);

    @Delete
    void deleteLesson(Lesson lesson);

    @Query("SELECT * FROM lesson")
    List<Lesson> getAll();
}
