package com.example.mariuszgil.trening;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by mariuszgil on 27.03.2018.
 */

@Database(entities = {TreningBase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase{
    public abstract TreningBaseDao treningBaseDao();
}
