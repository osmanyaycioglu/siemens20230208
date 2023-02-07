package com.siemens.training.java;

public class FirstJavaClass {

	public static void main(String[] args) {
		System.out.println("Hello world");
		int xyz = 200;

		byte byteVal = 100; // 1 byte (-128) - (127) 0xFF - -128
		short shortVal = 154; // 2 byte
		int intVal = 300; // 4 byte
		long longVal = 1209334534534534L; // 8 byte

		float floatVal = 10.22342F; // 4 byte
		double doubleVal = 100.324324D; // 8 byte

		int intVal2 = intVal + 10;
		int intVal3 = 2828 + intVal2;
		
		intVal2 = intVal2 + 100;

		
		intVal2 += 100;

		System.out.println("İşlem sonucu : " + intVal2 + " diğer data : " + doubleVal);

		Integer intVal4 = 123;

	}

}
