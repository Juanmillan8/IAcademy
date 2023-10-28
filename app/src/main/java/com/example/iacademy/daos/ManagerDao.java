package com.example.iacademy.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.iacademy.models.Manager;

import java.util.List;

@Dao
public interface ManagerDao {

    @Insert
    long insertManager(Manager manager);

    @Update
    void updateManager(Manager manager);

    @Delete
    void deleteManager(Manager manager);

    @Query("SELECT * FROM manager")
    List<Manager> getAll();


}
