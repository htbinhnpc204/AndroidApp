package com.htbinh.studentapp.Adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.htbinh.studentapp.R;
import com.htbinh.studentapp.Model.TkbModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

        ngay.setText("Môn: " + LICHHOC.getMonhoc());
        monhoc.setText(getThu(getDayOfWeek(LICHHOC.getNgay())));
        tiet.setText("Tiết: " + LICHHOC.getTiet());
        gv.setText("Giảng viên: " + LICHHOC.getGv());
        phong.setText("Phòng: " + LICHHOC.getPhong());

        Animation anim = AnimationUtils.loadAnimation(context, R.anim.left_slide);
        view.startAnimation(anim);

        return view;
    }

    private String getThu(int date){
        switch (date){
            case 1: return "Chủ nhật";
            case 2: return "Thứ 2";
            case 3: return "Thứ 3";
            case 4: return "Thứ 4";
            case 5: return "Thứ 5";
            case 6: return "Thứ 6";
            case 7: return "Thứ 7";
            default: return "None";
        }
    }

    private int getDayOfWeek(String sDate){
        Calendar c = Calendar.getInstance();
        Date myDate = null;
        try {
            myDate = new SimpleDateFormat("dd/MM/yyyy").parse(sDate);
        } catch (ParseException e) {
            Log.i("Date format","Date format error!" + sDate);
        }
        c.setTime(myDate);
        return c.get(Calendar.DAY_OF_WEEK);
    }
}

