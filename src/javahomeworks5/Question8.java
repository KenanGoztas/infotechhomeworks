package javahomeworks5;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		
//		8) Kullanicidan toplamak icin sayi isteyin ve sayilarin toplami 500’e 
//	ulasincaya kadar sayi istemeye devam edin. Toplam 500’e ulastiginda 
//	veya gectiginde sayilarin toplami ve kac sayi girildigini yazdirin.(do while 
//	dongusu ile)
		
		
		
		Scanner input= new Scanner(System.in);
		int number;
		int kontrol=0;
		int toplam=0;
		
		System.out.println("toplamak üzere pozitif sayılar girin");
		do {
			number=input.nextInt();
			kontrol++;
			toplam+=number;
			
		}while(toplam<=500);
		
		System.out.println("toplam "+ (kontrol) + " pozitif sayı girdiniz ve girdiğiniz sayıların toplamı "+ toplam + "dir.");
	
		
	}

}
