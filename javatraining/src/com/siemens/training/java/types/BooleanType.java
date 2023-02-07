package com.siemens.training.java.types;

import com.siemens.training.java.pkg.Car;

public class BooleanType {
	public static void main(String[] args) {
		boolean xyz = true;
		boolean abc = false;
		
		int intVal = 100;
		int checkInt = 50;
		
		boolean check1 = (intVal == 200);
		boolean check2 = (intVal > 200);
		boolean check3 = (intVal < 200);
		boolean check4 = (intVal <= 200);
		boolean check5 = (intVal >= 200);
		boolean check6 = (intVal > 200) && (intVal < 300) && xyz;
		// true and true => true
		// false and true => false
		// true and false => false
		// false and false => false
		boolean check7 = (intVal > 200) || (intVal < 300) || xyz;
		// true or true => true
		// false or true => true
		// true or false => true
		// false or false => false
		boolean check8 = ((intVal > 200) || (intVal < 300)) && (xyz || intVal > 100) ;
		
		
		
		System.out.println("Check1 : " + check1 + " Check2 : " + check2 + " Check3 : " + check3);
		
		if (!check1) {
			System.out.println("eşitlik");
		}
		int testVal = (300 + checkInt);
		if (intVal == 200 || intVal > testVal) {
			System.out.println("değer ya 200 yada 300 den büyük");
		}
		if (intVal == 200 || intVal > (300 + checkInt)) {
			System.out.println("değer ya 200 yada 300 den büyük");
		}
		
		while(intVal < 200) {
			System.out.println("Şu anki intVal : " +  intVal);
			intVal++;
		}
		
		Car car = new Car(100, 100, 30);
		Car car2 = new Car(100, 100, 30);
		if (car.getDepo() > 20) {
			System.out.println("Büyük depolu araba");
		}
		
	}
}
