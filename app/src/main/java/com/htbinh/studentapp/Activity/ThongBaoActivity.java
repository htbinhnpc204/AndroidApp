package com.htbinh.studentapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.htbinh.studentapp.R;
import com.htbinh.studentapp.Adapter.ThongbaoAdapter;
import com.htbinh.studentapp.Model.ThongbaoModel;

import java.util.ArrayList;

public class ThongBaoActivity extends AppCompatActivity {

    ListView lvThongbao;
    ArrayList<ThongbaoModel> arrayThongbao;
    ThongbaoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thong_bao);

        Anhxa();
        arrayThongbao = new ArrayList<>();
        arrayThongbao.add(new ThongbaoModel("Ngô Lê Quân",
                "Thông báo đến lớp học phần: 121TCNX04, 121TCNX05- Ngày: 17/09/2021"));
        arrayThongbao.add(new ThongbaoModel("Ngô Lê Quân","Thông báo đến lớp học phần: 121TCNX04, 121TCNX05- Ngày: 17/09/2021"));
        arrayThongbao.add(new ThongbaoModel("Trà My",
                "Thông báo đến lớp học phần: 121TCNX04, 121TCNX05- Ngày: 17/09/2021"));
        arrayThongbao.add(new ThongbaoModel("Đỗ Phú HUy",
                "Thông báo đến lớp học phần: 121TCNX04, 121TCNX05- Ngày: 17/09/2021"));
        arrayThongbao.add(new ThongbaoModel("Ngô Lê Quân",
                "Thông báo đến lớp học phần: 121TCNX04, 121TCNX05- Ngày: 17/09/2021"));
        adapter = new ThongbaoAdapter(this, R.layout.thongbao_item,arrayThongbao);
        lvThongbao.setAdapter(adapter);

    }
    private void Anhxa(){
        lvThongbao = (ListView) findViewById(R.id.listviewthongbao);
    }

    public void viewAll(View v){
        setContentView(R.layout.thongbao_chitiet);
    }

    public void goBack(View v){
        finish();
    }
}