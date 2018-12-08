package com.example.bobly.toursinparis;

/**
 * Created by bobly on 06/12/17.
 */

public class Locations {

    private int  locationName;
    private int additionInformation;
    private int image = NO_IMAGE;
    private static final int NO_IMAGE = -1;

    public Locations(int locationName, int additionInformation ) {
        this.locationName = locationName;
        this.additionInformation = additionInformation;
    }
    public Locations(int locationName, int additionInformation,int image  ) {
        this.locationName = locationName;
        this.additionInformation = additionInformation;
         this.image=image;
    }
    public int getLocationName() {
        return locationName;
    }
    public int getAdditionInformation()
    {
        return additionInformation;
    }
    public int getImage()
    {
        return image;
    }
    public boolean hasImage() {
        return image != NO_IMAGE;
    }

}


