package com.example.iacademy.services;

import android.app.Application;

import com.example.iacademy.daos.AdministratorDao;
import com.example.iacademy.daos.ManagerDao;
import com.example.iacademy.database.DatabaseHelper;
import com.example.iacademy.models.Manager;

import java.util.List;

public class ManagerServices implements ManagerDao {

    private ManagerDao managerDao;

    public ManagerServices(Application application) {

        DatabaseHelper db = DatabaseHelper.getInstance(application);
        managerDao = db.managerDao();

    }

    @Override
    public long insertManager(Manager manager) {
        return managerDao.insertManager(manager);
    }

    @Override
    public void updateManager(Manager manager) {

        managerDao.updateManager(manager);

    }

    @Override
    public void deleteManager(Manager manager) {

        managerDao.deleteManager(manager);

    }

    @Override
    public List<Manager> getAll() {
        return managerDao.getAll();
    }

}
