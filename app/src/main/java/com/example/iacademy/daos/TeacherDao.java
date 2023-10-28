package com.example.iacademy.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.iacademy.models.Teacher;

import java.util.List;

@Dao
public interface TeacherDao {


    @Insert
    long insertTeacher(Teacher teacher);

    @Update
    void updateTeacher(Teacher teacher);

    @Delete
    void deleteTeacher(Teacher teacher);

    @Query("SELECT * FROM teacher")
    List<Teacher> getAll();



}
