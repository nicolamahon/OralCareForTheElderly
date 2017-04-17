package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MouthCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mouth_care);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void gotoGumDis(View view)
    {
        Intent newIntent = new Intent(this, GumDiseaseMain.class);
        startActivity(newIntent);
    }

}
