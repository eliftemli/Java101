import java.util.Scanner;

public class KullaniciGirisi {
	
	public static void main(String[] args) {
		
		String userName, password;
		String userNameCont, passwordCont;
		
		Scanner scanner = new Scanner(System.in);
		
	//	--------------Kayýt Kýsmý -------------------------------
		
		System.out.println("Siteye Hoþgeldiniz:");
		System.out.println("Kullanýcý Adýnýz: ");
		userName = scanner.nextLine();
		
		System.out.println("Þifreniz: ");
		password = scanner.nextLine();
		
		System.out.println("Bilgileriniz Baþarýlý Bir Þekilde Kaydedildi");
		
//		--------------Log Ýn -------------------------------
		
		System.out.println("Siteye Yapabilmek Ýçin Bilgilerinizi Giriniz:");
		System.out.println("Kullanýcý Adý:");
		userNameCont = scanner.nextLine();
		System.out.println("Þifreniz: ");
		passwordCont = scanner.nextLine();
		
//		--------------Kontrol Kýsmý -------------------------------
		
		if(userName.equals(userNameCont) && password.equals(passwordCont))
		{
			System.out.println("Giriþ Yaptýnýz");
		}
		
		else if(userName.equals(userNameCont))
		{
			String newPassword;
			System.out.println("Þifre yanlýþ!! þifrenizi sýfýrlamak istiyor musunuz?(yes/no)");
			String select = scanner.nextLine();
			
			if(select.equals("yes"))
			{
				
				System.out.println("yeni þifreyi giriniz:");
				newPassword = scanner.nextLine();
				
				if(password.equals(newPassword))
				{
					System.out.println("Þifre Oluþturulamadý, Lütfen Baþka Þifre Giriniz");
				}
				else {
				
					System.out.println("yeni þifre baþarýlý bir þekilde oluþturuldu");
					
				}
			}
		}
		
	
		
	}

}
