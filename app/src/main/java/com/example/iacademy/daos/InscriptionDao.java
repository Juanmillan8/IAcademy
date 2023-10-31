package com.example.iacademy.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface InscriptionDao {

    @Insert
    long insertMatricula(InscriptionDao matricula);

    @Update
    void updateMatricula(InscriptionDao matricula);

    @Delete
    void deleteMatricula(InscriptionDao matricula);

    @Query("SELECT * FROM Inscription")
    List<InscriptionDao> getAll();


}
