package com.htbinh.studentapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.htbinh.studentapp.Adapter.TkbOfDayAdapter;
import com.htbinh.studentapp.Model.TkbModel;
import com.htbinh.studentapp.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DayFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DayFragment extends ListFragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ArrayList<TkbModel> listTKB;
    TkbOfDayAdapter adapter;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DayFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static DayFragment newInstance(String param1, String param2) {
        DayFragment fragment = new DayFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        listTKB = new ArrayList<>();
        listTKB.add(new TkbModel("08/11/2021","Lập trình di động 1","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("09/11/2021","Lập trình di động 2","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("10/11/2021","Lập trình di động 3","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("11/11/2021","Lập trình di động 4","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("12/11/2021","Lập trình di động 5","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("13/11/2021","Lập trình di động 6","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("13/11/2021","Lập trình di động 7","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("14/11/2021","Lập trình di động 8","7-9","Đỗ Phú Huy","ONLINE"));

        ArrayList<TkbModel> tmp = new ArrayList<>();

        for (TkbModel item:
             listTKB) {
            if(getDayOfWeek() == getDayOfWeek(item.getNgay())){
                tmp.add(item);
            }
        }

        adapter = new TkbOfDayAdapter(getActivity(), R.layout.item_tkb_by_day, tmp);
        setListAdapter(adapter);

        return inflater.inflate(R.layout.fragment_day, container, false);
    }

    private int getDayOfWeek(){
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        return c.get(Calendar.DAY_OF_WEEK);
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