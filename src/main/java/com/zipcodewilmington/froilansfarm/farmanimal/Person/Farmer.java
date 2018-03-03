package com.zipcodewilmington.froilansfarm.farmanimal.Person;

import com.zipcodewilmington.froilansfarm.farmutilities.Edible;
import com.zipcodewilmington.froilansfarm.farmutilities.Rideable;
import com.zipcodewilmington.froilansfarm.field.Crop;
import com.zipcodewilmington.froilansfarm.field.CropRow;

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
