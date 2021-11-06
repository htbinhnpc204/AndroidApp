package com.htbinh.studentapp.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.htbinh.studentapp.Adapter.ChitietKetQuaAdapter;
import com.htbinh.studentapp.Model.ChitietketquaModel;
import com.htbinh.studentapp.R;

import java.util.ArrayList;

public class ChiTietKetQuaActivity extends AppCompatActivity {

    ListView lvChitietketqua;
    ArrayList<ChitietketquaModel> arrayChitietketqua;
    ChitietKetQuaAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet_ketqua);
        Anhxa();

        arrayChitietketqua = new ArrayList<>();

        arrayChitietketqua.add(new ChitietketquaModel("Kinh tế chính trị (500231)", "2", "8,0",
                "8.0", "7.0", "8.2", "B"));
        arrayChitietketqua.add(new ChitietketquaModel("Lập trình web nâng cao (500231)", "2", "8,0",
                "8.0", "7.0", "8.5", "A"));
        arrayChitietketqua.add(new ChitietketquaModel("Tin học đại cương (500231)", "2", "8,0",
                "8.0", "7.0", "8.2", "B"));
        arrayChitietketqua.add(new ChitietketquaModel("Kinh tế chính trị (500231)", "2", "8,0",
                "8.0", "7.0", "8.2", "B"));
        arrayChitietketqua.add(new ChitietketquaModel("Kinh tế chính trị (500231)", "2", "8,0",
                "8.0", "7.0", "8.2", "B"));
        adapter = new ChitietKetQuaAdapter(this, R.layout.item_chitiet_ketqua, arrayChitietketqua);
        lvChitietketqua.setAdapter(adapter);
    }

    private void Anhxa() {
        lvChitietketqua = (ListView) findViewById(R.id.lvChitietketqua);
    }

    public void goBack(View v) {
        finish();
    }
}
