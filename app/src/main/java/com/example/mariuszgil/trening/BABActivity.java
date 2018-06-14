package com.example.mariuszgil.trening;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.Room;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.List;

import static com.example.mariuszgil.trening.R.id.integer_number2;
import static com.example.mariuszgil.trening.R.id.zapiszTrening;

public class BABActivity extends AppCompatActivity {


    Button saveTraining;
    TextView cwiczenie1, cwiczenie2, cwiczenie3, cwiczenie4, cwiczenie5, cwiczenie6, cwiczenie7,
            waga1, waga2, waga3, waga4, waga5, waga6, waga7, tydzien;

    Button getSaveTraining;

    //plus minus butons
    int minteger2;
    int minteger8;
    int minteger3;
    int minteger4;
    int minteger5;
    int minteger6;
    int minteger7;
    int minteger9;


    public static AppDatabase appDatabase;



    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab);




        getSaveTraining = findViewById(zapiszTrening);

        //DB
        appDatabase = Room.databaseBuilder(getApplicationContext(),AppDatabase.class,"userDB").allowMainThreadQueries().build();


        getSaveTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String exerciseWeek1 = tydzien.getText().toString();
                String exerciseWeight1 = waga1.getText().toString();
                String exerciseWeight2 = waga2.getText().toString();
                String exerciseWeight3 = waga3.getText().toString();
                String exerciseWeight4 = waga4.getText().toString();
                String exerciseWeight5 = waga5.getText().toString();
                String exerciseWeight6 = waga6.getText().toString();
                String exerciseWeight7 = waga7.getText().toString();
                //int exerciseId = Integer.parseInt(tydzien.getText().toString())




                User user = new User();
                //user.setId(exerciseId);
                user.setWeekb(exerciseWeek1);
                user.setWeight1b(exerciseWeight1);
                user.setWeight2b(exerciseWeight2);
                user.setWeight3b(exerciseWeight3);
                user.setWeight4b(exerciseWeight4);
                user.setWeight5b(exerciseWeight5);
                user.setWeight6b(exerciseWeight6);
                user.setWeight7b(exerciseWeight7);

                BABActivity.appDatabase.userDao().insertProgress(user);
                displayToast2();


            }
        });


        saveTraining = (Button) findViewById(zapiszTrening);
        cwiczenie1 = (TextView) findViewById(R.id.textView);
        cwiczenie2 = (TextView) findViewById(R.id.textView2);
        cwiczenie3 = (TextView) findViewById(R.id.textView3);
        cwiczenie4 = (TextView) findViewById(R.id.textView4);
        cwiczenie5 = (TextView) findViewById(R.id.textView5);
        cwiczenie6 = (TextView) findViewById(R.id.textView6);
        cwiczenie7 = (TextView) findViewById(R.id.textView7);
        waga1 = (TextView) findViewById(R.id.phone5);
        waga2 = (TextView) findViewById(R.id.phone4);
        waga3 = (TextView) findViewById(R.id.phone6);
        waga4 = (TextView) findViewById(R.id.phone);
        waga5 = (TextView) findViewById(R.id.phone8);
        waga6 = (TextView) findViewById(R.id.phone3);
        waga7 = (TextView) findViewById(R.id.phone7);
        tydzien = (TextView) findViewById(R.id.integer_number9);


        //restoreLastWeights();


    }

    /*private void restoreLastWeights() {
        List<User> exercises = appDatabase.userDao().getProgress();
        User lastExercise = exercises.get(exercises.size() - 1);
        tydzien.setText(lastExercise.getWeek());
        waga1.setText(lastExercise.getWeight1());
        waga2.setText(lastExercise.getWeight2());
        waga3.setText(lastExercise.getWeight3());
        waga4.setText(lastExercise.getWeight4());
        waga5.setText(lastExercise.getWeight5());
        waga6.setText(lastExercise.getWeight6());
        waga7.setText(lastExercise.getWeight7());

    }
    */

    public void displayToast(){
        Context context = getApplicationContext();
        CharSequence zaMaloKG = "Nie ma ujemnego obciążenia" ;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, zaMaloKG, duration);
        toast.show();
    }

    public void displayToast2(){
        Context context = getApplicationContext();
        CharSequence zaMaloKG = "Dodano do bazy" ;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, zaMaloKG, duration);
        toast.show();
    }


    public void increaseInteger2(View view) {
        minteger2 = minteger2 + 1;
        display2(minteger2);

    }
    public void decreaseInteger2(View view) {
        if (minteger2 >= 1) {
            minteger2 = minteger2 - 1;
            display2(minteger2);
        }
        else if (minteger2 <= 0) {
            displayToast();
        }
    }

    private void display2(int number) {
        //sharedpref.getInt();


        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number2);
        displayInteger.setText("" + number + "kg");





    }
    public void increaseInteger8(View view) {
        minteger8 = minteger8 + 1;
        display8(minteger8);

    }
    public void decreaseInteger8(View view) {
        if(minteger8 >= 1) {
            minteger8 = minteger8 - 1;
            display8(minteger8);
        }
        else if (minteger8 <= 0) {
            displayToast();
        }
    }
    private void display8(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number8);
        displayInteger.setText("" + number + "kg");
    }



    public void increaseInteger3(View view) {
        minteger3 = minteger3 + 1;
        display3(minteger3);

    }
    public void decreaseInteger3(View view) {
        if (minteger3 >= 1) {
            minteger3 = minteger3 - 1;
            display3(minteger3);
        }
        else if (minteger3 <= 0) {
            displayToast();
        }
    }

    private void display3(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number3);
        displayInteger.setText("" + number + "kg");
    }
    public void increaseInteger4(View view) {
        minteger4 = minteger4 + 1;
        display4(minteger4);

    }
    public void decreaseInteger4(View view) {
        if (minteger4 >= 1) {
            minteger4 = minteger4 - 1;
            display4(minteger4);
        }
        else if (minteger4 <= 0) {
            displayToast();
        }
    }

    private void display4(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number4);
        displayInteger.setText("" + number + "kg");
    }
    public void increaseInteger5(View view) {
        minteger5 = minteger5 + 1;
        display5(minteger5);

    }
    public void decreaseInteger5(View view) {
        if (minteger5 >= 1) {
            minteger5 = minteger5 - 1;
            display5(minteger5);
        }
        else if (minteger5 <= 0) {
            displayToast();
        }
    }

    private void display5(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number5);
        displayInteger.setText("" + number + "kg");
    }
    public void increaseInteger6(View view) {
        minteger6 = minteger6 + 1;
        display6(minteger6);

    }
    public void decreaseInteger6(View view) {
        if (minteger6 >= 1) {
            minteger6 = minteger6 - 1;
            display6(minteger6);
        }
        else if (minteger6 <= 0) {
            displayToast();
        }
    }

    private void display6(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number6);
        displayInteger.setText("" + number + "kg");
    }

    public void increaseInteger7(View view) {
        minteger7 = minteger7 + 1;
        display7(minteger7);

    }
    public void decreaseInteger7(View view) {
        if (minteger7 >= 1) {
            minteger7 = minteger7 - 1;
            display7(minteger7);
        }
        else if (minteger7 <= 0) {
            displayToast();
        }
    }

    private void display7(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number7);
        displayInteger.setText("" + number + "kg");
    }


    public void increaseInteger9(View view) {
        minteger9 = minteger9 + 1;
        display9(minteger9);

    }
    public void decreaseInteger9(View view) {
        if (minteger9 >= 1) {
            minteger9 = minteger9 - 1;
            display9(minteger9);
        }
        else if (minteger9 <= 0) {
            displayToast();
        }
    }

    private void display9(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number9);
        displayInteger.setText("" + number + "kg");
    }


}