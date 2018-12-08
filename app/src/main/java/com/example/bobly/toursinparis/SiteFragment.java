package com.example.bobly.toursinparis;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class SiteFragment extends android.support.v4.app.Fragment {
    public SiteFragment() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_item, container, false);
      final   ArrayList<Locations> locations = new ArrayList<Locations>();
        locations.add(new Locations(R.string.site1,R.string.info1,R.drawable.arc));
        locations.add(new Locations(R.string.site2,R.string.info2 ,R.drawable.eiffel));
        locations.add(new Locations(R.string.site3,R.string.info3,R.drawable.lufer ));
        locations.add(new Locations(R.string.site4,R.string.info4,R.drawable.disiny ));
        locations.add(new Locations(R.string.site5,R.string.info5,R.drawable.pexels ));
        locations.add(new Locations(R.string.site6,R.string.info6,R.drawable.paris ));


        AdapterParisTour locationAdapter = new AdapterParisTour(getActivity(), locations);
        ListView listView = (ListView) rootView.findViewById(R.id.list_item);
        listView.setAdapter(locationAdapter);
        return rootView;
    }
}
