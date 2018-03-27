package com.example.mariuszgil.trening;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */
    public void getInTrening(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, TreningView.class);
        startActivity(intent);
    }
    public void getInHistoria(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, HistoriaView.class);
        startActivity(intent);
    }



}
