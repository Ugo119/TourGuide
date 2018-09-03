package com.example.ugo.tourguide;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourFragmentPagerAdapter extends FragmentPagerAdapter {
    public TourFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HomeFragment();
        }else if (position == 1){return new RestaurantFragment();}
        else if (position == 2){return new SuperMarketFragment();}
        else if (position == 3){return new ParksFragment();}
        else if (position == 4){return new HospitalsFragment();}
        else{return new LoungesFragment();}

    }

    @Override
    public int getCount() {
        return 6;
    }
}
