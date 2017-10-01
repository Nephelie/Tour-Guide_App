package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HistoricPlacesFragment extends Fragment {

    public HistoricPlacesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(getString(R.string.Knossos_Palace), getString(R.string.Knossos_Palace_Description), R.drawable.knossos_palace));
        locations.add(new Location(getString(R.string.Spinalonga), getString(R.string.Spinalonga_Description), R.drawable.spinalonga));
        locations.add(new Location(getString(R.string.Koules_Fortress), getString(R.string.Koules_Fortress_Description), R.drawable.koules_fortress));
        locations.add(new Location(getString(R.string.Fortezza_of_Rethymno), getString(R.string.Fortezza_of_Rethymno_Description), R.drawable.fortezza));
        locations.add(new Location(getString(R.string.Phaistos), getString(R.string.Phaistos_Description), R.drawable.phestos));
        locations.add(new Location(getString(R.string.Aptera), getString(R.string.Aptera_Description), R.drawable.aptera));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.colorPrimary);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
