package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.Heraklion_Archaeological_Museum), getString(R.string.Heraklion_Archaeological_Museum_Description), R.drawable.museum1));
        locations.add(new Location(getString(R.string.Archaeological_Museum_of_Chania), getString(R.string.Archaeological_Museum_of_Chania_Description), R.drawable.museum2));
        locations.add(new Location(getString(R.string.Archaeological_Museum_of_Rethymno), getString(R.string.Archaeological_Museum_of_Rethymno_Description), R.drawable.museum3));
        locations.add(new Location(getString(R.string.Archaeological_Museum_of_Agios_Nikolaos), getString(R.string.Archaeological_Museum_of_Agios_Nikolaos_Description), R.drawable.museum_ag));
        locations.add(new Location(getString(R.string.Maritime_Museum_of_Crete), getString(R.string.Maritime_Museum_of_Crete_Description), R.drawable.museum5));
        locations.add(new Location(getString(R.string.Natural_History_Museum), getString(R.string.Natural_Histoy_Museum_Description), R.drawable.museum6));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.colorPrimary);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
