package javahomeworks9x3Januar;

import java.util.Scanner;

public class Question3 {
//    3. Kullanicidan; Dersin adi, Vize1 notu, Vize2 notu, Final notu, 3 adet
//    de sozlu sinav notlarini alin. Bu notlari asagidaki sartlara gore tek bir
//    method’ ta varargs kullanarak donem sonu not ortalamasi olarak
//    gosteriniz.
//            Sartlar;
//    I. Vizelerin ortalamasinin %30’ u
//    II. Final notunun %50’ si
//    III. Sozlu sinavlarin ortalamasinin %20’ si
public static void main(String[] args) {
    System.out.println("lütfen sırasıyla Dersin adi, Vize1 notu, Vize2 notu, Final notu, 3 adet de sozlu sinav notlarini giriniz");
    Scanner input = new Scanner(System.in);
    //String ders= input.nextLine();
    donemNotOrtalaması(input.nextLine(), input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(), input.nextInt(), input.nextInt());



}
public static void donemNotOrtalaması(String s, int ...n){

    System.out.println( "girilen ders : "+ s);

    double vizeOrtalama= ((n[0]+n[1])/2)*0.3;
    double finalOrtalama = ((n[2]+n[3])/2)*0.5;
    double sozluSinavOrtalama= ((n[4]+n[5]+n[6])/3)*0.2;

    double not= vizeOrtalama+finalOrtalama+sozluSinavOrtalama;

    System.out.println("dersin ortalaması " + not);
}

}
