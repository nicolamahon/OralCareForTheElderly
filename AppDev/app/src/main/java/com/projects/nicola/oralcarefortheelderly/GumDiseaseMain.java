package com.projects.nicola.oralcarefortheelderly;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class GumDiseaseMain extends AppCompatActivity {

    ViewPager viewPager;
    GumDiseaseSwipeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gum_disease_main);

        viewPager = (ViewPager)findViewById(R.id.view_pager_gumdisease);
        adapter = new GumDiseaseSwipeAdapter(this);
        viewPager.setAdapter(adapter);

    }

}
