package com.example.alienware.tabwithfragments;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        if(viewPager!=null) setViewPager(viewPager);

        tabLayout = (TabLayout)findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
    }



    public void setViewPager(ViewPager viewPager){
        TheAdapter theAdapter = new TheAdapter(getSupportFragmentManager());
        theAdapter.addFragment(new HomeFrag(),"Home");
        theAdapter.addFragment(new ProfileFrag(),"Profile");
        theAdapter.addFragment(new TimelineFrag(),"Timeline");
        viewPager.setAdapter(theAdapter);
    }
}
