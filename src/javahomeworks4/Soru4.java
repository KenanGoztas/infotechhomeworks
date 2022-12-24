package javahomeworks4;

import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
		/*
		  Soru 4) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi 
yazdirin.
isim-soyisim : O*** K***** 
kart no : **** **** **** 1234
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("lütfen isminizi ve soyisminizi giriniz");
		String name= input.nextLine().toUpperCase();
		System.out.println("lütfen kredi kartınızın 16 haneli  numarasını giriniz");
		String cardnumber= input.nextLine();
		while(cardnumber.length()!=16) {
			System.out.print("lütfen 16 rakam giriniz");
			 cardnumber = input.nextLine();
		}
		
		System.out.println(name);
		System.out.println(cardnumber);
		int index= name.indexOf(" ");
		
		System.out.print("isim-soyisim : ");
		String name1= name.substring(0,index);
		System.out.print(name1.substring(0,1));
		
		for(int i= 0;i<name1.length()-1; i++) {
			System.out.print("*");

		}
		System.out.print(name.substring(index, index+2));
		
		String name2= name.substring(index+2);
		
		for(int i= 0;i<name2.length(); i++) {
			System.out.print("*");
		}
		System.out.println();
		
		String cardnumber2= cardnumber.substring(0,4)+ " "+ cardnumber.substring(4,8)+ " " +cardnumber.substring(8,12);

		String cardnumber3= cardnumber2.replaceAll("\\S", "*");
		
		
		System.out.print("kart no : " + cardnumber3 + " " + cardnumber.substring(12));


			
		


		

		
		

		
		
		
		
		
		
		
	}

}
