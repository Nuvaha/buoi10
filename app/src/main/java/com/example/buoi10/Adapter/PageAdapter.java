package com.example.buoi10.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.buoi10.fragment.BaseFragment;

//buoc5
public class PageAdapter extends FragmentPagerAdapter {

    private BaseFragment[] arrFragment;

    //buoc 6 truyen them tham so BaseFragment... arrFragment
    public PageAdapter(FragmentManager fm, BaseFragment... arrFragment) {
        super(fm);
        this.arrFragment = arrFragment;
    }

    //vị trí của item
    //buoc8
    @Override
    public Fragment getItem(int i) {
        return arrFragment[i];
    }

    // Số lượng page tạo ra
    //buoc7
    @Override
    public int getCount() {
        return arrFragment.length;
    }

    //buoc13
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return arrFragment[position].getTitle();
    }
}
