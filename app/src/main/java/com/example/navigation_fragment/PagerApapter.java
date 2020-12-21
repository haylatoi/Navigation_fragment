package com.example.navigation_fragment;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerApapter extends FragmentStatePagerAdapter {
    int mNoOfTabke;

    public  PagerApapter(FragmentManager fm,int Num)
    {
        super(fm);
     this.mNoOfTabke=Num;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
dangden dangden=new dangden();

            return dangden;
            case 1:
                lichsu lichsu=new lichsu();

                return lichsu;
            case 2:
                DonNhap donNhap=new DonNhap();

                return donNhap;
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabke;
    }
}
