package javahomeworks6;

public class Mainmain {
    public static void main(String[] args) {
        Hayvan kedi = new Hayvan();
        kedi.agırlık= 2;
        kedi.isim= "lilly";
        kedi.ayak= 4;
        kedi.kanatlımı= false;

        System.out.println(kedi.isim);

        kedi.yemekye();
        kedi.avlan();


        kedi.isimVer("tekir", 3);

        System.out.println(kedi.isim);

        System.out.println(kedi.agırlık);

        Hayvan köpek = new Hayvan();
        köpek.isim= "karabaş";



        Hayvan.sayi= 10;


        System.out.println(Hayvan.sayi);

        System.out.println(kedi.sayi);
        System.out.println(köpek.sayi);

        System.out.println(kedi.isim);
        System.out.println(köpek.isim);



    }
}
