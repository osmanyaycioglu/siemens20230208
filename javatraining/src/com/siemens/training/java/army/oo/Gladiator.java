package com.siemens.training.java.army.oo;

public class Gladiator extends BaseSoldier {

    public Gladiator() {
        super(40,
              50,
              70);
    }

    @Override
    public boolean duck(final int rangeParam) {
        return false;
    }

}
