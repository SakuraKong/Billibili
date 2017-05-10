package com.example.chenshensen.myapplication.view;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.chenshensen.myapplication.R;
import com.example.chenshensen.myapplication.presenter.ViewPagerAdapter;

import java.util.ArrayList;

public class MainViewActivity extends AppCompatActivity implements MainView{
    private String[] tabTitleArray = {"直播", "推荐", "追番", "分区", "动态",
            "发现"};
    private TabLayout tabLayout;
    private ArrayList<Fragment> fragments;
    private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=(TabLayout)findViewById(R.id.tablayout);
        viewPager=(ViewPager)findViewById(R.id.viewpager);
        initTablayoutAndViewPager();
    }
    @Override
    public void initTablayoutAndViewPager(){
        fragments=new ArrayList<Fragment>();
        Fragment firstFragment=new firstFragment();
        Fragment secondFragment=new secondFragment();
        Fragment thirdFragment=new thirdFragment();
        Fragment fourthFragment=new fourthFragment();
        Fragment fifthFragment=new fifthFragment();
        Fragment sixthFragment=new sixthFragment();
        fragments.add(firstFragment);
        fragments.add(secondFragment);
        fragments.add(thirdFragment);
        fragments.add(fourthFragment);
        fragments.add(fifthFragment);
        fragments.add(sixthFragment);
        ViewPagerAdapter adapter = new ViewPagerAdapter(
                getSupportFragmentManager(), this, fragments, tabTitleArray);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
