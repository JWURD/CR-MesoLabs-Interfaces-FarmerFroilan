package com.zipcodewilmington.froilansfarm.farmanimal.Person;

import com.zipcodewilmington.froilansfarm.field.Crop;
import com.zipcodewilmington.froilansfarm.field.CropRow;

public interface Botanist {
    public boolean plant(CropRow theRow, Crop theCrop);
}
