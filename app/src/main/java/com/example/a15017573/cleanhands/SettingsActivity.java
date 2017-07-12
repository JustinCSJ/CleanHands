package com.example.a15017573.cleanhands;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;

public class SettingsActivity extends AppCompatActivity {
    Switch switchNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        switchNotes = (Switch) findViewById(R.id.switchNote);

        boolean isChecked = switchNotes.isChecked();

        Intent intent = new Intent(SettingsActivity.this, RecordsActivity.class);
        intent.putExtra("status", isChecked);
        startActivityForResult(intent, 9);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,
                                    Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK && requestCode == 9){

        }
    }
}

