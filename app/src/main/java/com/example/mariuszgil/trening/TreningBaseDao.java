package com.example.mariuszgil.trening;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;

/**
 * Created by mariuszgil on 27.03.2018.
 */
@Dao
public interface TreningBaseDao {
    @Insert
    void insertNazwyCwiczen (TreningBase treningBase);

}
