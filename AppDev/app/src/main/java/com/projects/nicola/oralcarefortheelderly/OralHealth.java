package com.projects.nicola.oralcarefortheelderly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OralHealth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_health);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}
