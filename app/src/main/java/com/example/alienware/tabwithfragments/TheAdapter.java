package com.example.alienware.tabwithfragments;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alienware on 01-02-2017.
 */

public class TheAdapter extends FragmentPagerAdapter {

    List<Fragment> fragments = new ArrayList<>();
    List<String> fragmentNames = new ArrayList<>();

    public TheAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment,String name){
        fragments.add(fragment);
        fragmentNames.add(name);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentNames.get(position);
    }
}
