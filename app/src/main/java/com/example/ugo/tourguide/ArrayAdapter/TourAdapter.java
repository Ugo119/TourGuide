package com.example.ugo.tourguide.ArrayAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ugo.tourguide.R;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<Tour> {
    public TourAdapter(Context context, ArrayList<Tour> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Tour user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.home_lay, parent, false);
        }
        // Lookup view for data population
        ImageView image = (ImageView) convertView.findViewById(R.id.image);
        TextView head = (TextView) convertView.findViewById(R.id.name);
        TextView desc = (TextView) convertView.findViewById(R.id.description);
        // Populate the data into the template view using the data object
        image.setImageResource(user.imageResource);
        head.setText(user.heading);
        desc.setText(user.description);
        // Return the completed view to render on screen

        return convertView;

    }
}
