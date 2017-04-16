package com.projects.nicola.oralcarefortheelderly;

 import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
 import android.support.v7.widget.Toolbar;
 import android.view.View;

public class self_care extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.self_care);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void gotoNatural(View view)
    {
        Intent newIntent = new Intent(this, NaturalTeeth.class);
        startActivity(newIntent);
    }

    public void gotoDentureCare(View view)
    {
        Intent intent = new Intent(this, DentureCare.class);
        startActivity(intent);
    }

    public void gotoMouthCare(View view)
    {
        Intent intent = new Intent(this, MouthCare.class);
        startActivity(intent);
    }

    public void gotoDifficult(View view)
    {
        Intent intent = new Intent(this,MouthOpening.class);
        startActivity(intent);
    }

    public void gotoDryMouth(View view)
    {
        Intent intent = new Intent(this, DryMouth.class);
        startActivity(intent);
    }

    public void gotoDexterity(View view)
    {
        Intent intent = new Intent(this, DexterityIssues.class);
        startActivity(intent);
    }

    public void gotoOralHealth(View view)
    {
        Intent intent = new Intent(this, OralHealth.class);
        startActivity(intent);
    }

    public void gotoOralCare(View view)
    {
        Intent intent = new Intent(this, WhyOral.class);
        startActivity(intent);
    }
}
