package com.siemens.training.restproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Phone {
    @Id
    @GeneratedValue
    private Long phoneId;
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

    public Long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Long phoneIdParam) {
        phoneId = phoneIdParam;
    }
}
