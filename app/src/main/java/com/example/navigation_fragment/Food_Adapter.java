package com.example.navigation_fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Food_Adapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Food> foodList;

    public Food_Adapter(Context context, int layout, List<Food> foodList) {
        this.context =context;

        this.layout = layout;
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        ImageView imgHinh = (ImageView)view.findViewById(R.id.imageviewHinh);
        TextView txtTen = (TextView)view.findViewById(R.id.textviewTen);
        TextView txtgia = (TextView)view.findViewById(R.id.textviewgia);
        TextView txtadd = (TextView)view.findViewById(R.id.textviewadd);
        Food food = foodList.get(position);

        imgHinh.setImageResource(food.getImage());
        txtTen.setText(food.getTen());
        txtgia.setText(food.getGia());
        txtadd.setText(food.getAdd());

        return view;
    }
}