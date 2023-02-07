package com.siemens.training.java.operations;

import com.siemens.training.java.pkg.Car;

import a.b.c.TestClass;

public class RefOperations {
	public static void main(String[] args) {
		Car car = new Car(100, 100, 30); // memory 1
		Car car2 = new Car(200, 150, 10);
		Car car3 = null;
		Car car4 = car; // memory 1
		Car car5 = car;
		Car car6 = car5;
		Car car7 = car4;
		car = null;
		System.out.println("Car 4 ref : " + car4.getSpeed());
		System.out.println("Car 5 ref : " + car5.getSpeed());
		System.out.println("Car 6 ref : " + car6.getSpeed());
		System.out.println("Car 7 ref : " + car7.getSpeed());
		System.out.println("Car 2 ref : " + car2.getSpeed());
		car = car7;
		if (car6.getDepo() > 20) {
			System.out.println("Büyük depolu araba");
		}
		TestClass testClass = new TestClass();
		testClass.test();
				
	}
}
