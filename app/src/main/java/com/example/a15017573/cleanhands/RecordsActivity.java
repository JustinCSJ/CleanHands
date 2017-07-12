package com.example.a15017573.cleanhands;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class RecordsActivity extends AppCompatActivity {
    ListView lvRole, lvRank, lvMoments;
    ArrayList<Role> alRole = new ArrayList<Role>();
    ArrayList<String> alRank;
    ArrayList<String> alMoments;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        lvRole = (ListView)findViewById(R.id.lvRole);
        lvRank = (ListView)findViewById(R.id.lvRank);
        lvMoments = (ListView)findViewById(R.id.lvMoments);

//        Role role1 = new Role("Nurse");
//        alRole.add(role1);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        Fragment f1 = new FragmentRole();
        ft.replace(R.id.frame1, f1);


        ft.commit();


    }


    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent intent = new Intent(getBaseContext(), SettingsActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == 9){

        }
    }
}
