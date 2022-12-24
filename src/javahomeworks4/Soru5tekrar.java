package javahomeworks4;

import java.util.Scanner;

public class Soru5tekrar {

	public static void main(String[] args) {
		System.out.println("Lütfen ilk harfi büyük, son harfi küçük, 8 karakterden oluşan, boşluk içermeyen bir şifre giriniz");
		while(true) {
		Scanner input = new Scanner(System.in);
		String password= input.nextLine();
		
		boolean bool1 =password.charAt(0)>=65 && password.charAt(0)<= 90;
		boolean bool2= (password.charAt(password.length()-1)>=97 && password.charAt(password.length()-1)<=122);
		boolean bool3 = password.length()>7;
		boolean bool4 = !password.contains(" ");
		
		if(bool1 && bool2&& bool3 && bool4) {
		System.out.println("password doğru girildi : " + password);
		break;			
		}
		else
			System.out.println("pasword hatalı, tekrar giriniz");
		}

	}

}
