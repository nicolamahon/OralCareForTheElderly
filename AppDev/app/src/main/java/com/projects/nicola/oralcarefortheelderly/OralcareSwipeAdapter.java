package com.projects.nicola.oralcarefortheelderly;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by Nicola on 2017-04-23.
 */

public class OralcareSwipeAdapter extends PagerAdapter{

    private int[] header_strings = {R.string.oralcarehead1, R.string.oralcarehead2, R.string.oralcarehead3, R.string.oralcarehead4, R.string.oralcarehead5};
    private int[] body_strings = {R.string.oralcarebody1, R.string.oralcarebody2, R.string.oralcarebody3, R.string.oralcarebody4, R.string.oralcarebody5};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public OralcareSwipeAdapter(Context ctx)
    {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return header_strings.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {

        return (view == (ScrollView)object);
    }

    public Object instantiateItem(ViewGroup container, int position)
    {
        layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.oralcare_swipe_layout, container, false);

        TextView textView1 = (TextView)item_view.findViewById(R.id.oralcareHead);
        TextView textView2 = (TextView)item_view.findViewById(R.id.oralcareInfo);

        textView1.setText(header_strings[position]);
        textView2.setText(body_strings[position]);

        container.addView(item_view);
        return item_view;
    }

    public void destroyItem (ViewGroup container, int position, Object object)
    {
        container.removeView((ScrollView)object);
    }

}
