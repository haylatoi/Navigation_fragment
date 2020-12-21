package com.example.navigation_fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class List_banchay extends Fragment {
    ListView listView;
    Spinner spinner;
    ListView lvFood;
    ArrayList<MyAdapter>  myAdapterArrayList ;
    MyAdapter_list myAdapter;
    MyAdapter pp;
    String ten;
    Dialog dialog;
    int hinh;

    //int imgs[]={R.drawable.comli1,R.drawable.comli2,R.drawable.comli3,R.drawable.comli4,R.drawable.bundau,R.drawable.comli5,R.drawable.comli6};
   // String tenQuan[]={"Cơm tấm Vườn chuối","Tiệm ăn Chợ Lớn","Quán chay Phước Vegan","Cơm chay Đà Nẵng","Quán ngon Đà Thành","Cơm gà xối mỡ","Cơm tấm Hà Nội"};
   // String diachi[]={"01 nguyễn quốc toản","02 hai bà trưng","13 ông ích khiêm","02 thanh sơn","05 bạch đằng","01 nguyễn quốc toản","02 hai bà trưng"};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public List_banchay() {
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
    public static List_banchay newInstance(String param1, String param2) {
        List_banchay fragment = new List_banchay();
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
        String urlGetData = "http://192.168.1.11:80/android/selectProduct.php";
        lvFood=v.findViewById(R.id.listview_banchay);
        myAdapterArrayList = new ArrayList<>();
        GetData(urlGetData);

        myAdapter = new MyAdapter_list(getActivity(),R.layout.row_list,myAdapterArrayList);
        lvFood.setAdapter(myAdapter);
        //GetData(urlGetData);

//        String[] textSize=getResources().getStringArray(R.array.font_sizes);
        //String[] text =getResources().getStringArray(R.array.font_sizes);
//        DonNhap.MyAdapter adapter=new DonNhap.MyAdapter(getActivity())
       // MyAdapter_list adapter=new MyAdapter_list(getActivity(),tenQuan,diachi,imgs);
//        ArrayAdapter adapter22 =new ArrayAdapter(getActivity(),android.R.layout.simple_spinner_item,text);
//        adapter22.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    //    spinner.setAdapter(adapter22);
       // listView.setAdapter(adapter);

        lvFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                chitietcuahang listComLayout = new chitietcuahang();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_container, listComLayout);
                transaction.commit();
            }
        });

        return v;
    }
    private void GetData(String url) {

        RequestQueue requestQueue = Volley.newRequestQueue(getActivity());
        JsonArrayRequest jsonArrayRequest= new JsonArrayRequest(Request.Method.GET, url, null, new com.android.volley.Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response){

                for(int i=0;i<response.length();i++)
                {
                    try {
                        JSONObject object = response.getJSONObject(i);
                        myAdapterArrayList.add(new MyAdapter(
                                object.getString("ImgSP"),
                                object.getString("TenSP"),
                                object.getString("Diachi")
                                )
                        );
                    } catch (JSONException e) {
                        e.printStackTrace();


                    }
                }
                myAdapter.notifyDataSetChanged();

            }
        },
                new com.android.volley.Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error){
                        Toast.makeText(getActivity(), error.toString(), Toast.LENGTH_LONG).show();
                    }
                }
        );
        requestQueue.add(jsonArrayRequest);


    }
    private void GetDuLieuList(String url, final String id){

        RequestQueue requestQueue= Volley.newRequestQueue(getActivity());
        StringRequest stringRequest =new StringRequest(Request.Method.POST, url,
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        if(response!=null)
                        {
                            try {
                                JSONArray jsonArray=new JSONArray(response);
                                for(int i=0;i<jsonArray.length();i++)
                                {
                                    JSONObject object=jsonArray.getJSONObject(i);
                                    myAdapterArrayList.add(new MyAdapter(
                                            object.getString("ImgSP"),
                                            object.getString("TenSP"),
                                            object.getString("Diachi")

                                            )
                                    );
                                }
                                myAdapter.notifyDataSetChanged();
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getActivity(), error.toString(), Toast.LENGTH_LONG).show();
                }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String,String> prams=new HashMap<String,String>();
                prams.put("IDTYPE",id);
                return prams;
            }
        };
        requestQueue.add(stringRequest);
    }





}