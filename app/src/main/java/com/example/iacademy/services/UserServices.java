package com.example.iacademy.services;

import android.app.Application;

import com.example.iacademy.daos.UserDao;
import com.example.iacademy.database.DatabaseHelper;
import com.example.iacademy.models.User;

import java.util.List;

public class UserServices {

    private UserDao userDao;

    public UserServices(Application application) {

        DatabaseHelper db = DatabaseHelper.getInstance(application);
        userDao = db.userDao();

    }

    @Override
    public long insertUser(User user) {
        return userDao.insertUser(user);
    }

    @Override
    public void updateUser(User user) {

        userDao.updateUser(user);

    }

    @Override
    public void deleteUser(User user) {

        userDao.deleteUser(user);

    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }


}
