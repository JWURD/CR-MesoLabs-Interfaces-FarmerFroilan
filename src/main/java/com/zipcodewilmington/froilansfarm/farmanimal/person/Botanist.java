package com.zipcodewilmington.froilansfarm.farmanimal.person;

import com.zipcodewilmington.froilansfarm.farmfields.farmcrops.Crop;
import com.zipcodewilmington.froilansfarm.farmfields.farmcrops.CropRow;

public interface Botanist {
    public boolean plant(CropRow theRow, Crop theCrop);
}
