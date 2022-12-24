package javahomeworks4;

import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
		/*
		 * Soru 3) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu 
yazdirin
		 */
		Scanner input= new Scanner(System.in);
		System.out.println("lütfen isminizi giriniz");
		String name= input.nextLine();
		System.out.println("lütfen soyisminizi giriniz");
		String surname= input.nextLine();
		if(name.length()>surname.length())
			System.out.println("İsminizin harf sayısı soyisminizden uzundur");
		else if(name.length()==surname.length())
			System.out.println("İsminizin harf sayısı soyisminize eşittir");
		else
			System.out.println("Soyisminizin harf sayısı isminizden uzundur");

	}

}
