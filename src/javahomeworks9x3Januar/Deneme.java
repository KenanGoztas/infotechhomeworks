package javahomeworks9x3Januar;

import java.util.Scanner;

public class Deneme {
    static int a;
    static int b;
    static String s;

    public static void main(String[] args) {
        voidParametresiz();
        System.out.println(a);

        //int sayi2= voidParametreli(8);
        //System.out.println(voidParametreli(5));
        voidParametreli(7);
        System.out.println(a);

        int sayi3= parametresizDönüslü();
        System.out.println(parametresizDönüslü());
        int sayi5 = parametreliDönüslü(8);
        System.out.println(sayi5);


        Scanner input = new Scanner(System.in);
        System.out.println("adınızı yazınız");
        String str = input.nextLine();
        System.out.println(hoşgeldin(str));




        System.out.println(s);
        a=5;
        b=4;
        int sayş6= hesap();
        System.out.println(hesap());

        String s3= input.nextLine();

        System.out.println("harf sayısı : " + harfSayisi(s3));

    }

    static void voidParametresiz() {
        a = 5;
        System.out.println("merhaba");
    }

    static void voidParametreli(int i) {
        i = 8;
        a=3;
    }

    static int parametresizDönüslü() {
        a=3;
        b=8;
        int sayi4= a+b;
        return sayi4;
    }

    static int parametreliDönüslü(int i) {
        i+=5;
        int c=i+6;
        return c;
    }
    static int hoşgeldin(String str){
        String str2=str+ " hoşgeldin";
    return 5 ;
    }

    static int hesap(){
        return a+b;
    }
    static int harfSayisi (String s){
        int s2=s.length();
        return s2;
    }
}
