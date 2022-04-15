package Proje08_SýnýfýGecme;

import java.util.Scanner;

public class SinifiGecme {
	
	public static void main(String[] args) {
		
		int mat, fizik, turkce, kimya, muzik;
		double ortalama = 0, total= 0;
		int tmp = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Matematik Notunuz:");
		mat = scanner.nextInt();
		
		System.out.println("Fizik Notunuz:");
		fizik = scanner.nextInt();
		
		System.out.println("Türkçe Notunuz:");
		turkce = scanner.nextInt();
		
		System.out.println("Kimya Notunuz:");
		kimya = scanner.nextInt();
		
		System.out.println("Muzik Notunuz:");
		muzik = scanner.nextInt();
		
		if((mat >0) && (mat <= 100))
		{
			tmp++;
			total += mat;
		}
		 if((fizik >0) && (fizik <= 100))
		{
			tmp++;
			total += fizik;
		}
		 if((turkce >0) && (turkce <= 100))
		{
			tmp++;
			total += turkce;
		}
		 if((kimya >0) && (kimya <= 100))
		{
			tmp++;
			total += kimya;
		}
		 if((muzik >0) && (muzik <= 100))
		{
			tmp++;
			total += muzik;
		}
		
	        ortalama = total / tmp;
		
		if (ortalama <= 55) {
			System.out.println("\nSýnýfta kaldýnýz. Seneye görüþmek üzere");
			System.out.println("Ortalamanýz: " +ortalama);
			
		}
		else {
			System.out.println("Tebrikler. Sýnýfý geçtiniz.");
			System.out.println("Ortalamanýz: "+ortalama);
		}
		
		
		
	}

}
