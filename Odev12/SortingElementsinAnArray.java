package Odev12;

import java.util.Arrays;
import java.util.Scanner;

public class SortingElementsinAnArray {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("dizinin boyutunu giriniz: ");
		
		int num = scanner.nextInt();
		
		
		
		int[] list = new int[num];
		
		System.out.println("Dizinin Elemanlarýný Giriniz:");
		for(int i=0; i <list.length; i++)
		{
			list[i] = scanner.nextInt();
			
		}
		
		System.out.println("Dizinin Boyutu: " +num);
		
		for(int i=0; i <list.length; i++)
		{
			System.out.println((i+1) + ". Elemaný: " +list[i]);
			
		}
		Arrays.sort(list);
		System.out.println("Sýralama " +Arrays.toString(list));
		
		
	}

}
