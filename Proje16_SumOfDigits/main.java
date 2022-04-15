package Proje16_SumOfDigits;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int num;
		int sum = 0;
		int remainder;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");
		num = scanner.nextInt();

		while (num != 0) {
			remainder = num % 10;
			num = num / 10;
			sum += remainder;

		}
		System.out.println("Result: " + sum);

	}

}
