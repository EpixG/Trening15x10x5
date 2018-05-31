package com.example.mariuszgil.trening;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.List;

public class HistoriaView extends AppCompatActivity {

    public static AppDatabase appDatabase;

    private TextView txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historia_view);

        appDatabase = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"userDB").allowMainThreadQueries().build();


        txtInfo = findViewById(R.id.historia);

        List<User> users = HistoriaView.appDatabase.userDao().getProgress();

        String info = "";

        for (User usr: users){

            int id = usr.getId();
            String wage = usr.getWeight();
            String week = usr.getWeek();
            String exercise = usr.getExercise();

            info = info+"\n\n"+ "tydzien: "+week+ " cwiczenie: "+exercise +" "+wage+"\n";


        }

        txtInfo.setText(info);





    }





}
