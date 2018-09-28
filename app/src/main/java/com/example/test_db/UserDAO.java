package com.example.test_db;

        import android.arch.persistence.room.Dao;
        import android.arch.persistence.room.Delete;
        import android.arch.persistence.room.Insert;

@Dao
public interface UserDAO {

    @Insert
    public void AddUser(User user);

    @Delete
    public void DeleteUser(User user);
}
