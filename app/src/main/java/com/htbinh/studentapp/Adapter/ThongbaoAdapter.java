package com.htbinh.studentapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.htbinh.studentapp.R;
import com.htbinh.studentapp.Model.ThongbaoModel;

import java.util.List;

public class ThongbaoAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<ThongbaoModel> thongbaoList;

    public ThongbaoAdapter(Context context, int layout, List<ThongbaoModel> thongbaoList) {
        this.context = context;
        this.layout = layout;
        this.thongbaoList = thongbaoList;
    }


    @Override
    public int getCount() {
        return thongbaoList.size();
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

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout,null);

        //ánh xạ vỉew
        TextView txtTen = (TextView)  view.findViewById(R.id.textviewTen);
        TextView txtMoTa = (TextView) view.findViewById(R.id.textviewMoTa);

        // gán giá trị
        ThongbaoModel thongbao = thongbaoList.get(i);

        txtTen.setText((thongbao.getTen()));
        txtMoTa.setText(thongbao.getMoTa());

        Animation anim = AnimationUtils.loadAnimation(context, R.anim.left_slide);
        view.startAnimation(anim);

        return view;
    }
}
