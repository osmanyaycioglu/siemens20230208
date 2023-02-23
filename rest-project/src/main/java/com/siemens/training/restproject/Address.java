package com.siemens.training.restproject;

public class Address {
    private String city;
    private String street;

    public Address() {
    }

    public Address(String cityParam,
                   String streetParam) {
        city = cityParam;
        street = streetParam;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String cityParam) {
        city = cityParam;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String streetParam) {
        street = streetParam;
    }
}
