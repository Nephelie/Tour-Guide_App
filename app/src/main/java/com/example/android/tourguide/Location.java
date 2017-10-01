package com.example.android.tourguide;

class Location {

    private String mNameOfThePlace;
    private String mDescriptionOfThePlace;
    private int mImageResourceId;

    Location(String nameOfThePlace, String descriptionOfThePlace, int imageResourceId) {
        mNameOfThePlace = nameOfThePlace;
        mDescriptionOfThePlace = descriptionOfThePlace;
        mImageResourceId = imageResourceId;
    }

    String getNameOfThePlace() {
        return mNameOfThePlace;
    }

    String getDescriptionOfThePlace() {
        return mDescriptionOfThePlace;
    }

    int getImageResourceId() {
        return mImageResourceId;
    }
}

