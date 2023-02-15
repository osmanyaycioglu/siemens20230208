package com.siemens.training.java.oo;

public class Dog extends Animal {

    public Dog(String dogName) {
        super("DOG",
              dogName);
        System.out.println("Dog object is creating");
    }

    public void sit() {
        System.out.println("Dog is sitting");
    }

    @Override
    public String voice() {
        String voiceLoc = "test";
        return voiceLoc + " hav hav";
    }
}
