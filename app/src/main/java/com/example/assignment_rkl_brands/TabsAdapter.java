package com.example.assignment_rkl_brands;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabsAdapter extends FragmentPagerAdapter {
    public TabsAdapter(@NonNull FragmentManager fragmentManager, int behavior) {
        super(fragmentManager, behavior);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Men men = new Men();
                return men;
            case 1:
                WomenTab womenTab = new WomenTab();
                return womenTab;
            case 2:
                return new AccessoriesTab();

            default: return null;
        }
    }


    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "MEN";
            case 1:
                return "WOMEN";
            case 2:
                return "ACCESSORIES";
            default:
                return null;
        }
    }

}
