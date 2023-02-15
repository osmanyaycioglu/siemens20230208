package com.siemens.training.java.oo;

public class Kangroo extends Animal {

    public Kangroo(String nameParam) {
        super("KANGROO",
              nameParam);
    }

    @Override
    public String voice() {
        return "zzzzzzzzzzzzzzzz";
    }

}
