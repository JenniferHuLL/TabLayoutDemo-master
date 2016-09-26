package com.example.huangzx.tablayoutdemo;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by huangzx on 2015/8/27.
 */
public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;

    public SimpleFragmentPagerAdapter(FragmentManager fm,Context context) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        //第一次的代码
        //return tabTitles[position];
        //第二次的代码
        /**
         Drawable image = context.getResources().getDrawable(imageResId[position]);
         image.setBounds(0, 0, image.getIntrinsicWidth(), image.getIntrinsicHeight());
         SpannableString sb = new SpannableString(" " + tabTitles[position]);
         ImageSpan imageSpan = new ImageSpan(image, ImageSpan.ALIGN_BOTTOM);
         sb.setSpan(imageSpan, 0, 1, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
         return sb;*/


        return null;
    }

}
