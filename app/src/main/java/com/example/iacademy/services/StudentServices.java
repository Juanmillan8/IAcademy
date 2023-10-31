package com.example.iacademy.services;

import android.app.Application;

import com.example.iacademy.daos.StudentDao;
import com.example.iacademy.database.DatabaseHelper;
import com.example.iacademy.models.Student;

import java.util.List;

public class StudentServices implements StudentDao {

    private StudentDao studentDao;

    public StudentServices(Application application) {

        DatabaseHelper db = DatabaseHelper.getInstance(application);
        studentDao = db.studentDao();

    }
    @Override
    public long insertEstudiante(Student estudiante) {
        return 0;
    }

    @Override
    public void updateEstudiante(Student estudiante) {

    }

    @Override
    public void DeleteEstudiante(Student estudiante) {

    }

    @Override
    public List<Student> getAll() {
        return null;
    }
}
