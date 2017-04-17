package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CareForDenture extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_care_for_denture);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    }

    public void gotoDentureCare(View view)
    {
        Intent intent = new Intent(this, DentureCare.class);
        startActivity(intent);
    }

}

