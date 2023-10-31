package com.example.iacademy.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.iacademy.models.Academy;

import java.util.List;

@Dao
public interface AcademyDao {

    @Insert
    long insertAcademy(Academy academy);

    @Update
    void updateAcademy(Academy academy);

    @Delete
    void deleteAcademy(Academy academy);

    @Query("SELECT * FROM academy")
    List<Academy> getAll();
}
