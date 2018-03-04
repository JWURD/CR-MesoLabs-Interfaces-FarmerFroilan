package com.zipcodewilmington.froilansfarm.farmfields.farmcrops;

import com.zipcodewilmington.froilansfarm.farmutilities.Edible;
import com.zipcodewilmington.froilansfarm.farmutilities.Produce;

public abstract class Crop<E> implements Produce, Edible{

    protected boolean hasBeenHarvested;
    protected String crop;
    public Crop(String type){
        this.crop = type;
        this.hasBeenHarvested = false;
    }
    public Crop(){
        this.crop = "";
        this.hasBeenHarvested = false;
    }

    public Edible yeild() {
        return null;
    }

    public boolean isEdible(Edible theEdible) {
        return false;
    }

    public Edible getEdibleFood() {
        return null;
    }
    public E getCrop(){
        return null;
    }
}
