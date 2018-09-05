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

    //create an array for both the fragments and titles
    private final List<String> FragmentListTitles = new ArrayList<>();
    private final List<Fragment> fragmentList = new ArrayList<>();

    public TourFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    //Create a method to get each fragment using their position
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    //Create a method to return the number of fragments.
    @Override
    public int getCount() {
        return 6;
    }

    //Create a method to get each page title and label accordingly.
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return FragmentListTitles.get(position);
    }

    public void AddFragment(Fragment fragment, String Title) {
        fragmentList.add(fragment);
        FragmentListTitles.add(Title);
    }
}
