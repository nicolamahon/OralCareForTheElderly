package com.projects.nicola.oralcarefortheelderly;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Nicola on 2017-04-21.
 */

public class SwipeAdapter extends FragmentStatePagerAdapter {
    public SwipeAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new PageFragment();
        Bundle bundle = new Bundle();
        // bundle.putInt("count", i+1);
        //bundle.putString("oralB", (.getString(R.string.oralB));
        if (i == 0) {
            bundle.putString("dryMouth", "Oralbalance© long lasting lubricant relieves, soothes and protects dry mouth tissues against dry discomfort, minor irritations, and burning sensations.");
        } else if (i == 1) {
            bundle.putString("dryMouth", "Regular Water");
        } else if (i == 2) {
            bundle.putString("dryMouth", "Sugar-Free Sweets");
        } else if (i == 3) {
            bundle.putString("dryMouth", "Bioxtra Mouthwash (250ml)(BIOX3)");
        }

        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
