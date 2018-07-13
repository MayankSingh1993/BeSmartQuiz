package com.example.android.besmartquiz;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {
    private Context context;

    SliderAdapter(Context context) {
        this.context = context;
    }

    private int[] slide_images = {R.drawable.turns18, R.drawable.udalogo_400x400, R.drawable.googleio2018};
    private String[] slide_headings = {"GOOGLE", "UDACITY", "GOOGLE I/O"

    };
    private String[] slide_desc = {"Best Place to Explore the World", "Best Place to learn Code", "For New Android feature watch google I/O"

    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert layoutInflater != null;
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);
        ImageView sideImageView = view.findViewById(R.id.slide_image);
        TextView slideTexView = view.findViewById(R.id.slide_heading);
        TextView slideDescription = view.findViewById(R.id.slide_descs);
        sideImageView.setImageResource(slide_images[position]);
        slideTexView.setText(slide_headings[position]);
        slideDescription.setText(slide_desc[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }

}

