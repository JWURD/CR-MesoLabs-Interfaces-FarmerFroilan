package com.zipcodewilmington.froilansfarm.farmanimal.person;

import com.zipcodewilmington.froilansfarm.farmfields.farmcrops.CornStalk;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class FarmerTest {
    private String name;
    private int id;
    private Farmer theFamer;


    @Before
    public void setUp() throws Exception {
        name = "Steve";
        id = 1;
        theFamer = new Farmer(name, id);
    }


    @Test
    public void makeNoise() {
       String expected = "Howdy";
        String actual = theFamer.makeNoise();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void plantCropTest() {
        CornStalk cornStalk = new CornStalk();
        boolean expected = true;
        boolean actual = theFamer.plant(cornStalk);

        Assert.assertEquals(expected, actual);
    }
}
