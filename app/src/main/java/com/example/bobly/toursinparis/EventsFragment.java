package com.example.bobly.toursinparis;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsFragment extends android.support.v4.app.Fragment {
    public EventsFragment() {
        // Required empty public constructor
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);
        final ArrayList<Locations> locations = new ArrayList<Locations>();
        locations.add(new Locations(R.string.event1, R.string.addinfo1));
        locations.add(new Locations(R.string.event2,R.string.addinfo2));
        locations.add(new Locations(R.string.event3,R.string.addinfo3));
        locations.add(new Locations(R.string.event4, R.string.addinfo4));
        locations.add(new Locations(R.string.event5, R.string.addinfo5));
        locations.add(new Locations(R.string.event6, R.string.addinfo6));


        AdapterParisTour locationAdapter = new AdapterParisTour(getActivity(), locations);
        ListView listView  = (ListView) rootView.findViewById(R.id.list_item);
        listView.setAdapter(locationAdapter);
        return rootView;

    }

}




