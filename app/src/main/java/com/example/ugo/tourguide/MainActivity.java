package com.example.ugo.tourguide;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.ugo.tourguide.FragmentAdapter.TourFragmentPagerAdapter;
import com.example.ugo.tourguide.Hospitals.HospitalsFragment;
import com.example.ugo.tourguide.Lounges.LoungesFragment;
import com.example.ugo.tourguide.Parks.ParksFragment;
import com.example.ugo.tourguide.Restaurants.RestaurantFragment;
import com.example.ugo.tourguide.Supermarkets.SuperMarketFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        // Find the view pager that will allow the user to swipe between fragments
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        // Create an adapter that knows which fragment should be shown on each page
        TourFragmentPagerAdapter adapter = new TourFragmentPagerAdapter(getSupportFragmentManager());

        //Adding fragments
        adapter.AddFragment(new HomeFragment(), "Home");
        adapter.AddFragment(new RestaurantFragment(), "Restaurants");
        adapter.AddFragment(new SuperMarketFragment(), "Supermarkets");
        adapter.AddFragment(new ParksFragment(), "Parks");
        adapter.AddFragment(new HospitalsFragment(), "Hospitals");
        adapter.AddFragment(new LoungesFragment(), "Lounges");

        // Set the adapter onto the view pager
        viewPager.setAdapter(adapter);

        // Find the tab layout that shows the tabs
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        // Connect the tab layout with the view pager. This will
        //   1. Update the tab layout when the view pager is swiped
        //   2. Update the view pager when a tab is selected
        //   3. Set the tab layout's tab names with the view pager's adapter's titles
        //      by calling onPageTitle()
        tabLayout.setupWithViewPager(viewPager);
    }
}
