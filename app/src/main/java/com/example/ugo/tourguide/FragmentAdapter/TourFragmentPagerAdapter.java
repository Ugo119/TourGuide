package com.example.ugo.tourguide.FragmentAdapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.ugo.tourguide.HomeFragment;
import com.example.ugo.tourguide.Hospitals.HospitalsFragment;
import com.example.ugo.tourguide.Lounges.LoungesFragment;
import com.example.ugo.tourguide.Parks.ParksFragment;
import com.example.ugo.tourguide.R;
import com.example.ugo.tourguide.Restaurants.RestaurantFragment;
import com.example.ugo.tourguide.Supermarkets.SuperMarketFragment;

import java.util.ArrayList;
import java.util.List;


public class TourFragmentPagerAdapter extends FragmentPagerAdapter {

    private final List<String> FragmentListTitles = new ArrayList<>();
    private final List<Fragment> fragmentList = new ArrayList<>();

    public TourFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
       return fragmentList.get(position);


        /*if (position == 0) {
            return new HomeFragment();
        } else if (position == 1) {
            return new RestaurantFragment();
        } else if (position == 2) {
            return new SuperMarketFragment();
        } else if (position == 3) {
            return new ParksFragment();
        } else if (position == 4) {
            return new HospitalsFragment();
        } else {
            return new LoungesFragment();
        }*/

    }

    @Override
    public int getCount() {
        return 6;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentListTitles.get(position);
    }

    public void AddFragment (Fragment fragment, String Title){
        fragmentList.add(fragment);
        FragmentListTitles.add(Title);
    }
}
