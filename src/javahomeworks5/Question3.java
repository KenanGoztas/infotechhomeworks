package javahomeworks5;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
	
//		3) Kullanicidan uslu sayi hesabi icin iki adet integer sayi isteyin. integer 
//	donus tipli, iki argumanli bir uslu sayi hesaplama methodu olusturun. 
//	Argumanlardan birini taban sayisi icin digerini ise ussu icin kullanin. 
//	Islemin sonucunu main method’ dan verilen komutla yazdirin.	

		
		Scanner input= new Scanner(System.in);
		
		System.out.println("üssünü almak istediğiniz bir sayı giriniz!");
		int number = input.nextInt();
		System.out.println("üssünü giriniz!");
		int power = input.nextInt();
		int result= exponentialNumbers(number, power);
		
		System.out.println(result);
	

	}
	public static int exponentialNumbers (int a, int b) {
		int result= 1;
		for(int i=0; i<b; i++) {
			result*=a;
		}
		
		return  result;
	}

}
