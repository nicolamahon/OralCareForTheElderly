package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DentureCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denture_care);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void gotoHygiene(View view)
    {
        Intent hygieneIntent = new Intent(this, Hygiene.class);
        startActivity(hygieneIntent);
    }

    public void gotoCareForDent(View view)
    {
        Intent careIntent = new Intent(this, CareForDenture.class);
        startActivity(careIntent);
    }

    public void gotoCleanDentures(View view)
    {
        Intent careIntent = new Intent(this, CleanDentures.class);
        startActivity(careIntent);
    }
}
