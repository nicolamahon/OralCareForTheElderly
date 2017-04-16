package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class cavities extends AppCompatActivity {

    // Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cavities);

        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        //back = (Button) findViewById(R.id.button2);

        /*
        back.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getApplicationContext(), testNewActivity.class);
                startActivity(i);
            }
        }
        );
        */

    }

    public void gotoNatural(View view)
    {
        Intent intent = new Intent(this, NaturalTeeth.class);
        startActivity(intent);
    }



}
