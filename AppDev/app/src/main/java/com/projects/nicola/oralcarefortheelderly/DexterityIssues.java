package com.projects.nicola.oralcarefortheelderly;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DexterityIssues extends AppCompatActivity {

    ViewPager viewPager;
    DexteritySwipeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dexterity_issues);

        viewPager = (ViewPager)findViewById(R.id.view_pager_dexterity);
        adapter = new DexteritySwipeAdapter(this);
        viewPager.setAdapter(adapter);
    }
}
