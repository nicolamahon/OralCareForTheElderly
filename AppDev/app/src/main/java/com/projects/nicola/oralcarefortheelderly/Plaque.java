package com.projects.nicola.oralcarefortheelderly;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Plaque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plaque);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

}
