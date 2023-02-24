package com.siemens.training.restproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

//POJO
//DTO
@Entity
@Table(name = "person_data")
public class Person {
    @Id
    @GeneratedValue
    private Long          personId;
    @NotNull
    @NotEmpty
    @Size(min = 2, max = 20)
    private String        firstName;
    @NotNull
    @NotEmpty
    @Size(min = 3, max = 25)
    private String        lastName;
    @Min(50)
    @Max(300)
    private int           height;
    @Min(10)
    @Max(500)
    private int           weight;
    @Past
    @NotNull
    private LocalDate     birthDate;
    // @Null
    private LocalDateTime createdDateTime;
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Address       address;
    @NotNull
    @Size(min = 1)
    @OneToMany(cascade = CascadeType.ALL)
    private Set<Phone>    phones;
    @ElementCollection
    @CollectionTable(name = "nick_names")
    private Set<String>   nicknames;

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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address addressParam) {
        address = addressParam;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personIdParam) {
        personId = personIdParam;
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phonesParam) {
        phones = phonesParam;
    }

    public Set<String> getNicknames() {
        return nicknames;
    }

    public void setNicknames(Set<String> nicknamesParam) {
        nicknames = nicknamesParam;
    }
}
