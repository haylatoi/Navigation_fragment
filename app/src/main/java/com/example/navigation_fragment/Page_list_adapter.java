package com.example.navigation_fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class Page_list_adapter extends FragmentStatePagerAdapter {
    int mNoOfTabke;

    public  Page_list_adapter(FragmentManager fm,int Num)
    {
        super(fm);
        this.mNoOfTabke=Num;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                List_banchay banchay = new List_banchay();
                return banchay;
            case 1:
                List_banchay banchay1 = new List_banchay();
                return banchay1;
            case 2:
                List_banchay banchay2 = new List_banchay();
                return banchay2;
            case 3:
                List_banchay banchay3 = new List_banchay();
                return banchay3;
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabke;
    }
}
