package com.htbinh.studentapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.htbinh.studentapp.Adapter.LichThiAdapter;
import com.htbinh.studentapp.R;
import com.htbinh.studentapp.Model.LichThiModel;

import java.util.ArrayList;

public class LichThiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lich_thi);

        ListView List;
        ArrayList<LichThiModel> arraylist;
        LichThiAdapter adapter;

        List = findViewById(R.id.listView);

        arraylist = new ArrayList<>();
        arraylist.add(new LichThiModel("NGÀY THI: 29/06/2021","TÊN LỚP HP: 220LTTQ02","TÊN HP: Lập trình trực quan","GIẢNG VIÊN: Hoàng Thị Mỹ Lệ","GIỜ THI: 21h00","ONLINE"));
        arraylist.add(new LichThiModel("NGÀY THI: 29/06/2021","TÊN LỚP HP: 220LTTQ02","TÊN HP: Lập trình trực quan","GIẢNG VIÊN: Hoàng Thị Mỹ Lệ","GIỜ THI: 22h00","ONLINE"));
        arraylist.add(new LichThiModel("NGÀY THI: 01/07/2021","TÊN LỚP HP: 220NNCNC02","TÊN HP: Ngoại ngữ chuyên ngành công nghệ thông tin","GIẢNG VIÊN: Võ Trung Hùng","GIỜ THI: 17h00-19h00","ONLINE"));
        arraylist.add(new LichThiModel("NGÀY THI: 24/07/2021","TÊN LỚP HP: 220VKT01","TÊN HP: Vẽ kỹ thuật","GIẢNG VIÊN: Nguyễn Đức Sỹ","GIỜ THI: 13h00","ONLINE"));
        arraylist.add(new LichThiModel("NGÀY THI: 24/07/2021","TÊN LỚP HP: 220VKT01","TÊN HP: Vẽ kỹ thuật","GIẢNG VIÊN: Nguyễn Đức Sỹ","GIỜ THI: 13h00","ONLINE"));

        adapter = new LichThiAdapter(LichThiActivity.this,R.layout.lichthi_item,arraylist);
        List.setAdapter(adapter);
    }
    public void goBack(View v){
        finish();
    }
}