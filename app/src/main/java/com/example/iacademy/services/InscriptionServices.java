package com.example.iacademy.services;

import android.app.Application;

import com.example.iacademy.daos.InscriptionDao;
import com.example.iacademy.database.DatabaseHelper;
import com.example.iacademy.models.Inscription;

import java.util.List;

public class InscriptionServices implements InscriptionDao {


    public InscriptionServices(Application application) {

        DatabaseHelper db = DatabaseHelper.getInstance(application);

    }
    @Override
    public long insertMatricula(Inscription matricula) {
        return 0;
    }

    @Override
    public void updateMatricula(Inscription matricula) {

    }

    @Override
    public void deleteMatricula(Inscription matricula) {

    }

    @Override
    public long insertInscription(Inscription inscription) {
        return 0;
    }

    @Override
    public void updateInscription(Inscription inscription) {

    }

    @Override
    public void deleteInscription(Inscription inscription) {

    }

    @Override
    public List<Inscription> getAll() {
        return null;
    }
}