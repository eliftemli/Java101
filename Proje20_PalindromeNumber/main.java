package Proje20_PalindromeNumber;

import java.util.Scanner;

public class main {

	static boolean isPalindrome(int num) {
		int temp = num;
		int reverseNum = 0;
		int lastNum;

		while (temp != 0) {
			
			lastNum = temp % 10;
			reverseNum = (reverseNum * 10) + lastNum;
			temp /= 10;

		}
		
		if (num == reverseNum) {
			System.out.println(num + " is palindrome number");
			return true;
		} else {
			System.out.println(num + " is not palindrome number");

			return false;
		}

	}

	public static void main(String[] args) {

		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		num = scanner.nextInt();
		
		System.out.println(isPalindrome(num));
		

	}

}
