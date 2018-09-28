package com.example.test_db;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = User.class, version = 1)
public abstract class UserDB extends RoomDatabase {

    public abstract UserDAO userDAO();
}
