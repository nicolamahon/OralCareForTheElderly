package com.projects.nicola.oralcarefortheelderly;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void gotoLogin(View view)
    {
        Intent intent = new Intent(this, login_register.class);
        startActivity(intent);
    }

    public void gotoRegister(View view)
    {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }

    public void gotoInformation(View view)
    {
        Intent intent = new Intent(this,information.class);
        startActivity(intent);
    }
}
