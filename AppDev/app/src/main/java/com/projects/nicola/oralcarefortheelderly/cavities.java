package com.projects.nicola.oralcarefortheelderly;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


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
                Intent i = new Intent(getApplicationContext(), self_care.class);
                startActivity(i);
            }
        }
        );
        */

    }

    /*
    // functionality to allow the user return to previous menu
    // this is now included by the supportActionBar settings

    public void gotoNatural(View view)
    {
        Intent intent = new Intent(this, NaturalTeeth.class);
        startActivity(intent);
    }
    */


}
