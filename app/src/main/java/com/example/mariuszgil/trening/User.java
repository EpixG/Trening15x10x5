package com.example.mariuszgil.trening;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "user")
public class User {


    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "weight1")
    private String weight1;

    @ColumnInfo(name = "weight2")
    private String weight2;

    @ColumnInfo(name = "weight3")
    private String weight3;

    @ColumnInfo(name = "weight4")
    private String weight4;

    @ColumnInfo(name = "weight5")
    private String weight5;

    @ColumnInfo(name = "weight6")
    private String weight6;

    @ColumnInfo(name = "weight7")
    private String weight7;



    @ColumnInfo(name = "week")
    private String week;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }
    public String getWeight1() {
        return weight1;
    }

    public void setWeight1(String weight1) {
        this.weight1 = weight1;
    }

    public String getWeight2() {
        return weight2;
    }

    public void setWeight2(String weight2) {
        this.weight2 = weight2;
    }

    public String getWeight3() {
        return weight3;
    }

    public void setWeight3(String weight3) {
        this.weight3 = weight3;
    }

    public String getWeight4() {
        return weight4;
    }

    public void setWeight4(String weight4) {
        this.weight4 = weight4;
    }

    public String getWeight5() {
        return weight5;
    }

    public void setWeight5(String weight5) {
        this.weight5 = weight5;
    }

    public String getWeight6() {
        return weight6;
    }

    public void setWeight6(String weight6) {
        this.weight6 = weight6;
    }

    public String getWeight7() {
        return weight7;
    }

    public void setWeight7(String weight7) {
        this.weight7 = weight7;
    }







}
