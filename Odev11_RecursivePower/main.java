package Odev11_RecursivePower;

import java.util.Scanner;


public class main {
	
	static int power(int num1, int num2) {
		
		int result = 1;

		if (num2 < 1) {
			return 1;
		}

		else {
			return num1 * power(num1, num2 - 1);
		}
	}

	public static void main(String[] args) {

		int num1, num2, select;

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Üs Alma Programýna Hoþgeldiniz ");
		
		while (true) {
			
			System.out.println("Taban deðeri giriniz: ");
			num1 = scanner.nextInt();
			
			System.out.println("Üs deðerini giriniz: ");
			num2 = scanner.nextInt();
			
			System.out.println("Sonuç: " + num1 + "^" + num2 + ": " + power(num1, num2));

			System.out.println("\n*****************");
			System.out.println("Devam etmek için 1\n"
					+"Çýkýþ yapmak için 0");
			select = scanner.nextInt();
			
			
			if(select == 0)
			{
				System.out.println("programdan çýkýþ yapýlýyor...");
				break;
			}

		}
	}
}
