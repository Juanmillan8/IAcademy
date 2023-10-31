package com.example.iacademy.services;

import android.app.Application;

import com.example.iacademy.daos.UserAccountDao;
import com.example.iacademy.database.DatabaseHelper;
import com.example.iacademy.models.UserAccount;

import java.util.List;

public class UserAccountServices implements UserAccountDao {

    private UserAccountDao userAccountDao;

    public UserAccountServices(Application application) {

        DatabaseHelper db = DatabaseHelper.getInstance(application);
        userAccountDao = db.UserAccountDao();

    }

    @Override
    public long insertUser(UserAccount userAccount) {
        return userAccountDao.insertUser(userAccount);
    }

    @Override
    public void updateUser(UserAccount userAccount) {

        userAccountDao.updateUser(userAccount);

    }

    @Override
    public void deleteUser(UserAccount userAccount) {

        userAccountDao.deleteUser(userAccount);

    }

    @Override
    public List<UserAccount> getAll() {
        return userAccountDao.getAll();
    }


}
