package com.example.bobly.toursinparis;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantFragment extends android.support.v4.app.Fragment {
    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);
        final ArrayList<Locations> locations = new ArrayList<Locations>();
        locations.add(new Locations(R.string.restauent1,R.string.Tel1));
        locations.add(new Locations(R.string.restauent2, R.string.Tel2));
        locations.add(new Locations(R.string.restauent3, R.string.Tel3));
        locations.add(new Locations(R.string.restauent4, R.string.Tel4));
        locations.add(new Locations(R.string.restauent5, R.string.Tel5));
        locations.add(new Locations(R.string.restauent6, R.string.Tel6));


        AdapterParisTour locationAdapter = new AdapterParisTour(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list_item);
        listView.setAdapter(locationAdapter);
        return rootView;
    }
}
