package Odev04_ArtikYil;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		int yil;
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Y�l Giriniz: ");
		yil = scanner.nextInt();
		
		if ((yil % 4 == 0 )) 
		{
			
			if(yil % 100 == 0)
			{
				if(yil % 400 == 0)
				{
				System.out.println(yil+" bir art�k y�ld�r !");
				
				}
				else 
				{
					System.out.println(yil+ " bir artik y�l de�ildir !");
				}
				
			}
			else
			{	
			System.out.println(yil+" bir art�k y�ld�r !");
			}
		
	     }
      else {
			System.out.println(yil+ " bir artik y�l de�ildir !");
			}	
		
	}

}
