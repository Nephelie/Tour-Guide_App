package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new HistoricPlacesFragment();
            case 1:
                return new MuseumsFragment();
            case 2:
                return new BeachFragment();
            case 3:
                return new WaterParkFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return mContext.getString(R.string.HistoricPlaces);
            case 1:
                return mContext.getString(R.string.Museums);
            case 2:
                return mContext.getString(R.string.Beaches);
            case 3:
                return mContext.getString(R.string.WaterParks);
            default:
                return null;
        }
    }
}
