package com.example.iacademy.services;

import android.app.Application;

import com.example.iacademy.database.DatabaseHelper;
import com.example.iacademy.models.Inscription;

import java.util.List;

public class InscriptionServices implements com.example.iacademy.daos.InscriptionDao {

    private com.example.iacademy.daos.InscriptionDao inscriptionDao;

    public InscriptionServices(Application application) {

        DatabaseHelper db = DatabaseHelper.getInstance(application);
        inscriptionDao = db.inscriptionDao();

    }


    @Override
    public long insertInscription(Inscription inscription) {

        inscriptionDao.insertInscription(inscription);

        return 0;
    }

    @Override
    public void updateInscription(Inscription inscription) {

        inscriptionDao.updateInscription(inscription);

    }

    @Override
    public void deleteInscription(Inscription inscription) {

        inscriptionDao.deleteInscription(inscription);

    }

    @Override
    public List<com.example.iacademy.daos.InscriptionDao> getAll() {
        return null;
    }
}
