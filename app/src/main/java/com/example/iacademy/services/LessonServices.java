package com.example.iacademy.services;

import android.app.Application;

import com.example.iacademy.daos.LessonDao;
import com.example.iacademy.database.DatabaseHelper;
import com.example.iacademy.models.Lesson;

import java.util.List;

public class LessonServices implements LessonDao {

    private LessonDao lessonDao;

    public LessonServices(Application application){

        DatabaseHelper db = DatabaseHelper.getInstance(application);
        lessonDao = db.lessonDao();
    }
    @Override
    public long insertLesson(Lesson lesson) {
        return lessonDao.insertLesson(lesson);
    }

    @Override
    public void updateLesson(Lesson lesson) {

        lessonDao.updateLesson(lesson);
    }

    @Override
    public void deleteLesson(Lesson lesson) {

        lessonDao.deleteLesson(lesson);
    }

    @Override
    public List<Lesson> getAll() {
        return lessonDao.getAll();
    }
}
