package com.example.navigation_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link fragmetnt_diachi#newInstance} factory method to
 * create an instance of this fragment.
 */
public class fragmetnt_diachi extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public fragmetnt_diachi() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment fragmetnt_diachi.
     */
    // TODO: Rename and change types and number of parameters
    public static fragmetnt_diachi newInstance(String param1, String param2) {
        fragmetnt_diachi fragment = new fragmetnt_diachi();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_diachi, container, false);
        ImageButton diachi_themmoi = (ImageButton) v.findViewById(R.id.diachi_themmoi);
        diachi_themmoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_diachidinhvi diachi_dinhvi = new fragment_diachidinhvi();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_container, diachi_dinhvi);
                transaction.commit();
            }
        });
        return v;
    }
}