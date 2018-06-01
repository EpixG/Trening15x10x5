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

            String wage1 = usr.getWeight1();
            String wage2 = usr.getWeight2();
            String wage3 = usr.getWeight3();
            String wage4 = usr.getWeight4();
            String wage5 = usr.getWeight5();
            String wage6 = usr.getWeight6();
            String wage7 = usr.getWeight7();
            String week = usr.getWeek();


            info = info+"\n\n"+ "tydzien: "+week +" Przysiad ze sztangą: "+wage1+"\n" + "Wiosłowanie: "+wage2+"\n"+
                            "Wyciskanie leżąc: "+wage3+"\n" + "Podciąganie na drążku podchwytem: "+ wage4+"\n"+
                            "Barki: " + wage5+"\n"+ "Biceps: " + wage6+"\n"+ "Triceps: "+wage7 +"\n";


        }

        txtInfo.setText(info);



    }





}
