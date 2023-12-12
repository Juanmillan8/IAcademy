package com.example.iacademy.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.iacademy.models.Inscription;

import java.util.List;

@Dao
public interface InscriptionDao {

    @Insert
    long insertMatricula(Inscription matricula);

    @Update
    void updateMatricula(Inscription matricula);

    @Delete
    void deleteMatricula(Inscription matricula);

    @Query("SELECT * FROM Inscription")
    List<Inscription> getAll();


}
