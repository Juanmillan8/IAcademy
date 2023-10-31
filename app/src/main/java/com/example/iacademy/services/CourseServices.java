package com.example.iacademy.services;

import android.app.Application;

import com.example.iacademy.daos.CourseDao;
import com.example.iacademy.database.DatabaseHelper;
import com.example.iacademy.models.Course;

import java.util.List;

public class CourseServices implements CourseDao {

    private CourseDao courseDao;

    public CourseServices(Application application){
        DatabaseHelper db = DatabaseHelper.getInstance(application);
        courseDao = db.courseDao();
    }

    @Override
    public long insertCourse(Course course) {
        return courseDao.insertCourse(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }

    @Override
    public void deleteCourse(Course course) {
        courseDao.deleteCourse(course);
    }

    @Override
    public List<Course> getAll() {
        return courseDao.getAll();
    }
}
