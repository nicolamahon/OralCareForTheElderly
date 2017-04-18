package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GumDiseaseMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gum_disease_main);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    }

    public void gotoGumSigns(View view)
    {
        Intent newIntent = new Intent(this, GumDiseaseSigns.class);
        startActivity(newIntent);
    }


    public void gotoGumCauses(View view)
    {
        Intent newIntent = new Intent(this, GumDiseaseCauses.class);
        startActivity(newIntent);
    }

}
