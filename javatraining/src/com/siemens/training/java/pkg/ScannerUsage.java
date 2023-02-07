package com.siemens.training.java.pkg;

import java.util.Scanner;

public class ScannerUsage {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		double double1 = x.nextDouble();
		int int1 = x.nextInt();
		System.out.println("test:");
		String string1 = x.next();
		System.out.println("Girilenler : " + double1 + " " + int1 + " " + string1);
	}
}
