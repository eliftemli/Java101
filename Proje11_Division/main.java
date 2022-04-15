package Proje11_Division;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		int num;
		int sum = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number Please");
		num = input.nextInt();

		for (int i = 0; i <= num; i++) {

			if ((i % 3 == 0) && (i % 4 == 0)) {
				System.out.print(i+ ",");

				sum += i;

			}

		}

		System.out.println("\nSummation: " + sum);

	}
}
