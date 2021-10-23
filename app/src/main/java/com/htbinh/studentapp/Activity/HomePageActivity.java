package com.htbinh.studentapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.htbinh.studentapp.MainActivity;
import com.htbinh.studentapp.R;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void tkb_Click(View v){
        Intent in = new Intent(HomePageActivity.this, ScheduleActivity.class);
        startActivity(in);
    }

    public void lichThi_Click(View v){
        Intent in = new Intent(HomePageActivity.this, LichThiActivity.class);
        startActivity(in);
    }

    public void ketQua_Click(View v){
        Intent in = new Intent(HomePageActivity.this, KetQuaActivity.class);
        startActivity(in);
    }

    public void thongBao_Click(View v){
        Intent in = new Intent(HomePageActivity.this, ThongBaoActivity.class);
        startActivity(in);
    }

    public void logout_Click(View v){
        Intent in = new Intent(HomePageActivity.this, MainActivity.class);
        startActivity(in);
    }
}