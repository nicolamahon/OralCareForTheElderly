package com.projects.nicola.oralcarefortheelderly;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Created by Nicola on 2017-04-25.
 */

public class CleanDenturesSwipeAdapter extends PagerAdapter {
    private int[] header_strings = {R.string.cleanHead1, R.string.cleanHead2, R.string.cleanHead3, R.string.cleanHead4, R.string.cleanHead5, R.string.cleanHead6};
    private int[] body_strings = {R.string.cleanInfo1, R.string.cleanInfo2, R.string.cleanInfo3, R.string.cleanInfo4, R.string.cleanInfo5, R.string.cleanInfo6};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public CleanDenturesSwipeAdapter(Context ctx)
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
