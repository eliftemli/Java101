package Proje17_HarmonicNumbers;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		int num;
		double sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = scanner.nextInt();
		
		int i = 1;
		while( i <= num)
		{
			sum += (1.0) / (i);
			i++;	
		}
		
		System.out.println("Harmonic Number :" +sum);
		
		
	}

}
