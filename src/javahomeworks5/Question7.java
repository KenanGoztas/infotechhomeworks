package javahomeworks5;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
//		7) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 
//	0’a basmasini soyleyin. 
//	Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif 
//	sayilarin toplaminin kac oldugunu yazdirin.(do while dongusu ile)
		
		Scanner input= new Scanner(System.in);
		int number;
		int kontrol=0;
		int toplam=0;
		
		System.out.println("toplamak üzere pozitif sayılar girin, işlemi bitirmek için sıfırı seçin");
		do {
			number=input.nextInt();
			kontrol++;
			toplam+=number;
			
		}while(number!=0);
		
		System.out.println("toplam "+ (kontrol-1) + " pozitif sayı girdiniz ve girdiğiniz sayıların toplamı "+ toplam + "dir.");
	
	
	
	}

}
