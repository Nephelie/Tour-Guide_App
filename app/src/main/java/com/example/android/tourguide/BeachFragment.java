package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BeachFragment extends Fragment {

    public BeachFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.Balos_Beach), getString(R.string.Balos_Beach_Description), R.drawable.balos_beach));
        locations.add(new Location(getString(R.string.Elafonissi), getString(R.string.Elafonissi_Description), R.drawable.elafonissi));
        locations.add(new Location(getString(R.string.Falassarna), getString(R.string.Falassarna_Description), R.drawable.falasarna_beach));
        locations.add(new Location(getString(R.string.Gramvousa), getString(R.string.Gramvousa_Description), R.drawable.gramvousa));
        locations.add(new Location(getString(R.string.Preveli_Beach), getString(R.string.Preveli_Beach_Description), R.drawable.preveli));
        locations.add(new Location(getString(R.string.Istro_Beach), getString(R.string.Istro_Beach_Description), R.drawable.istros));
        locations.add(new Location(getString(R.string.Vai_Beach), getString(R.string.Vai_Beach_Description), R.drawable.vai));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.colorPrimary);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
