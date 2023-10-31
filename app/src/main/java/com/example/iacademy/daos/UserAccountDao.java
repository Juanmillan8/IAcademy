package com.example.iacademy.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.iacademy.models.UserAccount;

import java.util.List;

@Dao
public interface UserAccountDao {

    @Insert
    long insertUser(UserAccount userAccount);

    @Update
    void updateUser(UserAccount userAccount);

    @Delete
    void deleteUser(UserAccount userAccount);

    @Query("SELECT * FROM UserAccount")
    List<UserAccount> getAll();



}
