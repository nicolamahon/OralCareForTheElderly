package com.projects.nicola.oralcarefortheelderly;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.projects.nicola.oralcarefortheelderly.utils.backgroundWorker;

public class Register extends Activity {

    EditText username, name, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_register);
        username = (EditText)findViewById(R.id.Username_registered);
        name = (EditText)findViewById(R.id.Name_registered);
        email = (EditText)findViewById(R.id.Email_registered);
        password = (EditText)findViewById(R.id.pass1_registered);
    }

    public void onRegister(View view)
    {
        String str_uname = username.getText().toString();
        String str_name = name.getText().toString();
        String str_mail = email.getText().toString();
        String str_pass = password.getText().toString();
        String type = "register";
        backgroundWorker bW = new backgroundWorker(this);
        bW.execute(type, str_uname,str_name,str_mail,str_pass);

    }
}


