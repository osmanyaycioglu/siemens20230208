package com.siemens.training.java.games.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Random random = new Random();
		int computerNumber = random.nextInt(100);
		boolean contGame = true;
		while (contGame) {
			System.out.println("Rakam tahmin et : ");
			int nextInt = scn.nextInt();
			if (nextInt == computerNumber) {
				System.out.println("Bildiniz");
				contGame = false;
			} else if (nextInt > computerNumber) {
				System.out.println("Rakam büyük");
			} else {
				System.out.println("Rakam küçük");
			}
		}
	}
}
