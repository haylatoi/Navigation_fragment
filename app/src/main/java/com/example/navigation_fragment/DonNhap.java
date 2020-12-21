package com.example.navigation_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class DonNhap extends Fragment {
    ListView listView;
    Spinner spinner;
    GridView lvFood;
    ArrayList<MyAdapter> myAdapterArrayList ;
    MyAdapter_list myAdapter;

    //int imgs[]={R.drawable.tocoto,R.drawable.tralong,R.drawable.teamilk,R.drawable.quandep,R.drawable.bundau,R.drawable.tocoto,R.drawable.tocoto,R.drawable.tocoto,R.drawable.tocoto};
   // String tenQuan[]={"Trà sữa ông nội","Bông","Quán ăn vặt","TocoToco","Bún đậu mắm tôm cô tiên","Phở bà bảy","Quán 10 khó","Mì siêu cay","Chân gà siêu ngon"};
  //  String address[]={"01 nguyễn quốc toản","02 hai bà trưng","13 ông ích khiêm","02 thanh sơn","05 bạch đằng","01 nguyễn quốc toản","02 hai bà trưng","13 ông ích khiêm","02 thanh sơn","05 bạch đằng","09 điện biên phủ"};
//String gia[]={"12.000đ","78.030đ","30.000đ","90.000đ","38383","12.000đ","78.030đ","30.000đ","90.000đ"};
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DonNhap() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DonNhap.
     */
    // TODO: Rename and change types and number of parameters
    public static DonNhap newInstance(String param1, String param2) {
        DonNhap fragment = new DonNhap();
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
        View rootView= inflater.inflate(R.layout.fragment_don_nhap, container, false);
//add spiner
        spinner=rootView.findViewById(R.id.muc);
        listView=rootView.findViewById(R.id.listViewDonNhap);
//        String[] textSize=getResources().getStringArray(R.array.font_sizes);
        String[] text =getResources().getStringArray(R.array.font_sizes);
//        DonNhap.MyAdapter adapter=new DonNhap.MyAdapter(getActivity())
//MyAdapter adapter=new MyAdapter(getActivity(),tenQuan,address,gia,imgs);
        ArrayAdapter adapter22 =new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,text);
        adapter22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter22);
//listView.setAdapter(adapter);

        return rootView;
    }


    public interface OnFragmentInteractionListener {
    }
}