package javahomeworks9x3Januar;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Question2 {
    //    2. Kullanicidan dogum tarihini isteyin ve yasini;
//    a) Gun, ay, yil olarak yasHesapla() static void metodu’ nda,
//    b) Sade ay olarak ay() non-static void metodu’ nda,
//    c) Sadece gun olarak gun() non-static String donuslu method’ unda,
//    hesaplayiniz.
    public static void main(String[] args) {
        System.out.println("doğum tarihini giriniz");
        Scanner input = new Scanner(System.in);
        LocalDate localDate1 = LocalDate.of(input.nextInt(), input.nextInt(), input.nextInt());

        //LocalDate localDate2 = LocalDate.now();
       //a
        yasHesapla(localDate1);
        //b
        ay(localDate1);
        //c
        String g = new Question2().gun(localDate1);
        System.out.println(g);

    }

    private String gun(LocalDate localDate) {

        Period period = Period.between(localDate, LocalDate.now());
        String s = String.valueOf(period.getDays());

        int i= (period.getDays() + ((period.getYears()*12)+period.getMonths())*30);
        System.out.println("toplam " + i + " gün yaşamışsınız");
        return s;
    }

    private static void ay(LocalDate localDate) {
        Period period = Period.between(localDate, LocalDate.now());
        System.out.println(period.getMonths());

        int i= (period.getYears()*12)+period.getMonths();
        System.out.println("toplam "+ i + " ay yaşamışsınız");
    }

    private static void yasHesapla(LocalDate l) {

        Period period = Period.between(l, LocalDate.now());
        System.out.println("girilen tarihie göre yaşı : " + period);
    }
}
