package com.siemens.training.java;

public class OperationsClass {
	public static void main(String[] args) {
		int val1 = 120;
		int val2 = 30;
		int result = val1 + val2;
		System.out.println("Toplama : " + result);
		result = val1 - val2;
		System.out.println("Çıkarma : " + result);
		result = val1 / val2;
		System.out.println("Bölme : " + result);
		result = val1 * val2;
		System.out.println("Çarpma : " + result);

		System.out.println("Toplama : " + (val1 + val2));
		System.out.println("Çıkarma : " + (val1 - val2));
		System.out.println("Bölme : " + (val1 / val2));
		System.out.println("Çarpma : " + (val1 * val2));

	}
}
