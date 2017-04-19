package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void gotoLogin(View view)
    {
        Intent intent = new Intent(this, login_register.class);
        startActivity(intent);
    }

    public void gotoInformation(View view)
    {
        Intent intent = new Intent(this,information.class);
        startActivity(intent);
    }
}
