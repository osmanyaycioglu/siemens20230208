package com.siemens.training.restproject;

public class Phone {
    private String name;
    private String number;

    public Phone() {
    }

    public Phone(String nameParam,
                 String numberParam) {
        name = nameParam;
        number = numberParam;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameParam) {
        name = nameParam;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String numberParam) {
        number = numberParam;
    }
}
