package com.projects.nicola.oralcarefortheelderly;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.projects.nicola.oralcarefortheelderly.utils.backgroundWorker;

public class login_register extends Activity{

    EditText UsernameET, PasswordET;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_login_register);

        UsernameET = (EditText) findViewById(R.id.ETUsername);
        PasswordET = (EditText)findViewById(R.id.ETPassword);

    }

    public void onLogin(View view)
    {
        String username = UsernameET.getText().toString();
        String password = PasswordET.getText().toString();
        String type = "login";
        backgroundWorker bW = new backgroundWorker(this);
        bW.execute(type, username,password);

    }

    public void gotoRegister(View view)
    {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
