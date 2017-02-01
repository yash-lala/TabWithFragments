package com.example.alienware.tabwithfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Alienware on 01-02-2017.
 */

public class HomepageFrag extends Fragment {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.homepage,container,false);
        viewPager = (ViewPager)view.findViewById(R.id.viewPager);
        if(viewPager!=null) setViewPager(viewPager);

        tabLayout = (TabLayout)view.findViewById(R.id.tab);
        tabLayout.setupWithViewPager(viewPager);
        return view;
    }
    public void setViewPager(ViewPager viewPager){
        TheAdapter theAdapter = new TheAdapter(getFragmentManager());
        theAdapter.addFragment(new HomeFrag(),"Home");
        theAdapter.addFragment(new ProfileFrag(),"Profile");
        theAdapter.addFragment(new TimelineFrag(),"Timeline");
        viewPager.setAdapter(theAdapter);
    }
}
