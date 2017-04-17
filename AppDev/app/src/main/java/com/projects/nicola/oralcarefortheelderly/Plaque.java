package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Plaque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plaque);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

    }

    public void gotoNatural(View view)
    {
        Intent intent = new Intent(this, NaturalTeeth.class);
        startActivity(intent);
    }

}
