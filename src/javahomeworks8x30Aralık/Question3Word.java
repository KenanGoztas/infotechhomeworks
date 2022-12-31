package javahomeworks8x30Aralık;

import java.util.ArrayList;
import java.util.List;

public class Question3Word {
    public static void main(String[] args) {

//        Soru 1:
//        Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop
//        kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        System.out.println("1. soru");
        int[] arr1= {4,7,3,6};
        int number1=1;
        for (int i:arr1) {
            number1*=i;
        }
        System.out.println(number1);

//                Soru 2:
//        Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each loop
//        kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        System.out.println("2. soru");
        int number2=0;
        List<Integer> numList2= new ArrayList<>();
        numList2.add(5);
        numList2.add(4);
        numList2.add(8);
        numList2.add(3);
        System.out.println(numList2);
        for (int i:numList2) {
            number2+= (i*i);
        }
        System.out.println(number2);

//                Soru 3:
//        iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak
//        bulunuz. Sonucu ekrana yazdiriniz.
//                Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
        System.out.println("3. soru");
        String[] word1= {"ali", "veli", "ahmet", "murat"};
        String[] word2= {"ali", "veli", "ahmet", "mehmet"};
        int kontrol=0;

        for (String str1  :word1) {
            for (String str2:word2) {
                if (str1.equals(str2)) {
                    System.out.println(str1);
                    kontrol++;
                }
            }
        }
        if (kontrol==0)
            System.out.println("ortak kelime yok.");
        else
        System.out.println(kontrol + " adet ortak kelime vardır.");

//        Soru 4:
//        Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak yazdiriniz.
//                ipucu: split()
        System.out.println("4. soru");
        String str4= "benim adım kenan";
        String[] ch= str4.split("");
        for (String c:ch) {
            System.out.print(c + "\t");
        }
    }
}
