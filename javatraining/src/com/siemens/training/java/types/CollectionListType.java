package com.siemens.training.java.types;

import java.util.ArrayList;
import java.util.List;

import com.siemens.training.java.pkg.Car;

public class CollectionListType {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(11);
        list1.add(12);
        list1.add(13);
        list1.add(14);
        list1.add(15);
        list1.add(16);
        list1.add(17);
        list1.add(18);
        list1.add(19);
        list1.add(20);
        list1.add(21);

        System.out.println("3. eleman : " + list1.get(2));
        list1.remove(2);
        System.out.println("3. eleman : " + list1.get(2));

        List<Car> carList = new ArrayList<>();

    }
}
