package com.htbinh.studentapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.htbinh.studentapp.R;
import com.htbinh.studentapp.Model.TkbModel;

import java.util.List;

public class TkbAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<TkbModel> arraylist;

    public TkbAdapter(Context context, int layout, List<TkbModel> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);
        TkbModel LICHHOC = arraylist.get(i);

        //ánh xạ
        TextView ngay = view.findViewById(R.id.textview_ngay);
        TextView monhoc = view.findViewById(R.id.textview_monhoc);
        TextView tiet = view.findViewById(R.id.textview_tiet);
        TextView gv = view.findViewById(R.id.textview_gv);
        TextView phong = view.findViewById(R.id.textview_phong);

        ngay.setText(LICHHOC.getNgay());
        monhoc.setText(LICHHOC.getMonhoc());
        tiet.setText(LICHHOC.getTiet());
        gv.setText(LICHHOC.getGv());
        phong.setText(LICHHOC.getPhong());

        return view;
    }


}

