package com.htbinh.studentapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.htbinh.studentapp.R;
import com.htbinh.studentapp.Adapter.TkbAdapter;
import com.htbinh.studentapp.Model.TkbModel;

import java.util.ArrayList;

public class ScheduleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        ListView List;
        ArrayList<TkbModel> arraylist;
        TkbAdapter adapter;

        List = findViewById(R.id.tbk_list);

        arraylist = new ArrayList<>();
        arraylist.add(new TkbModel("NGÀY : 04/10/2021(THỨ 2)","Tên môn học: Công nghệ XML (LHP: 121CNX01)","Tiết: 1-2","Giảng viên: Ngô Lê Quân","Phòng học: ONLINE"));
        arraylist.add(new TkbModel("NGÀY : 04/10/2021(THỨ 2)","Tên môn học: Công nghệ XML (LHP: 121CNX01)","Tiết: 1-2","Giảng viên: Ngô Lê Quân","Phòng học: ONLINE"));
        arraylist.add(new TkbModel("NGÀY : 04/10/2021(THỨ 2)","Tên môn học: Công nghệ XML (LHP: 121CNX01)","Tiết: 1-2","Giảng viên: Ngô Lê Quân","Phòng học: ONLINE"));

        adapter = new TkbAdapter(ScheduleActivity.this,R.layout.tbk_item,arraylist);
        List.setAdapter(adapter);
    }
    public void goBack(View v){
        finish();
    }
}