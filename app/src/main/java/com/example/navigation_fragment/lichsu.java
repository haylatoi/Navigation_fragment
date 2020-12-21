package com.example.navigation_fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;


public class lichsu extends Fragment {
private Spinner spinner1,spinner2;
Button datlai;








    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public lichsu() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment lichsu.
     */
    // TODO: Rename and change types and number of parameters
    public static lichsu newInstance(String param1, String param2) {
       lichsu fragment = new lichsu();
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
        View a= inflater.inflate(R.layout.fragment_lichsu, container, false);
        spinner1 =a.findViewById(R.id.hang);
        String[] textSize=getResources().getStringArray(R.array.font_sizes);
        spinner2 =a.findViewById(R.id.hang2);
        String[] textSize1=getResources().getStringArray(R.array.font_size);

        ArrayAdapter adapter =new ArrayAdapter(getActivity(),
                android.R.layout.simple_spinner_item,textSize);
        ArrayAdapter adapter1 =new ArrayAdapter(getActivity(),
                android.R.layout.simple_spinner_item,textSize1);

adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
spinner1.setAdapter(adapter);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter1);
        datlai=(Button) a.findViewById(R.id.datlai);
        datlai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(),chitietdonhang.class);
                startActivity(intent);
            }
        });


        return a;
    }


    public interface OnFragmentInteractionListener {
    }
}