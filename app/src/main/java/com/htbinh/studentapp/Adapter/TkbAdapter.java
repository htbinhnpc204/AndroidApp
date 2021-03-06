package com.htbinh.studentapp.Adapter;

import android.content.Context;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.htbinh.studentapp.R;
import com.htbinh.studentapp.Model.TkbModel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TkbAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<TkbModel> arraylist;
    private  List<String> listThu;

    public TkbAdapter(Context context, int layout, List<TkbModel> arraylist, List<String> listThu) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
        this.listThu = listThu;
    }

    @Override
    public int getCount() {
        return listThu.size();
    }

    @Override
    public Object getItem(int i) {
        return listThu.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //LastUPDATE

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        view = inflater.inflate(layout, null);

        //ánh xạ
        TextView ngay = view.findViewById(R.id.textview_ngay);
        ListView lv = view.findViewById(R.id.listMonHoc);
        CardView expandable = view.findViewById(R.id.expandable);
        LinearLayout area = view.findViewById(R.id.expandArea);

        List<TkbModel> tmp = new ArrayList<>();

        for (TkbModel item:
             arraylist) {
            if (getThu(getDayOfWeek(item.getNgay())).equals(listThu.get(i))){
                tmp.add(item);
            }
        }

        ngay.setText(listThu.get(i));

        Animation anim = AnimationUtils.loadAnimation(context, R.anim.left_slide);
        view.startAnimation(anim);

        TkbOfDayAdapter adapter = new TkbOfDayAdapter(viewGroup.getContext(), R.layout.item_tkb_by_day, tmp);
        lv.setAdapter(adapter);

        TextView more = view.findViewById(R.id.viewMore);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                if(area.getVisibility() == View.GONE){
                    more.setText("Thu gọn");
                    TransitionManager.beginDelayedTransition(expandable, new AutoTransition());
                    area.setVisibility(View.VISIBLE);
                }else{
                    more.setText("Xem thêm");
                    TransitionManager.beginDelayedTransition(expandable, new AutoTransition());
                    area.setVisibility(View.GONE);
                }
            }
        });

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

