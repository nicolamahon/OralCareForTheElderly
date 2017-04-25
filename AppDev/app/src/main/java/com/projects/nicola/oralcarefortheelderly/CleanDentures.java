package com.projects.nicola.oralcarefortheelderly;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Nicola on 2017-04-25.
 */

public class CleanDentures extends AppCompatActivity {

    ViewPager viewPager;
    CleanDenturesSwipeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clean_dentures);

        viewPager = (ViewPager)findViewById(R.id.view_pager_clean);
        adapter = new CleanDenturesSwipeAdapter(this);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(viewPager, true);

    }
}
