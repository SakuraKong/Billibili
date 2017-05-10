/*package com.example.chenshensen.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {
    private String[] tabTitleArray = {"直播", "推荐", "追番", "分区", "动态",
            "发现"};
    private TabLayout tabLayout;
    private ArrayList<Fragment> fragments;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=(TabLayout)findViewById(R.id.tablayout);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
       // for (int i = 0; i < tabTitleArray.length; i++) {
       //     tabLayout.addTab(tabLayout.newTab().setText(tabTitleArray[i]));
      //  }
        fragments=new ArrayList<Fragment>();
        Fragment firstFragment=new firstFragment();
        Fragment secondFragment=new secondFragment();
        fragments.add(firstFragment);
        fragments.add(secondFragment);
        ViewPagerAdapter adapter = new ViewPagerAdapter(
                getSupportFragmentManager(), this, fragments, tabTitleArray);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
    public void initTablayoutAndViewPager(){

    }
}*/
