package com.example.navigation_fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;


public class List_ganday extends Fragment {
    ListView listView;
    Spinner spinner;

    int imgs[]={R.drawable.comli7,R.drawable.comli6,R.drawable.comli3,R.drawable.comli1,R.drawable.comli4,R.drawable.comli7,R.drawable.comli5,R.drawable.comli2,R.drawable.comli3};
    String tenQuan[]={"Quán cơm sinh viên","Cơm Đại","Cơm sườn","Cơm Tấm Cao Thắng","Quán ăn ngon","Quán cơm nhanh","Quán 10 khó","Mì siêu cay","Chân gà siêu ngon"};
    String diachi[]={"48 Cao Thắng","02 Thanh Sơn","13 ông ích khiêm","25 Cao Thắng","05 bạch đằng","01 nguyễn quốc toản","17 Cao Thắng","13 ông ích khiêm","02 thanh sơn","05 bạch đằng","09 điện biên phủ"};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public List_ganday() {
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
    public static List_ganday newInstance(String param1, String param2) {
        List_ganday fragment = new List_ganday();
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
        View v= inflater.inflate(R.layout.fragment_banchay, container, false);
//add spiner

        listView=v.findViewById(R.id.listview_banchay);
//        String[] textSize=getResources().getStringArray(R.array.font_sizes);
        String[] text =getResources().getStringArray(R.array.font_sizes);
//        DonNhap.MyAdapter adapter=new DonNhap.MyAdapter(getActivity())
       // MyAdapter_list adapter=new MyAdapter_list(getActivity(),tenQuan,diachi,imgs);
//        ArrayAdapter adapter22 =new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,text);
//        adapter22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //    spinner.setAdapter(adapter22);
        //listView.setAdapter(adapter);

        return v;
    }


    public interface OnFragmentInteractionListener {
    }
}