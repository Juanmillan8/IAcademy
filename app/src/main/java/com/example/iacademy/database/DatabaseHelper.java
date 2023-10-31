package com.example.iacademy.database;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.example.iacademy.daos.AcademyDao;
import com.example.iacademy.daos.AdministratorDao;
import com.example.iacademy.daos.ClassroomDao;
import com.example.iacademy.daos.CourseDao;
import com.example.iacademy.daos.InscriptionDao;
import com.example.iacademy.daos.LessonDao;
import com.example.iacademy.daos.ManagerDao;
import com.example.iacademy.daos.StudentDao;
import com.example.iacademy.daos.TeacherDao;
import com.example.iacademy.daos.UserDao;
import com.example.iacademy.models.Academy;
import com.example.iacademy.models.Administrator;
import com.example.iacademy.models.Classroom;
import com.example.iacademy.models.Course;
import com.example.iacademy.models.Inscription;
import com.example.iacademy.models.Lesson;
import com.example.iacademy.models.Manager;
import com.example.iacademy.models.Student;
import com.example.iacademy.models.Teacher;
import com.example.iacademy.models.User;

@Database(entities = {Administrator.class, Manager.class, Teacher.class, User.class, Classroom.class, Inscription.class, Student.class, Academy.class, Course.class, Lesson.class}, version = 1)
public abstract class DatabaseHelper extends RoomDatabase{

    public abstract AcademyDao academyDao();

    public abstract CourseDao courseDao();

    public abstract LessonDao lessonDao();
    public abstract ClassroomDao classroomDao();

    public abstract InscriptionDao inscriptionDao();

    public abstract StudentDao studentDao();

    public abstract AdministratorDao administratorDao();
    public abstract ManagerDao managerDao();

    public abstract TeacherDao teacherDao();

    public abstract UserDao userDao();

    // Instancia estática de la clase, para poder usarla en toda la aplicación
    private static DatabaseHelper instance;

    // Método de Android Room para crear la base de datos
    public static synchronized DatabaseHelper getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), DatabaseHelper.class, "iAcademy")
                    .fallbackToDestructiveMigration() // Si se cambia la versión elimina y reconstruye
                    .build();
        }
        return instance;
    }

    @Override
    public void clearAllTables() {

    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(@NonNull DatabaseConfiguration databaseConfiguration) {
        return null;
    }

}
