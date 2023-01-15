package javahomework12;


public class TestMain {
    public static void main(String[] args) {
        Personel personel1= new Personel(3000);
        Personel usta1= new Personel(6000);
        Personel isci1= new Personel(4000);

        personel1.zamYapYüzdeli(20);
        System.out.println(personel1.getMaas());

        System.out.println(usta1.zamYapYüzdeli(10));
        System.out.println(usta1.getMaas());
        System.out.println("****");
        System.out.println(isci1.getMaas());
        isci1.zamYapYüzdeli(30);
        System.out.println("isci maaşı"+ isci1.getMaas());
        System.out.println("personel maaşı" + personel1.getMaas());




    }
}
