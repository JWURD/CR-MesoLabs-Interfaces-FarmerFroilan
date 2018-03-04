package com.zipcodewilmington.froilansfarm.farmfields.farmcrops;

//might be able to have only the generics at the leve of Crop Row
public class CropRow <E>{
    private Crop<E> crop;
   // private int numberOfCrops;
    private int id;
    private  boolean hasBeenHarvested;



    public CropRow(Crop<E>theCrop){
     this.crop = theCrop;
    }
    public CropRow(int id){
        this.id = id;
    }
    public CropRow(boolean hasBeenHarvested){
        this.hasBeenHarvested = hasBeenHarvested;
    }
    public CropRow(Crop theCrop, int id, boolean harvested ) {
        this.crop = theCrop;
        this.id = id;
        this.hasBeenHarvested = harvested;
    }
    //default values  Crop Corn
    public CropRow(){
        this(new CornStalk(),  0, false);
    }

   /* public int getNumberOfCropPants() {
        return 0;
    }*/

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
