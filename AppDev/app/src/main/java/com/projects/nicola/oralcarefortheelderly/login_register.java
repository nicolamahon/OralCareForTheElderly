package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.id.edit;

public class login_register extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void gotoLoggedIn(View view)
    {
        EditText user = (EditText) findViewById(R.id.ETUsername);
        String userString = user.getText().toString();

        EditText pass = (EditText) findViewById(R.id.ETPassword);
        String passString = pass.getText().toString();

        String password = helper.searchPass(userString);
        if(passString.equals(password))
        {
            Intent intent = new Intent(this, LoggedIn.class);
            intent.putExtra("Username", userString);
            startActivity(intent);
        }
        else
        {
            Toast loginError = Toast.makeText(this, "Incorrect Username/Password",Toast.LENGTH_SHORT);
            loginError.show();
        }


    }

    public void gotoRegister(View view)
    {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }


}
