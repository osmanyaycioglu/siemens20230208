package com.siemens.training.java.pkg;

import java.util.Scanner;

public class CarRunner2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("araba hız :");
		int carSpeed = scanner.nextInt();
		System.out.println("araba menzil :");
		int carRange = scanner.nextInt();
		System.out.println("araba depo(lt) :");
		int carDepo = scanner.nextInt();
		
		Car car = new Car(carSpeed, carRange, carDepo);
		//Car car = null;
		System.out.println(" Oluşturulan araba : " + car);
		scanner.close();
	}
}
