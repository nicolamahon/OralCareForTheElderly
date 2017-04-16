package com.projects.nicola.oralcarefortheelderly;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class patient_care extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_care);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }
}
