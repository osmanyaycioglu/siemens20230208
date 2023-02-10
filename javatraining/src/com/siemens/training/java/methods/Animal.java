package com.siemens.training.java.methods;

public class Animal {

    private String  name           = "unknown";
    private String  species;
    private String  gender;
    private String  lastAction;
    private int     age;
    private Integer operationCount = 0;

    public Animal(String firstName,
                  String lastName,
                  int ageParam,
                  String genderParam,
                  String speciesParam) {
        System.out.println("Animal yaratılıyor");
        createName(firstName,
                   lastName,
                   ageParam,
                   genderParam);
        species = speciesParam;
        gender = genderParam;
        age = ageParam;
    }

    private String createName(String firstName,
                              String lastName,
                              int age,
                              String gender) {
        String tempName = "";
        if (age > 5) {
            tempName += "Old ";
        }
        if (gender.equals("MALE")) {
            tempName += "MR ";
        } else {
            tempName += "MRS ";
        }
        tempName += firstName + " " + lastName;
        name = tempName;
        return tempName;
    }

    //    public String getPizzaRecip(String pizzaType) {
    //        if (pizzaType.equals("italian")) {
    //            return "italian pizza";
    //        } else if (pizzaType.equals("turkish")) {
    //            return "lahmacun";
    //        } else {
    //            return "pizza";
    //        }
    //    }

    public String walk(int range) {
        lastAction = "Walking " + range + " meter";
        return lastAction;
    }

    public String talk(String str) {
        lastAction = "Talking " + str;
        return lastAction;
    }

    public String eat(String food) {
        lastAction = "Eating " + food;
        return lastAction;
    }

    public String getName() {
        return name;
    }

    public void setName(String nameParam) {
        name = nameParam;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String speciesParam) {
        species = speciesParam;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String genderParam) {
        gender = genderParam;
    }

    public String getLastAction() {
        return lastAction;
    }

    public void setLastAction(String lastActionParam) {
        lastAction = lastActionParam;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int ageParam) {
        age = ageParam;
    }

    public Integer getOperationCount() {
        return operationCount;
    }

    public void setOperationCount(Integer operationCountParam) {
        operationCount = operationCountParam;
    }

    @Override
    public String toString() {
        return "Animal [name="
               + name
               + ", species="
               + species
               + ", gender="
               + gender
               + ", lastAction="
               + lastAction
               + ", age="
               + age
               + ", operationCount="
               + operationCount
               + "]";
    }

}
