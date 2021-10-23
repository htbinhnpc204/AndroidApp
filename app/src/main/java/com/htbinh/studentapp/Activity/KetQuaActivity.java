package com.htbinh.studentapp.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import com.htbinh.studentapp.Adapter.KetquaAdapter;
import com.htbinh.studentapp.Model.KetquaModel;
import com.htbinh.studentapp.R;

import java.util.ArrayList;

public class KetQuaActivity extends AppCompatActivity {

    ListView lvKetqua;
    ArrayList<KetquaModel> arrayKetqua;

    KetquaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);
        Anhxa();
        arrayKetqua = new ArrayList<>();
        arrayKetqua.add(new KetquaModel(" 1 - Năm học 2021-2022", "24","8","3","Gioi"));
        arrayKetqua.add(new KetquaModel(" 1 - Năm học 2021-2022", "20","10","4","xuat sac"));
        arrayKetqua.add(new KetquaModel(" 1 - Năm học 2021-2022", "21","6.5","2.3","Binh thuong"));
        adapter = new KetquaAdapter(this, R.layout.ketqua_item,arrayKetqua);
        lvKetqua.setAdapter(adapter);
    }
    private void Anhxa() {
        lvKetqua = (ListView) findViewById(R.id.lvKetqua);
    }
    public void goBack(View v){
        finish();
    }
}