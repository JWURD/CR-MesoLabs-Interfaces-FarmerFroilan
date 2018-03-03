package com.zipcodewilmington.froilansfarm.farmanimal.person;

import com.zipcodewilmington.froilansfarm.farmfields.farmcrops.Crop;
import com.zipcodewilmington.froilansfarm.farmfields.farmcrops.CropRow;

public class Farmer extends Person implements Botanist {


    public Farmer(int id, String name) {
        super(id, name);
    }

    public String makeNoise() {
        return null;
    }

    public boolean plant(CropRow theRow, Crop theCrop) {
        return false;
    }

}
