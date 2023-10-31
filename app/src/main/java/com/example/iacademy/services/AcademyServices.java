package com.example.iacademy.services;

import android.app.Application;

import androidx.room.Database;

import com.example.iacademy.daos.AcademyDao;
import com.example.iacademy.database.DatabaseHelper;
import com.example.iacademy.models.Academy;

import java.util.List;

public class AcademyServices implements AcademyDao{

    private AcademyDao academyDao;

    public AcademyServices(Application application){
        DatabaseHelper db = DatabaseHelper.getInstance(application);
        academyDao = db.academyDao();
    }

    @Override
    public long insertAcademy(Academy academy) {
        return academyDao.insertAcademy(academy);
    }

    @Override
    public void updateAcademy(Academy academy) {

        academyDao.updateAcademy(academy);
    }

    @Override
    public void deleteAcademy(Academy academy) {

        academyDao.deleteAcademy(academy);
    }

    @Override
    public List<Academy> getAll() {
        return academyDao.getAll();
    }
}
