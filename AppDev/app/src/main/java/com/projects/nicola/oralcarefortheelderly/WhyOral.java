package com.projects.nicola.oralcarefortheelderly;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WhyOral extends AppCompatActivity {

    ViewPager viewPager;
    OralcareSwipeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_why_oral);

        viewPager = (ViewPager)findViewById(R.id.view_pager_oralcare);
        adapter = new OralcareSwipeAdapter(this);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(viewPager, true);

    }
}
