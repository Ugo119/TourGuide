package com.example.ugo.tourguide;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/*
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {



    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_restaurant, container, false);
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_restaurant, container, false);

        //Create an arraylist of artists
         final ArrayList<Tour> restaurant = new ArrayList<Tour>();
        restaurant.add(new Tour("Wakkis", "A hotel situated in Wuse 2", R.drawable.wakkiss));
        restaurant.add(new Tour("Wilson", "A hotel situated in Wuse 2", R.drawable.wilsonn));
        restaurant.add(new Tour("Dunes", "A hotel situated in Wuse 2", R.drawable.restaurant_one));
        restaurant.add(new Tour("Mama Cass", "A hotel situated in Wuse 2", R.drawable.wilsonn));
        restaurant.add(new Tour("Jevnik", "A hotel situated in Wuse 2", R.drawable.wilsonn));
        restaurant.add(new Tour("Biobak", "A hotel situated in Wuse 2", R.drawable.wilsonn));



        // Create the adapter to convert the array to views
        //TourAdapter adapter = new TourAdapter(this, restaurant);
        //Create an ArrayAdapter object, adapter from the Custom ArrayAdapter class, WordAdapter
        TourAdapter adapter = new TourAdapter(getActivity(), restaurant);

        //Create an object of the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list_list);

        // Attach the adapter to a ListView
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Get the {@link Word} object at the given position the user clicked on
                Tour tour = restaurant.get(position);

                if (position == 0){
                    Intent intent = new Intent(getActivity(), Wakkis.class);
                    startActivity(intent);}
            }
            });
        return rootView;
    }


}
