import java.util.Scanner;

public class KullaniciGirisi {
	
	public static void main(String[] args) {
		
		String userName, password;
		String userNameCont, passwordCont;
		
		Scanner scanner = new Scanner(System.in);
		
	//	--------------Kay�t K�sm� -------------------------------
		
		System.out.println("Siteye Ho�geldiniz:");
		System.out.println("Kullan�c� Ad�n�z: ");
		userName = scanner.nextLine();
		
		System.out.println("�ifreniz: ");
		password = scanner.nextLine();
		
		System.out.println("Bilgileriniz Ba�ar�l� Bir �ekilde Kaydedildi");
		
//		--------------Log �n -------------------------------
		
		System.out.println("Siteye Yapabilmek ��in Bilgilerinizi Giriniz:");
		System.out.println("Kullan�c� Ad�:");
		userNameCont = scanner.nextLine();
		System.out.println("�ifreniz: ");
		passwordCont = scanner.nextLine();
		
//		--------------Kontrol K�sm� -------------------------------
		
		if(userName.equals(userNameCont) && password.equals(passwordCont))
		{
			System.out.println("Giri� Yapt�n�z");
		}
		
		else if(userName.equals(userNameCont))
		{
			String newPassword;
			System.out.println("�ifre yanl��!! �ifrenizi s�f�rlamak istiyor musunuz?(yes/no)");
			String select = scanner.nextLine();
			
			if(select.equals("yes"))
			{
				
				System.out.println("yeni �ifreyi giriniz:");
				newPassword = scanner.nextLine();
				
				if(password.equals(newPassword))
				{
					System.out.println("�ifre Olu�turulamad�, L�tfen Ba�ka �ifre Giriniz");
				}
				else {
				
					System.out.println("yeni �ifre ba�ar�l� bir �ekilde olu�turuldu");
					
				}
			}
		}
		
	
		
	}

}
