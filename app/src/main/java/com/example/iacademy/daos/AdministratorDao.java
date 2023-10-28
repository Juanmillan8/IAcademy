package com.example.iacademy.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.iacademy.models.Administrator;

import java.util.List;

@Dao
public interface AdministratorDao {

    @Insert
    long insertAdministrator(Administrator administrator);

    @Update
    void updateAdministrator(Administrator administrator);

    @Delete
    void deleteAdministrator(Administrator administrator);

    @Query("SELECT * FROM administrator")
    List<Administrator> getAll();



}
