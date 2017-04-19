package com.projects.nicola.oralcarefortheelderly;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class LoggedIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);

        String username = getIntent().getStringExtra("Username");

        TextView userDisplay = (TextView)findViewById(R.id.username_entered);
        userDisplay.setText(username);


    }

}
