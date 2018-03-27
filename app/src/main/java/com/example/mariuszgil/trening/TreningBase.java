package com.example.mariuszgil.trening;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;

/**
 * Created by mariuszgil on 26.03.2018.
 */

@Entity
public class TreningBase {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo (name = "nazwa_cwiczenie")
    public  String nazwaCwiczenia;

    @ColumnInfo (name = "wartosc_obciazenia")
    public String wartoscObciazenia;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
