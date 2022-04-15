package Proje10_SayilariSiralama;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.Sayi:");
		num1 = scanner.nextInt();
		
		System.out.println("2.Sayi:");
		num2 = scanner.nextInt();
		
		System.out.println("3.Sayi:");
		num3 = scanner.nextInt();
		
		if((num1 < num2) && (num1 < num3))
		{
			if(num2 < num3)
			{
				System.out.println( num1 +" < " +num2 +" < " + num3);
			}
			
			else
			{
				System.out.println( num1 +" < " +num3 +" < " + num2);
			}
		}
		
		else if((num2 < num1 ) && (num2 < num3 ))
		{
			if(num1 < num3)
			{
				System.out.println( num2 +" < " +num1 +" < " + num3);
			}
			else {
				System.out.println( num2 +" < " +num3 +" < " + num1);
			}
		}
		
		else if((num3 < num2) && (num3 < num1)) {
			
			if(num2 < num1)
			{
				System.out.println( num3 +" < " +num2 +" < " + num1);
			}
			else {
				System.out.println( num3 +" < " +num1 +" < " + num2);
			}
		}
	}

}
