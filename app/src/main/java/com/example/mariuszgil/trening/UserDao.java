package com.example.mariuszgil.trening;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;


import java.util.List;

@Dao
public interface UserDao {

    @Insert
    public void insertProgress(User user);


    @Query("SELECT * FROM user")
    public List<User> getProgress();

}