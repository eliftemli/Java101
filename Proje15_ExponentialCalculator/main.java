package Proje15_ExponentialCalculator;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int base, power;
		int result = 1;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a base number:");
		base = input.nextInt();

		System.out.println("Enter a power number:");
		power = input.nextInt();

		if (base != 0) {
			if (power != 0) {
				for (int i = 1; i <= power; i++) {
					result *= base;
				}
				System.out.println("Result " + base + "^" + power + ": " + result);

			}

			else {
				result = 1;
				System.out.println("Result " + base + "^" + power + ": " + result);

			}

		}

		else {
			System.out.println("Base value cannot be 0");
		}
	}
}
