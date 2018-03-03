package com.zipcodewilmington.froilansfarm.field;

import com.zipcodewilmington.froilansfarm.farmutilities.Edible;
import com.zipcodewilmington.froilansfarm.farmutilities.Produce;

public class Crop<E> implements Produce, Edible{
    protected boolean hasBeenHarvested;

    public Crop(E type){
        hasBeenHarvested = false;
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
}
