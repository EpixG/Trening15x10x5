package com.example.mariuszgil.trening;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class ABAActivity extends AppCompatActivity {


    SQLiteDatabase progressDB = null;

    Button zapiszTrening;





    int minteger2 = 0;
    int minteger8 = 0;
    int minteger3 = 0;
    int minteger4 = 0;
    int minteger5 = 0;
    int minteger6 = 0;
    int minteger7 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aba);

        zapiszTrening = (Button) findViewById(R.id.zapiszTrening);

    }
    public void displayToast(){
        Context context = getApplicationContext();
        CharSequence zaMaloKG = "Nie można wybrać ujemnego obciążenia" ;
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
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number2);
        displayInteger.setText(number + "kg");
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
        else if (minteger2 <= 0) {
            displayToast();
        }
    }

    private void display8(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number8);
        displayInteger.setText(number + "kg");
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
        else if (minteger2 <= 0) {
            displayToast();
        }
    }

    private void display3(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number3);
        displayInteger.setText(number + "kg");
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
        else if (minteger2 <= 0) {
            displayToast();
        }
    }

    private void display4(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number4);
        displayInteger.setText(number + "kg");
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
        else if (minteger2 <= 0) {
            displayToast();
        }
    }

    private void display5(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number5);
        displayInteger.setText(number + "kg");
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
        else if (minteger2 <= 0) {
            displayToast();
        }
    }

    private void display6(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number6);
        displayInteger.setText(number + "kg");
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
        else if (minteger2 <= 0) {
            displayToast();
        }
    }

    private void display7(int number) {
        TextView displayInteger = (TextView) findViewById(
                R.id.integer_number7);
        displayInteger.setText(number + "kg");
    }

    public void saveTrainingToBase(View view) {

        try{
            progressDB = this.openOrCreateDatabase("MyProgress", MODE_PRIVATE, null);

            progressDB.execSQL("CREATE IF NOT EXISTS cwiczenia" + "(id integer primary key, name VARCHAR, tydzien VARCHAR);");

            File database =
                    getApplicationContext().getDatabasePath("MyProgress.db");

            if (!database.exists()){
                Toast.makeText(this, "Baza została utworzona",
                        Toast.LENGTH_SHORT).show();

            }else {
                Toast.makeText(this,"Brak bazy",
                        Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e){
            Log.e("Trening error", "Error creating database");
        }

        zapiszTrening.setClickable(true);
    }
}
