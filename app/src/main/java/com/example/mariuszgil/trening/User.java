package com.example.mariuszgil.trening;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "user")
public class User {


    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "weight")
    private String weight;


    @ColumnInfo(name = "exercise")
    private String exercise;

    @ColumnInfo(name = "week")
    private String week;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }



}
