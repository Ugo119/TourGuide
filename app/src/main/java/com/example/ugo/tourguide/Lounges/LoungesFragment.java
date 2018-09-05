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


/**
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
        // Inflate the layout for this fragment

        //Create an arraylist of artists
        final ArrayList<Tour> lounge = new ArrayList<Tour>();
        lounge.add(new Tour("Sofia", "The best lounge to chill with frineds and enjoy variety of...", R.drawable.wakkiss));
        lounge.add(new Tour("Play", "The best lounge to chill with frineds and enjoy variety of...", R.drawable.wilsonn));
        lounge.add(new Tour("Darnet", "The best lounge to chill with frineds and enjoy variety of...", R.drawable.restaurant_one));
        lounge.add(new Tour("The Barn", "The best lounge to chill with frineds and enjoy variety of...", R.drawable.wilsonn));
        lounge.add(new Tour("Oven", "The best lounge to chill with frineds and enjoy variety of...", R.drawable.wilsonn));
        lounge.add(new Tour("Natil", "The best lounge to chill with frineds and enjoy variety of...", R.drawable.nkoyop));
        lounge.add(new Tour("Avalange", "The best lounge to chill with frineds and enjoy variety of...", R.drawable.spicep));
        lounge.add(new Tour("Rek", "The best lounge to chill with frineds and enjoy variety of...", R.drawable.jevinikp));


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
                Tour tour = lounge.get(position);

                if (position == 0) {
                    Intent intent = new Intent(getActivity(), ForLounges.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(getActivity(), ForLounges.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(getActivity(), ForLounges.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(getActivity(), ForLounges.class);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(getActivity(), ForLounges.class);
                    startActivity(intent);
                } else if (position == 5) {
                    Intent intent = new Intent(getActivity(), ForLounges.class);
                    startActivity(intent);
                } else if (position == 6) {
                    Intent intent = new Intent(getActivity(), ForLounges.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getActivity(), ForLounges.class);
                    startActivity(intent);
                }
            }
        });
        return rootView;
    }

}
