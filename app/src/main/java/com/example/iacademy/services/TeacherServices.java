package com.example.iacademy.services;

import android.app.Application;

import com.example.iacademy.daos.TeacherDao;
import com.example.iacademy.database.DatabaseHelper;
import com.example.iacademy.models.Teacher;

import java.util.List;

public class TeacherServices implements TeacherDao {

    private TeacherDao teacherDao;

    public TeacherServices(Application application) {

        DatabaseHelper db = DatabaseHelper.getInstance(application);
        teacherDao = db.teacherDao();

    }

    @Override
    public long insertTeacher(Teacher teacher) {
        return teacherDao.insertTeacher(teacher);
    }

    @Override
    public void updateTeacher(Teacher teacher) {

        teacherDao.updateTeacher(teacher);

    }

    @Override
    public void deleteTeacher(Teacher teacher) {

        teacherDao.deleteTeacher(teacher);

    }

    @Override
    public List<Teacher> getAll() {
        return teacherDao.getAll();
    }


}
