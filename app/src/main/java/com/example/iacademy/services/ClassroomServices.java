package com.example.iacademy.services;

import android.app.Application;

import com.example.iacademy.daos.ClassroomDao;
import com.example.iacademy.database.DatabaseHelper;
import com.example.iacademy.models.Classroom;

import java.util.List;

public class ClassroomServices implements ClassroomDao {

    private ClassroomDao classroomDao;

    public ClassroomServices(Application application) {

        DatabaseHelper db = DatabaseHelper.getInstance(application);
        classroomDao = db.classroomDao();

    }
    @Override
    public long insertClassroom(Classroom classroom) {
        return 0;
    }

    @Override
    public void updateClassroom(Classroom classroom) {

    }

    @Override
    public void deleteClassroom(Classroom classroom) {

    }

    @Override
    public List<Classroom> getAll() {
        return null;
    }
}
