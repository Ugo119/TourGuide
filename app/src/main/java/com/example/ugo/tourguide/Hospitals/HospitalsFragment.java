package com.example.ugo.tourguide.Hospitals;


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
import com.example.ugo.tourguide.Restaurants.BluCabana;
import com.example.ugo.tourguide.Restaurants.CharcoalGrill;
import com.example.ugo.tourguide.Restaurants.Jevinik;
import com.example.ugo.tourguide.Restaurants.MamaCass;
import com.example.ugo.tourguide.Restaurants.Nkoyo;
import com.example.ugo.tourguide.Restaurants.Serendib;
import com.example.ugo.tourguide.Restaurants.SpicePlatter;
import com.example.ugo.tourguide.Restaurants.Wakkis;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HospitalsFragment extends Fragment {


    public HospitalsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_hospitals, container, false);
        // Inflate the layout for this fragment

        //Create an arraylist of artists
        final ArrayList<Tour> hospital = new ArrayList<Tour>();
        hospital.add(new Tour("Lake Hospital", "Set in the serene part of town, offering specialist..", R.drawable.wakkiss));
        hospital.add(new Tour("Adil Clinics", "Set in the serene part of town, offering specialist..", R.drawable.wilsonn));
        hospital.add(new Tour("Modi Hospital", "Set in the serene part of town, offering specialist..", R.drawable.restaurant_one));
        hospital.add(new Tour("Malone Hospital", "Set in the serene part of town, offering specialist..", R.drawable.wilsonn));
        hospital.add(new Tour("Avok Clinics", "Set in the serene part of town, offering specialist..", R.drawable.mamacassp));
        hospital.add(new Tour("Ket Specialist", "Set in the serene part of town, offering specialist..", R.drawable.jevinikp));
        hospital.add(new Tour("Vit Hospital", "Set in the serene part of town, offering specialist..", R.drawable.spicep));
        hospital.add(new Tour("Kart Clinics", "Set in the serene part of town, offering specialist..", R.drawable.wilsonn));


        // Create the adapter to convert the array to views
        TourAdapter adapter = new TourAdapter(getActivity(), hospital);

        //Create an object of the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list_list);

        // Attach the adapter to a ListView
        listView.setAdapter(adapter);

        //Create an itemclicklistener for each item in the list.
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Get the {@link Word} object at the given position the user clicked on
                Tour tour = hospital.get(position);

                if (position == 0) {
                    Intent intent = new Intent(getActivity(), ForHospitals.class);
                    startActivity(intent);
                } else if (position == 1) {
                    Intent intent = new Intent(getActivity(), ForHospitals.class);
                    startActivity(intent);
                } else if (position == 2) {
                    Intent intent = new Intent(getActivity(), ForHospitals.class);
                    startActivity(intent);
                } else if (position == 3) {
                    Intent intent = new Intent(getActivity(), ForHospitals.class);
                    startActivity(intent);
                } else if (position == 4) {
                    Intent intent = new Intent(getActivity(), ForHospitals.class);
                    startActivity(intent);
                } else if (position == 5) {
                    Intent intent = new Intent(getActivity(), ForHospitals.class);
                    startActivity(intent);
                } else if (position == 6) {
                    Intent intent = new Intent(getActivity(), ForHospitals.class);
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(getActivity(), ForHospitals.class);
                    startActivity(intent);
                }
            }
        });
        return rootView;
    }

}
