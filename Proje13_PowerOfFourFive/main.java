package Proje13_PowerOfFourFive;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		int num;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number please: ");
		num = input.nextInt();

		System.out.println("power of 4");
		for (int i = 1; i < num; i *= 4) {
			System.out.print(i + " - ");
		}
		System.out.println("\n-------------------");
		System.out.println("power of 5");
		for (int i = 1; i < num; i *= 5) {
			System.out.print(i + " - ");
		}
		

	}

}
