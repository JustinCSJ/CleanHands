package com.example.a15017573.cleanhands;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class RoleSpinnerActivity extends AppCompatActivity {

    Spinner spnRole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_role_spinner);


        spnRole = (Spinner) findViewById(R.id.spnRole);

        spnRole.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                String selectedRole = spnRole.getSelectedItem().toString();

                Intent i = new Intent(RoleSpinnerActivity.this, RecordsActivity.class);

                i.putExtra("role", selectedRole);

                startActivityForResult(i, 9);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == 9){
            spnRole.performClick();
        }
    }
}
