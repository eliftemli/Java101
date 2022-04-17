package Proje22_Calculator;

import java.util.Scanner;

public class main {
	
	//**********************************************

	static int sum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("toplam: " + result);
		return result;
	}
	
	//**********************************************
	
	static int minus(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("Çıkartma: " + result);
		return result;
	}
	
	//**********************************************
	
	static int times(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("Çarpma: " + result);
		return result;
	}
	
	//**********************************************
	
	static int divide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0'a bölme hatası");
			return 0;
		}

		int result = num1 / num2;
		System.out.println("Bölme: " + result);

		return result;
	}
	
	//**********************************************
	
	static int power(int num1, int num2) {
		int result = 1;

		for (int i = 1; i <= num2; i++) {
			result += num1;
		}
		return result;
	}
	
	//**********************************************
	
	static int mod(int num1, int num2) {
	
		return num1 % num2;
	}
	
	//**********************************************
	
	static void rectangle(int num1, int num2)
	{
		System.out.println("çevre: " +(2 * (num1 + num2)));
		System.out.println("alan: " +(num1 * num2));
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int select;

		
		String menu = "Hoşgeldiniz \n"
					+ "1- Toplama İşlemi\n" 
					+ "2- Çıkarma İşlemi\n" 
					+ "3- Çarpma İşlemi\n" 
					+ "4- Bölme İşlemi\n"
					+ "5- Üslü Sayı Hesaplama\n" 
					+ "6- Mod Alma\n" 
					+ "7- Dikdörtgen Alan ve Çevre Hesabı\n"
					+ "0- Çıkış Yap";
		

		while (true) {
			System.out.println("*********************\n");
			System.out.println(menu);
			System.out.println("\n*********************\n");
			System.out.print("bir işlem seçiniz: ");
			select = scanner.nextInt();

			if (select == 0) {
				System.out.println("çıkış yapılıyor....");
				break;
			}

			System.out.println("ilk sayi  giriniz: ");
			int num1 = scanner.nextInt();
			System.out.println("ikinci sayıyı giriniz: ");
			int num2 = scanner.nextInt();

			switch (select) {
			case 1:

				sum(num1, num2);
				break;

			case 2:

				minus(num1, num2);
				break;

			case 3:

				times(num1, num2);
				break;

			case 4:

				divide(num1, num2);
				break;

			case 5:

				System.out.println(power(num1, num2));
				break;
				
			case 6:
				
				mod(num1, num2);
				break;
				
			case 7:
				
				rectangle(num1, num2);
				break;
				

			default:
				System.out.println("geçersiz bir işlem girdiniz...");
				break;

			}

		}
	}

}
