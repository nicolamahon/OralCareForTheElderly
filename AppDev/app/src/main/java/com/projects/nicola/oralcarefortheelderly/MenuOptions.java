package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menuoptions);
    }

    public void gotoSelfCare(View view)
    {
        Intent intent = new Intent(this, self_care.class);
        startActivity(intent);
    }

    public void gotoPatientCare(View view)
    {
        Intent intent = new Intent(this, patient_care.class);
        startActivity(intent);
    }

}
