package javahomework11xInheritence;

public class TestMain {
    public static void main(String[] args) {

        Personel memur1 = new Memur("ali");
        Personel isci1 = new Isci("veli");
        Personel amir1 = new Amir("ahmet");

        System.out.println(memur1.getIsim());
        Muhasebe muhasebeci = new Muhasebe();
        muhasebeci.maasHesapla(memur1);
        amir1.maasVer();

        System.out.println(amir1.no);

        System.out.println(((Amir) amir1).numara());

        Amir amir2 = new Amir("kenan");
        amir2.numara();
        System.out.println("******");
        Personel personel1 = new Personel(" personel");
        Memur memur2 = new Memur("memur");
        Personel memur3 = new Memur("memur3");
        System.out.println(personel1.isim);
        System.out.println(memur2.isim);
        System.out.println(memur3.isim);

//        Personel personel2 = Personel.nesne();
//        personel2.maasVer();
//        Amir amir3= (Amir) Personel.nesne();
//        amir3.supergetIsım();

        muhasebeci.maasHesapla(memur2);
        muhasebeci.maasHesapla(amir2);
        Personel []personels= {amir2,memur2};
        muhasebeci.maasHesapla(new Memur("k"));
        muhasebeci.maasHesapla(new Amir("a"));
        Personel p=amir1;


    }
}
