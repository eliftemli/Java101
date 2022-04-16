package odev07_FindingMinMax;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		int total;
		int num;
		int max = 0;
		int min = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many numbers will you enter: ");
		total = scanner.nextInt();
		
		int i=1;
		while(i <= total)
		{
			System.out.println("Enter the " +i+ ". Number");
			num = scanner.nextInt();
			i++;
			
			if(num >= max)
			{
				max = num;
			}
			
			if(num <= min)
			{
				min = num;
			}
			
			
		}
		System.out.println("The biggest number is: " +max);
		System.out.println("The smallest number is: " +min);
		
	}
}
