package com.htbinh.studentapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.htbinh.studentapp.Model.ChitietketquaModel;
import com.htbinh.studentapp.R;

import java.util.List;

public class ChitietKetQuaAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<ChitietketquaModel>chitietketquaList;

    public ChitietKetQuaAdapter(Context context, int layout, List<ChitietketquaModel> chitietketquaList) {
        this.context = context;
        this.layout = layout;
        this.chitietketquaList = chitietketquaList;
    }

    @Override
    public int getCount() {
        return (chitietketquaList== null) ? 0 : chitietketquaList.size();
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
        //ánh xạ view
        TextView txttenhp =(TextView) view.findViewById(R.id.textviewtenhp);
        TextView txtsotc = (TextView) view.findViewById(R.id.textviewsotc);
        TextView txtdiemcc = (TextView) view.findViewById(R.id.textviewdiemcc);
        TextView txtdiemgk = (TextView) view.findViewById(R.id.textviewdiemgk);
        TextView txtdiemck = (TextView) view.findViewById(R.id.textviewdiemck);
        TextView txtdiemtk = (TextView) view.findViewById(R.id.textviewdiemtk);
        TextView txtdiemc = (TextView) view.findViewById(R.id.textviewdiemc);

        //gán giá trị
        ChitietketquaModel chitietketqua =chitietketquaList.get(i);

        txttenhp.setText(chitietketqua.getTenHP());
        txtsotc.setText(chitietketqua.getSotc());
        txtdiemcc.setText(chitietketqua.getDiemcc());
        txtdiemgk.setText(chitietketqua.getDiemgk());
        txtdiemck.setText(chitietketqua.getDiemck());
        txtdiemtk.setText(chitietketqua.getDiemtk());
        txtdiemc.setText(chitietketqua.getDiemchu());

        Animation anim = AnimationUtils.loadAnimation(context, R.anim.left_slide);
        view.startAnimation(anim);

        return view;
    }
}
