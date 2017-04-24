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

public class GumDiseaseSwipeAdapter extends PagerAdapter{

    private int[] image_resources = {R.drawable.gum_disease_8, R.drawable.gum_disease_causes};
    private int[] gumDiseaseHeader_strings = {R.string.gumDiseaseSigns, R.string.gumDiseaseCauses};
    private int[] gumDiseaseBody_strings = {R.string.gumDiseaseSignsInfo, R.string.gumDiseaseCausesInfo};
    private Context ctx;
    private LayoutInflater layoutInflater;

    public GumDiseaseSwipeAdapter(Context ctx)
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
        View item_view = layoutInflater.inflate(R.layout.content_gum_disease_main, container, false);

        ImageView imageView = (ImageView)item_view.findViewById(R.id.gumDiseaseIMGs);
        TextView textView1 = (TextView)item_view.findViewById(R.id.gumDiseaseHeader);
        TextView textView2 = (TextView)item_view.findViewById(R.id.gumDiseaseInfo);

        imageView.setImageResource(image_resources[position]);
        textView1.setText(gumDiseaseHeader_strings[position]);
        textView2.setText(gumDiseaseBody_strings[position]);

        container.addView(item_view);
        return item_view;
    }

    public void destroyItem (ViewGroup container, int position, Object object)
    {
        container.removeView((RelativeLayout)object);
    }
}
