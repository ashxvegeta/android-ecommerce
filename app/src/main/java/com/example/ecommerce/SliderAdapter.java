package com.example.ecommerce;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {

    Context context;
    public SliderAdapter(Context context) {
        this.context = context;
    }

    int imagesArray[] = {
    R.drawable.onboardscreen1;
    R.drawable.onboardscreen2;
    R.drawable.onboardscreen3;
    };

    int headingArray[] = {
            R.string.first_slide;
            R.string.second_slide;
            R.string.third_slide;
    };


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
}
