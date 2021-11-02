package com.htbinh.studentapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.htbinh.studentapp.MainActivity;
import com.htbinh.studentapp.R;

import java.util.Map;

public class HomePageActivity extends AppCompatActivity {

    TextView name, msv, khoa, nganh, ngaySinh, lop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Mapping();
    }

    private void Mapping(){
        name = findViewById(R.id.name);
        msv = findViewById(R.id.name);
        khoa = findViewById(R.id.khoa);
        nganh = findViewById(R.id.nganh);
        ngaySinh = findViewById(R.id.dob);
        lop = findViewById(R.id.lop);
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
        SharedPreferences sharedPreferences = getSharedPreferences("checkbox", MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("remember", "false");
        editor.apply();
        Intent in = new Intent(HomePageActivity.this, MainActivity.class);
        startActivity(in);
        finish();
    }
}