package com.zipcodewilmington.froilansfarm.farmanimal.person;

import com.zipcodewilmington.froilansfarm.farmfields.Field;
import com.zipcodewilmington.froilansfarm.farmfields.farmcrops.Crop;
import com.zipcodewilmington.froilansfarm.farmfields.farmcrops.CropRow;

public class Farmer extends Person implements Botanist {


    public Farmer(String name, int id) {
        super(name, id);
    }

    public String makeNoise() {
        return "Howdy";
    }

    public boolean plant(Crop theCrop) {
        Field backForty = new Field();
       // CropRow theRow = new CropRow(theCrop);

       // backForty.add(theRow);

        return false;
    }

}
