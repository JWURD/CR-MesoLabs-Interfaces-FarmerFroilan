package com.zipcodewilmington.froilansfarm.farmfields.farmcrops;

//might be able to have only the generics at the leve of Crop Row
public class CropRow {
    private Crop crop;
    private int numberOfCropPants;
    private int id;
    private  boolean hasBeenHarvested;

    public CropRow(Crop theCrop, int numberOfCropPants, int id, boolean harvested ) {
        this.crop = theCrop;
        this.id = id;
        this.hasBeenHarvested = harvested;
    }

    public int getNumberOfCropPants() {
        return 0;
    }

    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }

    public int getId() {
        return id;
    }

    public Crop getCropById() {
        return null;
    }
}
