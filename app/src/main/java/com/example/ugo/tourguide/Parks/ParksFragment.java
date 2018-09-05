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
        parks.add(new Tour("Biobak", "A hotel situated in Wuse 2", R.drawable.wilsonn));
        parks.add(new Tour("Biobak", "A hotel situated in Wuse 2", R.drawable.wilsonn));



        // Create the adapter to convert the array to views
        //TourAdapter adapter = new TourAdapter(this, restaurant);
        //Create an ArrayAdapter object, adapter from the Custom ArrayAdapter class, WordAdapter
        TourAdapter adapter = new TourAdapter(getActivity(), parks);

        //Create an object of the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list_list);

        // Attach the adapter to a ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Get the {@link Word} object at the given position the user clicked on
                Tour tour = parks.get(position);

                if (position == 0){
                    Intent intent = new Intent(getActivity(), ForParks.class);
                    startActivity(intent);}else if (position == 1){
                    Intent intent = new Intent(getActivity(), ForParks.class);
                    startActivity(intent);
                }else if (position == 2){
                    Intent intent = new Intent(getActivity(), ForParks.class);
                    startActivity(intent);
                }else if (position == 3){
                    Intent intent = new Intent(getActivity(), ForParks.class);
                    startActivity(intent);
                }else if (position == 4){
                    Intent intent = new Intent(getActivity(), ForParks.class);
                    startActivity(intent);
                }else if (position == 5){
                    Intent intent = new Intent(getActivity(), ForParks.class);
                    startActivity(intent);
                }else if (position == 6){
                    Intent intent = new Intent(getActivity(), ForParks.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(getActivity(), ForParks.class);
                    startActivity(intent);
                }
            }
        });
        return rootView;
    }

}
