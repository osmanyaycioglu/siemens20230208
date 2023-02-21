package com.siemens.training.java.classdesign;

import java.time.LocalDate;
import java.time.LocalDateTime;

//POJO
//DTO
public class Person {

    private String        firstName;
    private String        lastName;
    private int           height;
    private int           weight;
    private LocalDate     birthDate;
    private LocalDateTime createdDateTime;

    public Person() {
    }

    public Person(final String firstName,
                  final String lastName,
                  final int height,
                  final int weight) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
    }

    public Person(final String firstNameParam,
                  final String lastNameParam,
                  final int heightParam,
                  final int weightParam,
                  final LocalDate birthDateParam,
                  final LocalDateTime createdDateTimeParam) {
        super();
        this.firstName = firstNameParam;
        this.lastName = lastNameParam;
        this.height = heightParam;
        this.weight = weightParam;
        this.birthDate = birthDateParam;
        this.createdDateTime = createdDateTimeParam;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(final LocalDate birthDateParam) {
        this.birthDate = birthDateParam;
    }

    public LocalDateTime getCreatedDateTime() {
        return this.createdDateTime;
    }

    public void setCreatedDateTime(final LocalDateTime createdDateTimeParam) {
        this.createdDateTime = createdDateTimeParam;
    }

    @Override
    public String toString() {
        return "Person [firstName="
               + this.firstName
               + ", lastName="
               + this.lastName
               + ", height="
               + this.height
               + ", weight="
               + this.weight
               + ", birthDate="
               + this.birthDate
               + ", createdDateTime="
               + this.createdDateTime
               + "]";
    }

}
