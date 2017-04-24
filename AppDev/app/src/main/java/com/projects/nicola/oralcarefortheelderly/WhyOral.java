package com.projects.nicola.oralcarefortheelderly;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import me.relex.circleindicator.CircleIndicator;

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

        ViewPager viewPager = (ViewPager)findViewById(R.id.view_pager_oralcare);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabDots);
        tabLayout.setupWithViewPager(viewPager, true);

        //CircleIndicator indicator = (CircleIndicator)findViewById(R.id.indicator);
        //indicator.setViewPager(viewPager);

        /*
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener()
        {
            @Override
            public void onPageScrolled(int i, float v, int i1)
            {

            }

            @Override
            public void onPageSelected(int i)
            {
                currentPage = i;
            }

            /*@Override
            public void onPageScrollStateChanged(int i)
            {
                if(i == ViewPager.SCROLL_STATE_IDLE)
                {
                    numPages = adapter.getCount();
                    if (currentPage == 0)
                    {
                        viewPager.setCurrentItem(numPages - 1, false);
                    } else if (currentPage == numPages - 1)
                    {
                        viewPager.setCurrentItem(0, false);
                    }
                }
            }
        });*/
    }
}
