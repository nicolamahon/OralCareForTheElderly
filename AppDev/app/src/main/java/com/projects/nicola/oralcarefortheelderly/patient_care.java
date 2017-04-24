package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class patient_care extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_care);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void gotoResidents(View view)
    {
        Intent intent = new Intent(this, Resident.class);
        startActivity(intent);
    }

    public void gotoBroken(View view)
    {
        Intent intent = new Intent(this, Broken_Denture.class);
        startActivity(intent);
    }

    public void gotoLost(View view)
    {
        Intent intent = new Intent(this, Lost_Denture.class);
        startActivity(intent);
    }

    public void gotoEmergency(View view)
    {
        Intent intent = new Intent(this, Emergancy.class);
        startActivity(intent);
    }
}
