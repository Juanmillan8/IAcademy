package com.example.iacademy.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.iacademy.models.Student;

import java.util.List;

@Dao
public interface StudentDao {


    @Insert
    long insertEstudiante(Student estudiante);

    @Update
    void updateEstudiante(Student estudiante);

    @Delete
    void DeleteEstudiante(Student estudiante);

    @Query("SELECT * FROM Student")
    List<Student> getAll();

}
