package com.example.bobly.toursinparis;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;



public class AdapterParisTour extends ArrayAdapter<Locations> {

    public AdapterParisTour(Activity context, ArrayList<Locations> locations) {
        super(context, 0, locations);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_location, parent, false);
        }

        //  object located at this position in the list
        Locations currentLocation = getItem(position);

        // Find the TextView in the List_location.xml layout with the ID location_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_location);
        nameTextView.setText(currentLocation.getLocationName());

        // Find the TextView in the List_location.xml layout with the ID info
        TextView monthTextView = (TextView) listItemView.findViewById(R.id.Info);
        monthTextView.setText(currentLocation.getAdditionInformation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            iconView.setImageResource(currentLocation.getImage());
            // Make sure the view is visible
            iconView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }


}
