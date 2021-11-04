package com.htbinh.studentapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.htbinh.studentapp.R;
import com.htbinh.studentapp.Model.LichThiModel;

import java.util.List;

public class LichThiAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<LichThiModel> arraylist;

    public LichThiAdapter(Context context, int layout, List<LichThiModel> arraylist) {
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

        LichThiModel lichthi = arraylist.get(i);

        //ánh xạ
        TextView ngaythi = view.findViewById(R.id.txtngaythi);
        TextView tenlhp = view.findViewById(R.id.txtenlhp);
        TextView tenhp = view.findViewById(R.id.txttenhp);
        TextView giangvien = view.findViewById(R.id.txtgiangvien);
        TextView giothi = view.findViewById(R.id.txtgiothi);
        TextView phongthi = view.findViewById(R.id.txtphongthi);

        ngaythi.setText(lichthi.getNgaythi());
        tenlhp.setText(lichthi.getTenlhp() );
        tenhp.setText(lichthi.getTenhp());
        giangvien.setText(lichthi.getGiangvien());
        giothi.setText(lichthi.getGiothi());
        phongthi.setText(lichthi.getPhongthi());

        Animation anim = AnimationUtils.loadAnimation(context, R.anim.left_slide);
        view.startAnimation(anim);

        return view;
    }
}
