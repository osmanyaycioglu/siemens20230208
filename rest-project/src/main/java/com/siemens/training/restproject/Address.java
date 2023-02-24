package com.siemens.training.restproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long addressId;
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
