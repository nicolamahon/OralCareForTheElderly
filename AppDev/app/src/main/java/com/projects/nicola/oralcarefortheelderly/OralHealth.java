package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OralHealth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oral_health);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void gotoCavity(View view)
    {
        Intent newIntent = new Intent(this, cavities.class);
        startActivity(newIntent);
    }

    public void gotoPlaque(View view)
    {
        Intent newIntent = new Intent(this, Plaque.class);
        startActivity(newIntent);
    }

    public void gotoGumDis(View view)
    {
        Intent newIntent = new Intent(this, GumDiseaseMain.class);
        startActivity(newIntent);
    }

    public void gotoThrush (View view)
    {
        Intent newIntent = new Intent(this, Thrush.class);
        startActivity(newIntent);
    }

    public void gotoCancer (View view)
    {
        Intent newIntent = new Intent(this, Cancer.class);
        startActivity(newIntent);
    }

}
