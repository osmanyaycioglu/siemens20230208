package com.siemens.training.java.oo;

public class Dog extends Animal {

    public void sit() {
        System.out.println("Dog is sitting");
    }

    @Override
    public String voice() {
        animalType = "dog";
        String voiceLoc = super.voice();
        return voiceLoc + " hav hav";
    }
}
