package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DryMouth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dry_mouth);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void gotoDryRemedies(View view)
    {
        Intent newIntent = new Intent(this, DryMouthRemedies.class);
        startActivity(newIntent);
    }
}
