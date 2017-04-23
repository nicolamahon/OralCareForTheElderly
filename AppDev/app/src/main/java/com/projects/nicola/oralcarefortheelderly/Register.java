package com.projects.nicola.oralcarefortheelderly;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.projects.nicola.oralcarefortheelderly.utils.backgroundWorker;

public class Register extends AppCompatActivity {

    EditText username, name, email, password, confirmPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_register);
        username = (EditText)findViewById(R.id.Username_registered);
        name = (EditText)findViewById(R.id.Name_registered);
        email = (EditText)findViewById(R.id.Email_registered);
        password = (EditText)findViewById(R.id.pass1_registered);
        confirmPass =(EditText)findViewById(R.id.pass2_registered);
    }

    public void onRegister(View view)
    {
        String str_uname = username.getText().toString();
        String str_name = name.getText().toString();
        String str_mail = email.getText().toString();
        String str_pass = password.getText().toString();
        String str_pass2 = confirmPass.getText().toString();
        String type = "register";
        if(!str_pass.equals(str_pass2))
        {
            Toast.makeText(getApplicationContext(),"Passwords do not match", Toast.LENGTH_LONG).show();
        }
        else if (!str_mail.contains("@"))
        {
            Toast.makeText(getApplicationContext(),"Please imput valid email address", Toast.LENGTH_LONG).show();

        }
        else {
            backgroundWorker bW = new backgroundWorker(this);
            bW.execute(type, str_uname, str_name, str_mail, str_pass);
        }

    }
}


