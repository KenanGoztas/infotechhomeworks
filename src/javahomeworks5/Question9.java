package javahomeworks5;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {

//		9) Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore 
//		carpim tablosu olusturun. Ornek,kullanici 3 girerse,
//		1 2 3
//		2 4 6
//		3 6 9
//		(ic ice for ile) [Zor seviye – Yapamazsaniz onemli deil.]
		
		Scanner input= new Scanner(System.in);
		System.out.println("Bir sayı giriniz!");
		int number = input.nextInt();
		
		for(int i=1;i<=number;i++) {
			for(int k =1;k<=number;k++) {
				System.out.print(i + "*" + k + "=" + (i * k) + "\t"+"\t");
			}
			System.out.println();
		
		
		}
		
		
		
		
		
		
		
	}

}
