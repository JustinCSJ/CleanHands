package com.example.a15017573.cleanhands;

import android.content.Intent;
import android.icu.text.AlphabeticIndex;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RecordsActivity extends AppCompatActivity {

    ListView lvRole, lvRank;
    ArrayList<Role> alRole;
    ArrayList<Rank> alRank;
    ArrayAdapter aaRole;
    ArrayAdapter aaRank;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        lvRole = (ListView) findViewById(R.id.lvRole);
        lvRank = (ListView) findViewById(R.id.lvRank);

        alRole = new ArrayList<Role>();
        alRank = new ArrayList<Rank>();

        alRole.add(new Role("Doctor"));
        alRank.add(new Rank("Junior"));

        aaRole = new RoleAdapter(this, R.layout.row_role, alRole);
        aaRank = new RankAdapter(this, R.layout.row_rank, alRank);

        lvRole.setAdapter(aaRole);
        lvRank.setAdapter(aaRank);


        lvRole.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(RecordsActivity.this, RoleSpinnerActivity.class);
                startActivityForResult(i, 9);
            }
        });



    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == 9){
            lvRole.performClick();
        }
    }
}
