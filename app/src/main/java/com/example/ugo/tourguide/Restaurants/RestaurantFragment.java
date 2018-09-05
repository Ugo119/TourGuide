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
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_restaurant, container, false);

        //Create an arraylist of artists
         final ArrayList<Tour> restaurant = new ArrayList<Tour>();
        restaurant.add(new Tour("Wakkis", "We are a free standing purpose built restaurant that offers great and memorable dining experience...", R.drawable.wakkisp));
        restaurant.add(new Tour("Mama Cass", "Established in 1983 to meet the demands of food lovers who appreciate quality,....", R.drawable.mamacassp));
        restaurant.add(new Tour("Jevinik", "Jevinik Restaurant has acquired ample culinary skills to serve you with homemade ...... ", R.drawable.jevinikp));
        restaurant.add(new Tour("Spice platter", "Providing a unique balance of art and food, Spice Platter is a large restaurant....", R.drawable.spicep));
        restaurant.add(new Tour("Charcoal grill", "If you are looking for a place with excellent food and all grilled to your order,....", R.drawable.charcoalp));
        restaurant.add(new Tour("Nkoyo", "Nkoyo Inc is a restaurant chain with food from different parts....", R.drawable.nkoyop));
        restaurant.add(new Tour("bluCabana", "Good Lebanese and international kitchen with tables around the almost oversized ....", R.drawable.blucabanap));
        restaurant.add(new Tour("Serendib", "Serendib Restaurant & Bar is on the rooftop of the Lake Crescent Hotel....", R.drawable.serendibp));



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
                    startActivity(intent);}else if (position == 1){
                    Intent intent = new Intent(getActivity(), MamaCass.class);
                    startActivity(intent);
                }else if (position == 2){
                    Intent intent = new Intent(getActivity(), Jevinik.class);
                    startActivity(intent);
                }else if (position == 3){
                    Intent intent = new Intent(getActivity(), SpicePlatter.class);
                    startActivity(intent);
                }else if (position == 4){
                    Intent intent = new Intent(getActivity(), CharcoalGrill.class);
                    startActivity(intent);
                }else if (position == 5){
                    Intent intent = new Intent(getActivity(), Nkoyo.class);
                    startActivity(intent);
                }else if (position == 6){
                    Intent intent = new Intent(getActivity(), BluCabana.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(getActivity(), Serendib.class);
                    startActivity(intent);
                }
            }
            });
        return rootView;
    }


}
