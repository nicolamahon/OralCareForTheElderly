package com.projects.nicola.oralcarefortheelderly;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class RemediesSwipeAdapter extends PagerAdapter {

    private int[] image_resources = {R.drawable.oralbalance_13, R.drawable.water_13, R.drawable.sweets_13, R.drawable.mouthwash_13};
    private int[] dryMouthHeader_strings = {R.string.oralBalanceData, R.string.water_glass, R.string.sweets, R.string.mouthWashHead};
    private int[] dryMouthBody_strings = {R.string.empty_string, R.string.empty_string, R.string.empty_string, R.string.mouthWashBullets};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public RemediesSwipeAdapter(Context ctx)
    {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (ScrollView)object);
    }

    public Object instantiateItem(ViewGroup container, int position)
    {
        layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.remedies_swipe_layout, container, false);

        ImageView imageView = (ImageView)item_view.findViewById(R.id.dryMouthIMGs);
        TextView textView1 = (TextView)item_view.findViewById(R.id.dryMouthHead);
        TextView textView2 = (TextView)item_view.findViewById(R.id.dryMouthInfo);

        imageView.setImageResource(image_resources[position]);
        textView1.setText(dryMouthHeader_strings[position]);
        textView2.setText(dryMouthBody_strings[position]);

        container.addView(item_view);
        return item_view;
    }

    public void destroyItem (ViewGroup container, int position, Object object)
    {
        container.removeView((ScrollView)object);
    }
}
