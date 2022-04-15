package Odev04_ArtikYil;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		int yil;
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Yýl Giriniz: ");
		yil = scanner.nextInt();
		
		if ((yil % 4 == 0 )) 
		{
			
			if(yil % 100 == 0)
			{
				if(yil % 400 == 0)
				{
				System.out.println(yil+" bir artýk yýldýr !");
				
				}
				else 
				{
					System.out.println(yil+ " bir artik yýl deðildir !");
				}
				
			}
			else
			{	
			System.out.println(yil+" bir artýk yýldýr !");
			}
		
	     }
      else {
			System.out.println(yil+ " bir artik yýl deðildir !");
			}	
		
	}

}
