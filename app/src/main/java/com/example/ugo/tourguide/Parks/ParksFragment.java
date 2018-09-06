package com.example.ugo.tourguide.Parks;


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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_parks, container, false);

        //Create an arraylist of artists
        final ArrayList<Tour> parks = new ArrayList<Tour>();
        parks.add(new Tour(getString(R.string.millenial_park), getString(R.string.park_desc), R.drawable.wakkiss));
        parks.add(new Tour(getString(R.string.edil_park), getString(R.string.park_desc), R.drawable.spicep));
        parks.add(new Tour(getString(R.string.city_park), getString(R.string.park_desc), R.drawable.nkoyop));
        parks.add(new Tour(getString(R.string.jag_park), getString(R.string.park_desc), R.drawable.wilsonn));
        parks.add(new Tour(getString(R.string.matimo_park), getString(R.string.park_desc), R.drawable.blucabanap));
        parks.add(new Tour(getString(R.string.redil_park), getString(R.string.park_desc), R.drawable.wilsonn));
        parks.add(new Tour(getString(R.string.nationa_park), getString(R.string.park_desc), R.drawable.grandsqr));
        parks.add(new Tour(getString(R.string.wunder_park), getString(R.string.park_desc), R.drawable.jevinikp));


        // Create the adapter to convert the array to views
        TourAdapter adapter = new TourAdapter(getActivity(), parks);

        //Create an object of the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list_list);

        // Attach the adapter to a ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Get the {@link Word} object at the given position the user clicked on
                Intent intent = new Intent(getActivity(), ForParks.class);
                startActivity(intent);

            }
        });
        return rootView;
    }

}
