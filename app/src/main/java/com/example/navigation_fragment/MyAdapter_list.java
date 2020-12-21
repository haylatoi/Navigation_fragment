package com.example.navigation_fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter_list extends BaseAdapter {
    private Context context;
    private int layout;
    private List<MyAdapter> myAdapter_list;
    //private MyAdapter myAdapter;
    MyAdapter myAdapter;


    public MyAdapter_list(Context context, int layout, List<MyAdapter> myAdapter_list) {
        this.context = context;
        this.layout = layout;
        this.myAdapter_list = myAdapter_list;

    }



    @Override
    public int getCount() {
        return myAdapter_list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }
    public class ViewHolder{
        TextView txtTen;
        ImageView imgHinh;
        TextView textView;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if(view==null){
            holder= new ViewHolder();
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder.txtTen  = (TextView)view.findViewById(R.id.txttitle);
            holder.imgHinh = (ImageView)view.findViewById(R.id.image_list);
            holder.textView=(TextView) view.findViewById(R.id.txtadr);
            view.setTag(holder);
        }
        else{
            holder= (ViewHolder) view.getTag();
        }


        myAdapter = myAdapter_list.get(position);
        holder.txtTen.setText(myAdapter.getTenQuan());
        Picasso.with(context).load(myAdapter.getImgs())
                .placeholder(R.drawable.nowlogo)
                .into(holder.imgHinh);


        return view;
    }
}
