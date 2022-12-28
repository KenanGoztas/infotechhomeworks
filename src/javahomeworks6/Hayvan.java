package javahomeworks6;

public class Hayvan {

    public Hayvan() {
    }

    public Hayvan(int ayak, int agırlık, String isim, boolean kanatlımı) {
        this.ayak = ayak;
        this.agırlık = agırlık;
        this.isim = isim;
        this.kanatlımı = kanatlımı;

    }

    int ayak;
    int agırlık;
    String isim;
    boolean kanatlımı;
    static int sayi=5;



    public void yemekye(){
        System.out.println("yemek yiyor.");
    }
    public void avlan(){
        System.out.println("avlanıyor");
    }

    public void isimVer (String isim, int agırlık){
        this.isim = isim;
        this.agırlık= agırlık;
    }

   // public Hayvan ()

}
