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

public class Register extends AppCompatActivity {

    DatabaseHelper helper = new DatabaseHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


    }

    public void confirmRegister(View view)
    {
        EditText name = (EditText) findViewById(R.id.Name_registered);
        EditText email = (EditText) findViewById(R.id.Email_registered);
        EditText uname = (EditText) findViewById(R.id.Username_registered);
        EditText pass1 = (EditText) findViewById(R.id.pass1_registered);
        EditText pass2 = (EditText) findViewById(R.id.pass2_registered);

        String namestr = name.getText().toString();
        String emailstr = email.getText().toString();
        String unamestr = uname.getText().toString();
        String pass1str = pass1.getText().toString();
        String pass2str = pass2.getText().toString();

        if(!pass1str.equals(pass2str))
        {
            //check to make sure passwords match
            Toast passError = Toast.makeText(this, "Passwords do not match!",Toast.LENGTH_SHORT);
            passError.show();
        }
        else
        {
            //insert into the database
            Contact entry = new Contact();
            entry.setName(namestr);
            entry.setEmail(emailstr);
            entry.setUname(unamestr);
            entry.setPass(pass1str);

            helper.insertContact(entry);
        }
        finish();
    }
}


