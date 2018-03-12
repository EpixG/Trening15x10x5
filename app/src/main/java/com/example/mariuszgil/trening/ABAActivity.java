package com.example.mariuszgil.trening;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class ABAActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aba);

        String[] abaList = {"Przysiad ze sztangą 3 serie x 15 powtórzeń",
                "Wiosłowanie sztangą 3 serie x 15 powtórzeń",
                "Wyciskanie sztangi leżąc 3 serie x 15 powtórzeń",
                "Podciąganie na drążku podchwytem 3 serie x 15 powtórzeń",
                "BARKI - 2 serie wg uznania (np. wyciskanie stojąc)",
                "BICEPS - 2 serie wg uznania (np. uginanie stojąc ze sztangą łamaną)",
                "TRICEPS - 2 serie wg uznania (np. wąskie pompki na poręczach)"};
        ListAdapter abaAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,abaList);

        ListView theListview = (ListView) findViewById(R.id.abaLista);

        theListview.setAdapter(abaAdapter);

        theListview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                return false;
            }
        });
    }

}
