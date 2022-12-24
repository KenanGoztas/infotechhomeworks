package javahomeworks5;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
//		2) ”InfotechAcademy1234...!’^.+” String ifadesinde,
//	a. kac harf
//	b. kac rakam
//	c. kac ozel karakter oldugunu ekrana yazdıran 
//	karakterSay() metodunu yazınız.
//		
//		
//		Regular Expression Açıklaması
//		[0-9]	\\d 0 ile 9 arasında herhangi bir rakam
//		[^0-9]	\\D 0 ile 9 arasındaki rakamlar haricindeki karakter 
//				\\s Whitespace karakter, Kısaca: [ \t\n\x0b\r\f]
//				\\S Whitespace karakter haricindeki bir karakter, Kısaca: [^\s]
//				\\w Word karakter, Kısaca [a-zA-Z_0-9] Yani küçük harf, büyük harf veya rakam dan bir tanesi
//				\\W Word karakter harici bir karakter. Yani küçük harf, büyük harf veya rakam harici bir karakter [^\w]
//				\\S+ Birden fazla white space karakter harici karakterler
//	[A-Za-z]    [^A-Za-z]
//   [a-z] küçük harfler dışındaki karakterler. Tersi [^a-z]
//  [A-Za-z0-9-_]	harf ve rakam dışındaki karakterler. Tersi[^A-Za-z0-9-_]
		
		// [^[a-z]]
		
		Scanner input= new Scanner(System.in);
		String str1 = "InfotechAcademy1234...!’^.+";
		karakterSay(str1);
//		karakterSay(input.nextLine()); //kullanıcıdan giriş yapılınca çalışmıyor??
		
		
	}
	
	public static void karakterSay(String str) {
		
		String	harf = str.replaceAll("[^A-Za-z]", "");
		System.out.println(harf+ " "+ harf.length() + " harf var" );
		
		String	sayı = str.replaceAll("[^0-9]", "");
		System.out.println(sayı+ " "+ sayı.length() + " sayı var" );
		
		
		String	karakter = str.replaceAll("[A-Za-z0-9]", "");
		System.out.println(karakter+ " "+ karakter.length() + " özel karakter var" );
		
		
		
//		String yeni = str.replaceAll("[^A-Za-z0-9]", "");
//		System.out.println(yeni);
//		
		
		
		

		
	}
	
	
	
	
	
	
	
	
	

}
