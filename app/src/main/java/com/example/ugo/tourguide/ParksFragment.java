package com.example.ugo.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
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
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_restaurant, container, false);

        //Create an arraylist of artists
        final ArrayList<Tour> parks = new ArrayList<Tour>();
        parks.add(new Tour("Wakkis", "A hotel situated in Wuse 2", R.drawable.wakkiss));
        parks.add(new Tour("Wilson", "A hotel situated in Wuse 2", R.drawable.wilsonn));
        parks.add(new Tour("Dunes", "A hotel situated in Wuse 2", R.drawable.restaurant_one));
        parks.add(new Tour("Mama Cass", "A hotel situated in Wuse 2", R.drawable.wilsonn));
        parks.add(new Tour("Jevnik", "A hotel situated in Wuse 2", R.drawable.wilsonn));
        parks.add(new Tour("Biobak", "A hotel situated in Wuse 2", R.drawable.wilsonn));



        // Create the adapter to convert the array to views
        //TourAdapter adapter = new TourAdapter(this, restaurant);
        //Create an ArrayAdapter object, adapter from the Custom ArrayAdapter class, WordAdapter
        TourAdapter adapter = new TourAdapter(getActivity(), parks);

        //Create an object of the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list_list);

        // Attach the adapter to a ListView
        listView.setAdapter(adapter);
        return rootView;
    }

}
