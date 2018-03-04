package com.zipcodewilmington.froilansfarm.factory;

import com.zipcodewilmington.froilansfarm.farmfields.farmcrops.CornStalk;
import com.zipcodewilmington.froilansfarm.farmfields.farmcrops.Crop;
import com.zipcodewilmington.froilansfarm.farmfields.farmcrops.TomatoPlant;

import java.util.function.Supplier;

public enum CropType {
    TOMATO(TomatoPlant::new),
    CORN(CornStalk::new);

    Supplier<Crop> value;

    CropType(Supplier<Crop> theType) {
        this.value = theType;
    }

    public static Crop getInstanceOfCrop(String cropTypeName) {
        for (CropType c : CropType.values()) {
            if (cropTypeName.equalsIgnoreCase(c.toString())) {
                return getValue(c).get();
            }

        }
        return null;
    }

    public static Supplier<Crop> getValue(CropType c) {
        return c.value;
    }


}
