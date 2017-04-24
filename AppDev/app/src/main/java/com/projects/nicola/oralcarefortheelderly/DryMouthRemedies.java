package com.projects.nicola.oralcarefortheelderly;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class DryMouthRemedies extends AppCompatActivity {

    ViewPager viewPager;
    RemediesSwipeAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dry_mouth_remedies);

        viewPager = (ViewPager)findViewById(R.id.view_pager_remedies);
        adapter = new RemediesSwipeAdapter(this);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(viewPager, true);

    }

}
