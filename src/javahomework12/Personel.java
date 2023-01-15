package javahomework12;

public class Personel {
   private int maas;
  private static int zam=0;
    public Personel(int maas){
        this.maas=maas;
    }

    public int getMaas() {
        maas=maas+zam;
        return maas;
    }
    int zamYapYüzdeli(int zam){
        maas= maas+ (maas*zam/100);
        return maas;
    }
    static void zamYapGenel(int zam){
         Personel.zam=zam;

    }
    static void zamYapGenelYuzdeli(int zam){
        Personel.zam=zam;


    }

}
