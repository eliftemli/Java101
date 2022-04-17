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
		System.out.println("��kartma: " + result);
		return result;
	}
	
	//**********************************************
	
	static int times(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("�arpma: " + result);
		return result;
	}
	
	//**********************************************
	
	static int divide(int num1, int num2) {
		if (num2 == 0) {
			System.out.println("0'a b�lme hatas�");
			return 0;
		}

		int result = num1 / num2;
		System.out.println("B�lme: " + result);

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
		System.out.println("�evre: " +(2 * (num1 + num2)));
		System.out.println("alan: " +(num1 * num2));
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int select;

		
		String menu = "Ho�geldiniz \n"
					+ "1- Toplama ��lemi\n" 
					+ "2- ��karma ��lemi\n" 
					+ "3- �arpma ��lemi\n" 
					+ "4- B�lme ��lemi\n"
					+ "5- �sl� Say� Hesaplama\n" 
					+ "6- Mod Alma\n" 
					+ "7- Dikd�rtgen Alan ve �evre Hesab�\n"
					+ "0- ��k�� Yap";
		

		while (true) {
			System.out.println("*********************\n");
			System.out.println(menu);
			System.out.println("\n*********************\n");
			System.out.print("bir i�lem se�iniz: ");
			select = scanner.nextInt();

			if (select == 0) {
				System.out.println("��k�� yap�l�yor....");
				break;
			}

			System.out.println("ilk sayi  giriniz: ");
			int num1 = scanner.nextInt();
			System.out.println("ikinci say�y� giriniz: ");
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
				System.out.println("ge�ersiz bir i�lem girdiniz...");
				break;

			}

		}
	}

}
