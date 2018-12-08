package com.example.bobly.toursinparis;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParkFragment extends  android.support.v4.app.Fragment {
public ParkFragment() {
        // Required empty public constructor
        }

@Nullable
@Override
public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);
       final  ArrayList<Locations> locations = new ArrayList<Locations>();
        locations.add(new Locations(R.string.park1, R.string.locationPark1));
        locations.add(new Locations(R.string.park2, R.string.locationPark2));
        locations.add(new Locations(R.string.park3, R.string.locationPark3));
        locations.add(new Locations(R.string.park4, R.string.locationPark4));
        locations.add(new Locations(R.string.park5, R.string.locationPark5));
        locations.add(new Locations(R.string.park6, R.string.locationPark6));


        AdapterParisTour locationAdapter = new AdapterParisTour(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list_item);
        listView.setAdapter(locationAdapter);
        return rootView;
        }
        }
