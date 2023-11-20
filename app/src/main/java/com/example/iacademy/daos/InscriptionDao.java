package com.example.iacademy.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.iacademy.models.Course;
import com.example.iacademy.models.Inscription;

import java.util.List;

@Dao
public interface InscriptionDao {

    @Insert
    long insertInscription(Inscription inscription);

    @Update
    void updateInscription(Inscription inscription);

    @Delete
    void deleteInscription(Inscription inscription);

    @Query("SELECT * FROM inscription")
    List<Inscription> getAll();


}
