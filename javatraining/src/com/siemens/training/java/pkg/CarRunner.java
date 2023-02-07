package com.siemens.training.java.pkg;

public class CarRunner {
	public static void main(String[] args) {
		Car car = new Car(100,400,30);
//		car.setRange(500);
//		car.setDepo(50);

		System.out.println("araba speed : " + car.getSpeed() + " range : " + car.getRange() + " e : " + car.effectiveness());
		
		Car car2 = new Car(180, 600, 50);
		System.out.println("araba 2 speed : " + car2.getSpeed() + " range : " + car2.getRange() + " e : " + car2.effectiveness());

		System.out.println("araba : " + car2);
	}
}
