package com.example.mariuszgil.trening;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class BABActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bab);
        String[] babList = {"Martwy ciąg ze sztangą",
                "Wyciskanie sztangi wąskim chwytem",
                "Wyciskanie na barki, siedząc, do czoła",
                "Wiosłowanie jednorącz",
                "Wznosy ramion w opadzie"};

        ListAdapter babAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,babList);

        ListView theListview = (ListView) findViewById(R.id.bablista);

        theListview.setAdapter(babAdapter);

        theListview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                return false;
            }
        });
    }
}
