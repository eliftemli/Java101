package Proje14_CombinationExample;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int n, r, dif;
		int nFactorial = 1, rFactorial = 1, difFactorial = 1;

		Scanner input = new Scanner(System.in);

		System.out.println("enter N value please");
		n = input.nextInt();

		System.out.println("enter r value please");
		r = input.nextInt();
		

		dif = (n - r);

		// ------ factorial--------

		for (int i = 1; i <= n; i++) {

			nFactorial *= i;

		}
		for (int i = 1; i <= r; i++) {

			rFactorial *= i;

		}
		for (int i = 1; i <= dif; i++) {

			difFactorial *= i;

		}

		int combination = (nFactorial) / (rFactorial * difFactorial);

		System.out.println("Combination: "+combination);

	}

}
