package com.htbinh.studentapp.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.htbinh.studentapp.Adapter.TkbAdapter;
import com.htbinh.studentapp.Model.TkbModel;
import com.htbinh.studentapp.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WeekFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeekFragment extends ListFragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    ArrayList<TkbModel> listTKB;
    TkbAdapter adapter;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public WeekFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WeekFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static WeekFragment newInstance(String param1, String param2) {
        WeekFragment fragment = new WeekFragment();
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
        listTKB.add(new TkbModel("06/11/2021","Lập trình di động 1","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("07/11/2021","Lập trình di động 2","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("08/11/2021","Lập trình di động 3","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("09/11/2021","Lập trình di động 4","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("10/11/2021","Lập trình di động 5","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("11/11/2021","Lập trình di động 6","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("12/11/2021","Lập trình di động 7 ","7-9","Đỗ Phú Huy","ONLINE"));
        listTKB.add(new TkbModel("13/11/2021","Lập trình di động 8","7-9","Đỗ Phú Huy","ONLINE"));


        adapter = new TkbAdapter(getActivity(), R.layout.item_tkb_by_week, listTKB);
        setListAdapter(adapter);

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_week, container, false);
    }
}