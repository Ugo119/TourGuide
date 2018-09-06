package com.example.ugo.tourguide.Supermarkets;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ugo.tourguide.ArrayAdapter.Tour;
import com.example.ugo.tourguide.ArrayAdapter.TourAdapter;
import com.example.ugo.tourguide.R;

import java.util.ArrayList;


/*
 * A simple {@link Fragment} subclass.
 */
public class SuperMarketFragment extends Fragment {


    public SuperMarketFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_super_market, container, false);

        //Create an arraylist of artists
        final ArrayList<Tour> supmarket = new ArrayList<Tour>();
        supmarket.add(new Tour(getString(R.string.grand_square), getString(R.string.supermarket_desc), R.drawable.wakkisp));
        supmarket.add(new Tour(getString(R.string.xclusive_stores), getString(R.string.supermarket_desc), R.drawable.spicep));
        supmarket.add(new Tour(getString(R.string.chemzho_stores), getString(R.string.supermarket_desc), R.drawable.jevinikp));
        supmarket.add(new Tour(getString(R.string.taru_stores), getString(R.string.supermarket_desc), R.drawable.nkoyop));
        supmarket.add(new Tour(getString(R.string.ibe_stores), getString(R.string.supermarket_desc), R.drawable.blucabanap));
        supmarket.add(new Tour(getString(R.string.king_stores), getString(R.string.supermarket_desc), R.drawable.charcoalp));
        supmarket.add(new Tour(getString(R.string.sido_stores), getString(R.string.supermarket_desc), R.drawable.mamacassp));
        supmarket.add(new Tour(getString(R.string.chevo_stores), getString(R.string.supermarket_desc), R.drawable.mamacassp));


        // Create the adapter to convert the array to views
        TourAdapter adapter = new TourAdapter(getActivity(), supmarket);

        //Create an object of the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list_list);

        // Attach the adapter to a ListView
        listView.setAdapter(adapter);

        //set the itemclicklistener for each item in the list.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Get the {@link Word} object at the given position the user clicked on

                Intent intent = new Intent(getActivity(), ForSupermarkets.class);
                startActivity(intent);

            }
        });
        return rootView;
    }

}
