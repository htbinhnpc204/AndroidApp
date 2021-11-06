package com.htbinh.studentapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;
import com.htbinh.studentapp.Adapter.FragmentAdapter;
import com.htbinh.studentapp.R;
import com.htbinh.studentapp.Adapter.TkbAdapter;
import com.htbinh.studentapp.Model.TkbModel;

import java.util.ArrayList;

public class ScheduleActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    FragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        tabLayout = findViewById(R.id.tabTKB);
        viewPager2 = findViewById(R.id.pager2);
        adapter = new FragmentAdapter(getSupportFragmentManager(), getLifecycle());

        viewPager2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("To Day"));
        tabLayout.addTab(tabLayout.newTab().setText("This Week"));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                tabLayout.selectTab(tabLayout.getTabAt(position));
            }
        });

    }

    public void goBack(View v){
        finish();
    }

}