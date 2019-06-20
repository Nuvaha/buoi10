package com.example.buoi10;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class DrawableLayoutActivity extends AppCompatActivity {


    private DrawerLayout drawer;
    private ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_layout);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);//nut back tren actionbar

        drawer = findViewById(R.id.drawer);

        toggle = new ActionBarDrawerToggle(this, drawer,
                R.string.app_name, R.string.app_name);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
    }
    //hieu ung click menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
