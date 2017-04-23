package com.projects.nicola.oralcarefortheelderly;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class DryMouthRemedies extends AppCompatActivity {

    ViewPager viewPager;
    CustomSwipeAdapter adapter;
    //Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dry_mouth_remedies);

        viewPager = (ViewPager)findViewById(R.id.view_pager);
        adapter = new CustomSwipeAdapter(this);
        viewPager.setAdapter(adapter);

        /*
        viewPager = (ViewPager)findViewById(R.id.view_pager);

        SwipeAdapter swipeAdapter = new SwipeAdapter(getSupportFragmentManager());
        viewPager.setAdapter(swipeAdapter);

        back = (Button) findViewById(R.id.backButtonX);

        back.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    Intent i = new Intent(getApplicationContext(), DryMouth.class);
                    startActivity(i);
                }
            }
        );
        */

    }



}
