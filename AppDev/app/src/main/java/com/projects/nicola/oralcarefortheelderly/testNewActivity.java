package com.projects.nicola.oralcarefortheelderly;

 import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
 import android.support.v7.widget.Toolbar;
 import android.view.View;

public class testNewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_new);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    public void gotoCavity(View view)
    {
        Intent newIntent = new Intent(this, cavities.class);
        startActivity(newIntent);
    }
}
