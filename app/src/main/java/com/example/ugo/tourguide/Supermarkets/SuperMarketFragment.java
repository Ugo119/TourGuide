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


/**
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
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_restaurant, container, false);

        //Create an arraylist of artists
        final ArrayList<Tour> supmarket = new ArrayList <Tour>();
        supmarket.add(new Tour("Grand Square", "The best supermarket that has all that you have ever wanted..", R.drawable.wakkisp));
        supmarket.add(new Tour("Xclusive Stores", "The best supermarket that has all that you have ever wanted..", R.drawable.spicep));
        supmarket.add(new Tour("Chemzho Stores", "The best supermarket that has all that you have ever wanted..", R.drawable.jevinikp));
        supmarket.add(new Tour("Taru Stores", "The best supermarket that has all that you have ever wanted..", R.drawable.nkoyop));
        supmarket.add(new Tour("Ibe Stores", "The best supermarket that has all that you have ever wanted..", R.drawable.blucabanap));
        supmarket.add(new Tour("King Stores", "The best supermarket that has all that you have ever wanted..", R.drawable.charcoalp));
        supmarket.add(new Tour("Sido Stores", "The best supermarket that has all that you have ever wanted..", R.drawable.mamacassp));
        supmarket.add(new Tour("Sido Stores", "The best supermarket that has all that you have ever wanted..", R.drawable.mamacassp));



        // Create the adapter to convert the array to views
        //TourAdapter adapter = new TourAdapter(this, restaurant);
        //Create an ArrayAdapter object, adapter from the Custom ArrayAdapter class, WordAdapter
        TourAdapter adapter = new TourAdapter(getActivity(), supmarket);

        //Create an object of the ListView
        ListView listView = (ListView) rootView.findViewById(R.id.list_list);

        // Attach the adapter to a ListView
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Get the {@link Word} object at the given position the user clicked on
                Tour tour = supmarket.get(position);

                if (position == 0){
                    Intent intent = new Intent(getActivity(), ForSupermarkets.class);
                    startActivity(intent);}else if (position == 1){
                    Intent intent = new Intent(getActivity(), ForSupermarkets.class);
                    startActivity(intent);
                }else if (position == 2){
                    Intent intent = new Intent(getActivity(), ForSupermarkets.class);
                    startActivity(intent);
                }else if (position == 3){
                    Intent intent = new Intent(getActivity(), ForSupermarkets.class);
                    startActivity(intent);
                }else if (position == 4){
                    Intent intent = new Intent(getActivity(), ForSupermarkets.class);
                    startActivity(intent);
                }else if (position == 5){
                    Intent intent = new Intent(getActivity(), ForSupermarkets.class);
                    startActivity(intent);
                }else if (position == 6){
                    Intent intent = new Intent(getActivity(), ForSupermarkets.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(getActivity(), ForSupermarkets.class);
                    startActivity(intent);
                }
            }
        });
        return rootView;
    }

}
