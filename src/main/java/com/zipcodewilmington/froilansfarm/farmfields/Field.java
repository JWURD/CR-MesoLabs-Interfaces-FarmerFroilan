package com.zipcodewilmington.froilansfarm.farmfields;

import com.zipcodewilmington.froilansfarm.farmfields.farmcrops.CropRow;

import java.util.ArrayList;

public class Field {
    //private CropRow cropRow;
    private ArrayList<CropRow> listOfCrops;

    public Field() {
        this.listOfCrops = new ArrayList<CropRow>();
    }

    public boolean add(CropRow row) {
        return false;
    }

    public boolean remove(CropRow row) {
        return false;
    }

    public boolean checkHarvestStatusByRowId(int id) {
        return false;
    }

    public CropRow getCropRow() {
        return null;
    }
}
