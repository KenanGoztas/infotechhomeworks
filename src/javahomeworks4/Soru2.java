package javahomeworks4;

import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
		/*
		  Soru 2) Kullanicidan isim isteyin. Eger - isim “a” harfi iceriyorsa “Girdiginiz isim a 
harfi iceriyor” - isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor” - ikisi de yoksa
“Girdiginiz isim a veya Z harfi icermiyor” yazdirin.
		  
		 */
		Scanner input= new Scanner(System.in);
		System.out.println("lütfen bir isim giriniz");
		String name= input.nextLine();
		if(name.contains("a")) {
			System.out.println("Girdiğiniz isim a harfi içeriyor");
		}
		else if(name.contains("Z")) {
			System.out.println("Girdiğiniz isim Z harfi içeriyor");
		}
		else
			System.out.println("Girdiğiniz isim a ve Z harfi içermiyor");

			

		
	}

}
