package com.example.iacademy.services;

import android.app.Application;

import com.example.iacademy.daos.AdministratorDao;
import com.example.iacademy.database.DatabaseHelper;
import com.example.iacademy.models.Administrator;

import java.util.List;

public class AdministratorServices implements AdministratorDao {

    private AdministratorDao administratorDao;

    public AdministratorServices(Application application) {

        DatabaseHelper db = DatabaseHelper.getInstance(application);
        administratorDao = db.administratorDao();

    }

        @Override
        public long insertAdministrator(Administrator administrator) {
            return administratorDao.insertAdministrator(administrator);
        }

        @Override
        public void updateAdministrator(Administrator administrator) {

            administratorDao.updateAdministrator(administrator);

        }

        @Override
        public void deleteAdministrator(Administrator administrator) {

            administratorDao.deleteAdministrator(administrator);

        }

        @Override
        public List<Administrator> getAll() {
            return administratorDao.getAll();
        }

    }


