package com.siemens.training.java.operations;

import java.util.Scanner;

public class IfOperations {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("0-100 Arasında bir sayı girin : ");
		int girdi = scanner.nextInt();
		if (girdi > 100 || girdi < 0) {
			System.err.println("Yanlış girdi 0-100 arasında olmalı");
		} else if (girdi >= 0 && girdi < 30) {
			System.out.println("Girdi küçük sayı");
		} else if (girdi >= 30 && girdi < 60) {
			System.out.println("Girdi orta sayı");
		} else if (girdi >= 60 && girdi < 90) {
			System.out.println("Girdi yüksek sayı");
		} else {
			System.out.println("Girdi limit sayı");
		}
		
	}
}
