package com.example.buoi10;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.buoi10.Adapter.PageAdapter;
import com.example.buoi10.fragment.FavoriteFragment;
import com.example.buoi10.fragment.NewsFragment;
import com.example.buoi10.fragment.SavedFragment;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    //buoc9
    private NewsFragment fmNews = new NewsFragment();
    private SavedFragment fmSaved = new SavedFragment();
    private FavoriteFragment fmFavorite = new FavoriteFragment();
    private ViewPager pager;
    private PageAdapter adapter;
    //buoc11
    private TabLayout tabTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buoc10
        initViews();
    }

    private void initViews() {
        pager = findViewById(R.id.pager);
        adapter = new PageAdapter(getSupportFragmentManager(),
                fmNews, fmSaved, fmFavorite);
        pager.setAdapter(adapter);
        //buoc12
        tabTitle = findViewById(R.id.tab_title);
        //Đồng bộ hóa giữa baseFragment và tabTitle
        tabTitle.setupWithViewPager(pager);

        //buoc17
        //pager.setCurrentItem(2);
        pager.addOnPageChangeListener(this);
    }

    //buoc15
    public NewsFragment getFmNews() {
        return fmNews;
    }

    public SavedFragment getFmSaved() {
        return fmSaved;
    }

    public FavoriteFragment getFmFavorite() {
        return fmFavorite;
    }

    @Override
    public void onPageScrolled(int i, float v, int i1) {

    }

    @Override
    public void onPageSelected(int i) {
        Log.e(getClass().getName(),"onPageSelected " + i);
    }

    @Override
    public void onPageScrollStateChanged(int i) {

    }
}
