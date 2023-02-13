package com.siemens.training.java.classdesign;

import java.util.ArrayList;

public class PersonList {

    private ArrayList<Person> persons = new ArrayList<>();

    public void addPerson(Person personParam) {
        persons.add(personParam);

    }

    @Override
    public String toString() {
        return "PersonList [persons=" + persons + "]";
    }

}
