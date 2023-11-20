package com.example.iacademy.services;

import android.app.Application;

import com.example.iacademy.database.DatabaseHelper;

import java.util.List;

public class InscriptionServices implements com.example.iacademy.daos.InscriptionDao {

    private com.example.iacademy.daos.InscriptionDao inscriptionDao;

    public InscriptionServices(Application application) {

        DatabaseHelper db = DatabaseHelper.getInstance(application);
        inscriptionDao = db.inscriptionDao();

    }
    @Override
    public long insertInscription(com.example.iacademy.daos.InscriptionDao matricula) {
        return 0;
    }

    @Override
    public void updateInscription(com.example.iacademy.daos.InscriptionDao matricula) {

    }

    @Override
    public void deleteInscription(com.example.iacademy.daos.InscriptionDao matricula) {

    }

    @Override
    public List<com.example.iacademy.daos.InscriptionDao> getAll() {
        return null;
    }
}
