package Proje12_multiplesOf4;

import java.util.Scanner;

//tek bir say� girilene kadar kullan�c�dan giri�leri kabul eden ve girilen de�erlerden 
//�ift ve 4'�n katlar� olan say�lar� toplay�p ekrana basan program� yaz�yoruz.

public class main {
	public static void main(String[] args) {

		int num;
		int sum = 0;
		int tmp = 0;

		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Enter a Number Please ");
			num = input.nextInt();

			if ((num % 4 == 0)) {
				sum += num;
				tmp++;

			}

		} while (num % 2 == 0);

		System.out.println("-----------------------------");

		System.out.println("\nTotal number entered: " + tmp);

		System.out.println("Summation: " + sum);

	}

}
