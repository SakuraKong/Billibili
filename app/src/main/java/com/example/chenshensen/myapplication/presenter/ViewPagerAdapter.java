package com.example.chenshensen.myapplication.presenter;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.View;

import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> fragments;
    private String[] tabTitleArray;

    public ViewPagerAdapter(FragmentManager fm, Context context,
                            List<Fragment> fragmentList, String[] tabTitleArray) {
        super(fm);
        this.tabTitleArray = tabTitleArray;
        this.fragments=fragmentList;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitleArray[position % tabTitleArray.length];
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }
    @Override
    public int getCount() {
        return fragments.size();
    }

}