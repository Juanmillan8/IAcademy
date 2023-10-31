package com.example.iacademy.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.iacademy.models.Classroom;

import java.util.List;

@Dao
public interface ClassroomDao {

    @Insert
    long insertClassroom(Classroom classroom);

    @Update
    void updateClassroom(Classroom classroom);

    @Delete
    void deleteClassroom(Classroom classroom);

    @Query("SELECT * FROM Classroom")
    List<Classroom> getAll();
}
