package com.htbinh.studentapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.htbinh.studentapp.Model.KetquaModel;
import com.htbinh.studentapp.R;

import java.util.List;

public class KetquaAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<KetquaModel> ketquaList;

    public KetquaAdapter(Context context, int layout, List<KetquaModel> ketquaList) {
        this.context = context;
        this.layout = layout;
        this.ketquaList = ketquaList;
    }

    @Override
    public int getCount() {
        return (ketquaList == null) ? 0 : ketquaList.size();
    }

    @Override
    public Object getItem(int i) {
        return ketquaList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        TextView txtname=(TextView) view.findViewById(R.id.textviewname);
        TextView txttinchi = (TextView)  view.findViewById(R.id.textViewtc);
        TextView txthocky = (TextView) view.findViewById(R.id.textViewdiem);
        TextView txthocbong = (TextView)  view.findViewById(R.id.textViewhbong);
        TextView txtxeploai = (TextView) view.findViewById(R.id.textViewxl);

        KetquaModel ketqua = ketquaList.get(i);

        txtname.setText((ketqua.getName()));
        txttinchi.setText((ketqua.getTinchi()));
        txthocky.setText((ketqua.getDiemtbhk()));
        txthocbong.setText((ketqua.getDiemtbhb()));
        txtxeploai.setText((ketqua.getXeploai()));

        return view;
    }
}
