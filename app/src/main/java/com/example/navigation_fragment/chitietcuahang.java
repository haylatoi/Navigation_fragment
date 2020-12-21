package com.example.navigation_fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link chitietcuahang#newInstance} factory method to
 * create an instance of this fragment.
 */
public class chitietcuahang extends Fragment {
    ListView lvFood;
    ArrayList<Food> arrayFood;
    Food_Adapter adapter;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public chitietcuahang() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment chitietcuahang.
     */
    // TODO: Rename and change types and number of parameters
    public static chitietcuahang newInstance(String param1, String param2) {
        chitietcuahang fragment = new chitietcuahang();
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
        View v= inflater.inflate(R.layout.fragment_chitietcuahang, container, false);
        lvFood =(ListView) v.findViewById(R.id.listview);
        AddFood();
        adapter = new Food_Adapter(getActivity(),R.layout.item_food,arrayFood);
        lvFood.setAdapter(adapter);
        // lỗi chỗ này nè
        return v;

    }
    private void AddFood(){

        arrayFood = new ArrayList<>();
        arrayFood.add(new Food(R.drawable.rice1,"Cơm tấm sườn trứng","30000đ","+"));
        arrayFood.add(new Food(R.drawable.rice2,"Cơm tấm sườn bì","20000đ","+"));
        arrayFood.add(new Food(R.drawable.rice3,"Cơm tấm sườn chả","60000đ","+"));
        arrayFood.add(new Food(R.drawable.rice4,"Cơm tấm sườn lạp xưởng","25000đ","+"));
        arrayFood.add(new Food(R.drawable.rice5,"Cơm tấm sườn bì trứng","22000đ","+"));
        arrayFood.add(new Food(R.drawable.rice6,"Cơm tấm sườn bì chả","40000đ","+"));
        arrayFood.add(new Food(R.drawable.rice7,"Cơm gà chiên nước mắm","35000đ","+"));
        arrayFood.add(new Food(R.drawable.rice8,"Cơm trắng","2000đ","+"));
        arrayFood.add(new Food(R.drawable.rice9,"Cơm gà xé","25000đ","+"));
        arrayFood.add(new Food(R.drawable.rice10,"Cớm chiên","30000đ","+"));

    }
}