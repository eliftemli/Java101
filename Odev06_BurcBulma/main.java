package Odev06_BurcBulma;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		int month, day;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Do�du�unuz Ay ");
		month = scanner.nextInt();
		
		System.out.println("Do�du�unuz g�n:");
		day = scanner.nextInt();
		
		if(month == 1)
		{
			if((day >=1) && (day <=21 ) )
			{
				System.out.println("o�lak");
			}
			else if((day >= 22) && (day <= 30))
			{
				System.out.println("kova");
			}
		}
		
		else if(month == 2)
		{
			if((day >= 1) && (day<= 19))
			{
				System.out.println("kova");
			}
			else if((day >=20 ) && (day <=29))
			{
				System.out.println("bal�k");
			}
		}
		
		
		else if(month == 3)
		{
			if((day >= 1) && (day<= 20))
			{
				System.out.println("bal�k");
			}
			else if((day >=21 ) && (day <=30))
			{
				System.out.println("ko�");
			}
		}
		else if(month == 4)
		{
			if((day >= 1) && (day<= 20))
			{
				System.out.println("ko�");
			}
			else if((day >=21 ) && (day <=30))
			{
				System.out.println("bo�a");
			}
		}
		else if(month == 5)
		{
			if((day >= 1) && (day<= 21))
			{
				System.out.println("bo�a");
			}
			else if((day >=22 ) && (day <=30))
			{
				System.out.println("ikizler");
			}
		}
		else if(month == 6)
		{
			if((day >= 1) && (day<= 22))
			{
				System.out.println("ikizler");
			}
			else if((day >=23 ) && (day <=30))
			{
				System.out.println("yenge�");
			}
		}
		else if(month == 7)
		{
			if((day >= 1) && (day<= 22))
			{
				System.out.println("yenge�");
			}
			else if((day >=23 ) && (day <=29))
			{
				System.out.println("aslan");
			}
		}
		else if(month == 8)
		{
			if((day >= 1) && (day<= 22))
			{
				System.out.println("aslan");
			}
			else if((day >=23 ) && (day <=30))
			{
				System.out.println("ba�ak");
			}
		}
		else if(month == 9)
		{
			if((day >= 1) && (day<= 22))
			{
				System.out.println("ba�ak");
			}
			else if((day >=23 ) && (day <=30))
			{
				System.out.println("terazi");
			}
		}
		else if(month == 10)
		{
			if((day >= 1) && (day<= 22))
			{
				System.out.println("terazi");
			}
			else if((day >=23 ) && (day <=30))
			{
				System.out.println("akrep");
			}
		}
		else if(month == 11)
		{
			if((day >= 1) && (day<= 21))
			{
				System.out.println("akrep");
			}
			else if((day >=22 ) && (day <=30))
			{
				System.out.println("yay");
			}
		}
		else if(month == 12)
		{
			if((day >= 1) && (day<= 21))
			{
				System.out.println("yay");
			}
			else if((day >=22 ) && (day <=30))
			{
				System.out.println("o�lak");
			}
		}
		
		
	}

}
