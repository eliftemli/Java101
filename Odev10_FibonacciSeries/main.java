package Odev10_FibonacciSeries;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int num;
		int fib = 1;
		int fib1 = 0;
		int fib2 = 1;

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		num = scanner.nextInt();

		int i = 1;
		fib = fib1 + fib2;

		System.out.print("0 1");
		while (i <= (num - 2)) {

			fib = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib;

			System.out.print(" " + fib);
			i++;
		}

	}

}
