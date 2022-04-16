package Proje19_FÝndEbobEkok;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		int num1, num2;
		int temp;
		int ebob = 1;
		int ekok = 1;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number");
		num1 = scanner.nextInt();

		System.out.println("enter a second number");
		num2 = scanner.nextInt();

		if (num1 > num2) {
			temp = num2;
			num2 = num1;
			num1 = temp;
		}
		/*
		// ---------EBOB For Dongusu----------------------

		for (int i = 1; i <= num1; i++) {
			if ((num1 % i == 0) && (num2 % i == 0)) {
				ebob = i;
			}

		}
		System.out.println("ebob: " + ebob);

		System.out.println("ekok: " + ((num1 * num2) / ebob));

		// --------EBOB For Dongusu - 2.Yontem-----------------------
		
		for (int k = num1; k >= 1; k--) {
			if ((num1 % k == 0) && (num2 % k == 0)) {
				ebob = k;
			}

		}
		System.out.println("ebob: " + ebob);
		
		*/
		
		//---------Ebob While Dongusu------------------

		int i = 1;
		while (i <= num1) {
			if ((num1 % i == 0) && (num2 % i == 0)) {
				ebob = i;
			}
			i++;
		}
		System.out.println("ebob: " + ebob);

		System.out.println("ekok: " + ((num1 * num2) / ebob));
	}

}
