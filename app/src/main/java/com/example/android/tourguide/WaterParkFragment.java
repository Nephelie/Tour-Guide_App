package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class WaterParkFragment extends Fragment {

    public WaterParkFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.Watercity_Water_Park), getString(R.string.Watercity_Description), R.drawable.water_city));
        locations.add(new Location(getString(R.string.Acqua_Plus), getString(R.string.Acqua_Plus_Description), R.drawable.acqua));
        locations.add(new Location(getString(R.string.Limnoupolis_Water_Park), getString(R.string.Limnoupolis_Description), R.drawable.limnoupolis));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.colorPrimary);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
