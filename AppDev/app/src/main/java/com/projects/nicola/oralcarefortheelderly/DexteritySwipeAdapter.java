package com.projects.nicola.oralcarefortheelderly;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;


/**
 * Created by Nicola on 2017-04-23.
 */

public class DexteritySwipeAdapter extends PagerAdapter {

    private int[] image_resources = {R.drawable.dexterity_1, R.drawable.electric_brush_23, R.drawable.collis_curve_24, R.drawable.floss_holder_25, R.drawable.interdental_26, R.drawable.handle_grips_28, R.drawable.three_way_brush_28};
    private int[] header_strings = {R.string.dexMain_head, R.string.elec_brush_head, R.string.collis_head, R.string.floss_head, R.string.interdental_head, R.string.handle_grips_head, R.string.three_way_head};
    private int[] body_strings = {R.string.dexterityMain, R.string.elec_brush, R.string.collis, R.string.floss, R.string.interdental, R.string.handle_grips, R.string.three_way};

    private Context ctx;
    private LayoutInflater layoutInflater;

    public DexteritySwipeAdapter(Context ctx)
    {
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == object);
    }

    public Object instantiateItem(ViewGroup container, int position)
    {
        layoutInflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.dexterity_swipe_layout, container, false);

        ImageView imageView = (ImageView)item_view.findViewById(R.id.dexIMGs);
        TextView textView1 = (TextView)item_view.findViewById(R.id.dexHead);
        TextView textView2 = (TextView)item_view.findViewById(R.id.image_count_dexterity);
        TextView textView3 = (TextView)item_view.findViewById(R.id.dexInfo);

        imageView.setImageResource(image_resources[position]);
        textView1.setText(header_strings[position]);
        textView2.setText("Swipe for more...>>>   "+(position+1)+"/"+image_resources.length);
        textView3.setText(body_strings[position]);

        container.addView(item_view);
        return item_view;
    }

    public void destroyItem (ViewGroup container, int position, Object object)
    {
        container.removeView((ScrollView)object);
    }
}
