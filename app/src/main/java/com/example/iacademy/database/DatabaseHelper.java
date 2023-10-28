package com.example.iacademy.database;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.example.iacademy.daos.AdministratorDao;
import com.example.iacademy.daos.ManagerDao;
import com.example.iacademy.daos.TeacherDao;
import com.example.iacademy.daos.UserDao;
import com.example.iacademy.models.Administrator;
import com.example.iacademy.models.Manager;
import com.example.iacademy.models.Teacher;
import com.example.iacademy.models.User;

@Database(entities = {Administrator.class, Manager.class, Teacher.class, User.class}, version = 1)
public abstract class DatabaseHelper extends RoomDatabase{


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
