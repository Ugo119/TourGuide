package com.example.ugo.tourguide.Lounges;


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
public class LoungesFragment extends Fragment {


    public LoungesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_lounges, container, false);

        //Create an arraylist of artists
        final ArrayList<Tour> lounge = new ArrayList<Tour>();
        lounge.add(new Tour(getString(R.string.sofia_lounge), getString(R.string.lounge_desc), R.drawable.wakkiss));
        lounge.add(new Tour(getString(R.string.play_lounge), getString(R.string.lounge_desc), R.drawable.wilsonn));
        lounge.add(new Tour(getString(R.string.darnet_lounge), getString(R.string.lounge_desc), R.drawable.restaurant_one));
        lounge.add(new Tour(getString(R.string.the_barn_lounge), getString(R.string.lounge_desc), R.drawable.wilsonn));
        lounge.add(new Tour(getString(R.string.oven_lounge), getString(R.string.lounge_desc), R.drawable.wilsonn));
        lounge.add(new Tour(getString(R.string.natil_lounge), getString(R.string.lounge_desc), R.drawable.nkoyop));
        lounge.add(new Tour(getString(R.string.avalange_lounge), getString(R.string.lounge_desc), R.drawable.spicep));
        lounge.add(new Tour(getString(R.string.rek_lounge), getString(R.string.lounge_desc), R.drawable.jevinikp));


        // Create the adapter to convert the array to views
        TourAdapter adapter = new TourAdapter(getActivity(), lounge);

        //Create an object of the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list_list);

        // Attach the adapter to a ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Get the {@link Word} object at the given position the user clicked on
                Intent intent = new Intent(getActivity(), ForLounges.class);
                startActivity(intent);

            }
        });
        return rootView;
    }

}
