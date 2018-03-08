package com.example.mariuszgil.trening;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TreningView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trening_view);
    }
    public void getInABA(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ABAActivity.class);
        startActivity(intent);
    }
    public void getInBAB(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, BABActivity.class);
        startActivity(intent);
    }
}
