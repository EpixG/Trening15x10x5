package com.example.mariuszgil.trening;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;


import java.util.List;

@Dao
public interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public void insertProgress(User user);



   // @Query("INSERT INTO user (weight1b,weight2b,weight3b,weight4b,weight5b,weight6b,weight7b) VALUES (User users)")
    //public void insertProgressb(User user);

    @Query("SELECT * FROM user")
    public List<User> getProgress();

}