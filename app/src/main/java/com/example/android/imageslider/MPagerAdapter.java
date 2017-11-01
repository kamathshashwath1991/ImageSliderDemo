package com.example.android.imageslider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by shash on 10/31/2017.
 */

public class MPagerAdapter extends PagerAdapter {

    private int[] layouts;
    private LayoutInflater layoutInflater;
    private Context context;

    public MPagerAdapter(int [] mlayouts, Context mcontext){
        layouts= mlayouts;
        context= mcontext;
        layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return layouts.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view==object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view= layoutInflater.inflate(layouts[position],container,false);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        View view= (View) object;
        container.removeView(view);
        //super.destroyItem(container, position, object);
    }
}
