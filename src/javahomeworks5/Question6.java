package javahomeworks5;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
//		6) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac 
//	tane olduklarini ekranda yazdirin.(while dongusu ile)

		Scanner input= new Scanner(System.in);
		System.out.println("Bir sayı giriniz!");
		int baslangıc = input.nextInt();
		
		int toplamBolen=0;
		int bolen=1;
		while(!(baslangıc+1==bolen)) {
			if(baslangıc % bolen == 0) {
				System.out.println(bolen);
				toplamBolen++;	
			}
			
			bolen++;
		}
		
		System.out.println("toplam "+ toplamBolen + " tane tam bölen var.");
		

		
	}

}
