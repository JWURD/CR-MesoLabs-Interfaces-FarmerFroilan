package com.zipcodewilmington.froilansfarm.farmfields.farmcrops;

import com.zipcodewilmington.froilansfarm.farmutilities.Edible;
import com.zipcodewilmington.froilansfarm.farmutilities.Produce;

public class Crop<E> implements Produce, Edible{
    protected boolean hasBeenHarvested;
    protected Crop<E> crop;
    public Crop(Crop<E> type){
        this.crop = type;
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
    public Crop getCrop(){
        return null;
    }
}
