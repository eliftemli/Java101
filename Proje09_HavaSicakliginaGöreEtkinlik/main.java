package Proje09_HavaSicakliginaG�reEtkinlik;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		
		
	        int sicaklik;
	        
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("S�cakl�k De�erini Giriniz: ");
	        sicaklik = scanner.nextInt();
	        
	        
	        if (sicaklik <= 5){
	            System.out.println("Kayak Yapabilirsiniz\n");
	        }
	        
	        if (sicaklik > 5 && sicaklik < 15){
	            System.out.println("Sinemaya Gidebilirsiniz\n");
	        }
	        
	        if (sicaklik >= 15 && sicaklik < 25){
	            System.out.println("Piknik Yapabilirsiniz\n");
	        }
	        
	        else{
	            System.out.println("Y�zmeye Gidebilirsiniz\n");
	        }
		
	}

}
