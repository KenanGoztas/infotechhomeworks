package javahomeworks5;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
//		4) Kullanıcıdan aldıgınız 5 basamaklı sayının rakamlarının toplamını 
//	yazdıran programi for döngüsü ile yazınız.
		
		int toplam=0;
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("5 basamaklı bir sayı giriniz!");
		int number = input.nextInt();	
		while(number<10000 && number<99999) {
			System.out.println("lütfen 5 basamaklı sayı giriniz");
			number = input.nextInt();
		}
		
		for(int i=1; i<=5;i++) {
			int kalan = number%10;
			number= number/10;
			toplam+=kalan;
		}
		System.out.println( "Girilen sayının rakamları toplamı " +toplam + "dır.");
	
		
		
		
	}

}
