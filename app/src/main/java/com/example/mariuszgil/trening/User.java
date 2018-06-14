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


    @ColumnInfo(name = "weight1b")
    private String weight1b;

    @ColumnInfo(name = "weight2b")
    private String weight2b;

    @ColumnInfo(name = "weight3b")
    private String weight3b;

    @ColumnInfo(name = "weight4b")
    private String weight4b;

    @ColumnInfo(name = "weight5b")
    private String weight5b;

    @ColumnInfo(name = "weight6b")
    private String weight6b;

    @ColumnInfo(name = "weight7b")
    private String weight7b;

    @ColumnInfo(name = "weekb")
    private String weekb;



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

    public String getWeight1b() {
        return weight1b;
    }

    public void setWeight1b(String weight1b) {
        this.weight1b = weight1b;
    }

    public String getWeight2b() {
        return weight2b;
    }

    public void setWeight2b(String weight2b) {
        this.weight2b = weight2b;
    }

    public String getWeight3b() {
        return weight3b;
    }

    public void setWeight3b(String weight3b) {
        this.weight3b = weight3b;
    }

    public String getWeight4b() {
        return weight4b;
    }

    public void setWeight4b(String weight4b) {
        this.weight4b = weight4b;
    }

    public String getWeight5b() {
        return weight5b;
    }

    public void setWeight5b(String weight5b) {
        this.weight5b = weight5b;
    }

    public String getWeight6b() {
        return weight6b;
    }

    public void setWeight6b(String weight6b) {
        this.weight6b = weight6b;
    }

    public String getWeight7b() {
        return weight7b;
    }

    public void setWeight7b(String weight7b) {
        this.weight7b = weight7b;
    }

    public String getWeekb() {
        return weekb;
    }

    public void setWeekb(String weekb) {
        this.weekb = weekb;
    }
}
