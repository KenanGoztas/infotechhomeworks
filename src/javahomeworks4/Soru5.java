package javahomeworks4;

import java.util.Scanner;

public class Soru5 {

	public static void main(String[] args) {
		/*
		  Aşağıdaki sorunun zorluk seviyesi yüksektir. Kısmi çözümlerde kabul edilir. 
		Soru 5) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre 
		basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” 
		yazdirin 
		- Ilk harf buyuk harf olmali 
		- Son harf kucuk harf olmali 
		- Sifre bosluk icermemeli 
		- Sifre uzunlugu en az 8 karakter olmali
		*/
		
		System.out.println("Lütfen ilk harfi büyük, son harfi küçük, 8 karakterden oluşan, boşluk içermeyen bir şifre giriniz");
		while(true) {
		Scanner input = new Scanner(System.in);
		String password= input.nextLine();
		if(!(password.charAt(0)>=65 && password.charAt(0)<= 90)){
			System.out.println("parolanın ilk harfi Büyük olmalı, lütfen yeni bir sifre girin");
			continue;
		}
		if (!(password.charAt(password.length()-1)>=97 && password.charAt(password.length()-1)<=122)){
			System.out.println("parolanın son harfi Küçük olmalı, lütfen yeni bir sifre girin");
			continue;
		}
		if(password.length()<8) {
			System.out.println("parola 8 karakterden oluşmalı, lütfen yeni bir sifre girin.");
			continue;
		}
		if(password.contains(" ")) {
			System.out.println("parolada boşluk olmamalı,lütfen yeni bir şifre girin.");
			continue;
		}
		System.out.println("password doğru girildi : " + password);
		break;
					
		}
		

	}

}
