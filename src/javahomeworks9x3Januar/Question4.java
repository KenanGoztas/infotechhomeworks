package javahomeworks9x3Januar;

import java.time.Duration;
import java.util.Scanner;

public class Question4 {
//    4. Kullanicidan adini, soy adini isteyin ve onu “Hosgeldin Ad Soyad”
//    seklinde selamlayin. Tc kimlik numarasini talep edin ve kullaniciya
//    tc’ sinin 1. , 4. ve 9. rakamlarini gosterip onaylatin.
//16 haneli kredi kardi numarasini isteyip ekranda son dort hanesi
//    gorunecek sekilde yazdirin(**** ****  **** 5434) .Tum islemleri
//    StringBuilder kullanarak yapiniz. Bu programin en basinda zamani
//    alin ve islemler tamamlaninca tekrar zaman alin ve arada gecen
//    sureyi ekrana “Islemler ..... surede tamamlandi.” Ibaresini gosterip
//    programi tamamlayin.
public static void main(String[] args) {
    long başlangic = System.currentTimeMillis();
    System.out.println("başlangıc" +başlangic);
    System.out.println("adınızı soyadınızı giriniz");
    Scanner input = new Scanner(System.in);
    System.out.println("Hoşgeldin "+ new StringBuilder(input.nextLine()));
    System.out.println("Tc kimlik numaranızı giriniz");
    StringBuilder i= new StringBuilder(input.nextLine());
    System.out.println(i);
    char[]c= i.toString().toCharArray();
    System.out.println("girilen numaranın 1. rakamı : "+ c[0]+ ", 4. rakamı : " +c[3] +" ve 9. rakamı : " + c[8]);

    System.out.println("16 haneli kredi kartı numaranızı giriniz");
    StringBuilder kk= new StringBuilder(input.nextLine());
    kk.replace(0,12, "************");
    kk.insert(4, " ");
    kk.insert(9," ");
    kk.insert(14, " ");
    System.out.println(kk);

//    Duration.between(start, end);




long bitis = System.currentTimeMillis();
long fark= bitis-başlangic;
    System.out.println("Islemler " + fark + " milisaniye surede tamamlandi.");

}
}
