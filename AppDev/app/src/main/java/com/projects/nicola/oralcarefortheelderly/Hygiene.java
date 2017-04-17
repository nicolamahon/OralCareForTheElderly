package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Hygiene extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hygiene);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    }

    public void gotoDentureCare(View view)
    {
        Intent intent = new Intent(this, DentureCare.class);
        startActivity(intent);
    }

}

