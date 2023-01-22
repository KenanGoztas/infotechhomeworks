package javahomework12;


import java.util.ArrayList;
import java.util.List;

public class TestMain {
    public static <List> void main(String[] args) {
        Personel personel1= new Personel(3000);
        Personel usta1= new Usta(6000);
        Personel isci1= new Isci(4000);
        personel1.zamYapYüzdeli(20);

        System.out.println(personel1.getMaas());

        System.out.println(usta1.zamYapYüzdeli(10));
        System.out.println("****");

        System.out.println(isci1.getMaas());
        isci1.zamYapYüzdeli(30);
        System.out.println("isci maaşı"+ isci1.getMaas());
        System.out.println("personel maaşı" + personel1.getMaas());

        java.util.List<Personel> personelList= new ArrayList<>();
        personelList.add(isci1);
        personelList.add(personel1);
        personelList.add(usta1);


        Muhasebe muhasebe1= new Muhasebe();
        System.out.println(muhasebe1.maasHesapla(usta1));




    }
}
