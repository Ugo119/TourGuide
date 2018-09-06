package com.example.ugo.tourguide.Restaurants;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ugo.tourguide.R;
import com.example.ugo.tourguide.ArrayAdapter.Tour;
import com.example.ugo.tourguide.ArrayAdapter.TourAdapter;

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

        //Create an arraylist of artists
        final ArrayList<Tour> restaurant = new ArrayList<Tour>();
        restaurant.add(new Tour(getString(R.string.wakkis_rest), getString(R.string.wakkis_desc), R.drawable.wakkisp));
        restaurant.add(new Tour(getString(R.string.mama_cass_rest), getString(R.string.mama_cass_desc), R.drawable.mamacassp));
        restaurant.add(new Tour(getString(R.string.jevinik_rest), getString(R.string.jevinik_desc), R.drawable.jevinikp));
        restaurant.add(new Tour(getString(R.string.spice_platter_rest), getString(R.string.spice_desc), R.drawable.spicep));
        restaurant.add(new Tour(getString(R.string.charcoal_grill_rest), getString(R.string.charcoal_desc), R.drawable.charcoalp));
        restaurant.add(new Tour(getString(R.string.nkoyo_rest), getString(R.string.nkoyo_desc), R.drawable.nkoyop));
        restaurant.add(new Tour(getString(R.string.blucabana_rest), getString(R.string.blucabana_desc), R.drawable.blucabanap));
        restaurant.add(new Tour(getString(R.string.serendib_rest), getString(R.string.serendib_desc), R.drawable.serendibp));


        // Create the adapter to convert the array to views
        TourAdapter adapter = new TourAdapter(getActivity(), restaurant);

        //Create an object of the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list_list);

        // Attach the adapter to a ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getActivity(), Wakkis.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(getActivity(), MamaCass.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(getActivity(), Jevinik.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(getActivity(), SpicePlatter.class);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(getActivity(), CharcoalGrill.class);
                    startActivity(intent);
                } else if (position == 5) {
                    Intent intent = new Intent(getActivity(), Nkoyo.class);
                    startActivity(intent);
                } else if (position == 6) {
                    Intent intent = new Intent(getActivity(), BluCabana.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getActivity(), Serendib.class);
                    startActivity(intent);
                }
            }
        });
        return rootView;
    }


}
