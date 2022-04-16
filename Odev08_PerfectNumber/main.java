package Odev08_PerfectNumber;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		int num;
		int total = 0;
		int tempNum;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number:  ");
		num = scanner.nextInt();

		tempNum = num;

		for (int i = 1; i < tempNum; i++) {
			if (tempNum % i == 0) {
				total += i;
			}
		}
		
		if(total == num)
		{
			System.out.println(num+ " is perfect number");
		}
		else {
			System.out.println(num+ " is not perfect number");
		}

	}

}
