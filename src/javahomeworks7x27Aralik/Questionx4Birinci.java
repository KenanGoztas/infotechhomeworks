package javahomeworks7x27Aralik;

import java.util.Arrays;
import java.util.Scanner;

public class Questionx4Birinci {
    public static void main(String[] args) {
        Questionx4Ikinci a= new Questionx4Ikinci();
        a.number();
        System.out.println(Arrays.toString(a.number()));
        System.out.println("bir alışveriş sitesinden5 adet ürünü ücretsiz satın alabilme hakkı kazandınız!!");
        System.out.println("lütfen ürünleri seçiniz!");
        Scanner input = new Scanner(System.in);
//        String ürün1 = input.nextLine();
//        String ürün2 = input.nextLine();
//        String ürün3 = input.nextLine();
//        String ürün4 = input.nextLine();
//        String ürün5 = input.nextLine();
//
        Questionx4Ikinci product1 = new Questionx4Ikinci();

        String[] sürpriz = product1.hediye(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());

        System.out.println(sürpriz[0]);
        System.out.println(sürpriz[1]);
        System.out.println(sürpriz[2]);
        System.out.println(sürpriz[3]);
        System.out.println(sürpriz[4]);

        System.out.println(Arrays.toString(sürpriz));
        Arrays.sort(sürpriz);
        System.out.println(Arrays.toString(sürpriz));
        sürpriz[3]= "televizyon";//üçüncü indeks 4. sıradaki elemanı verir.
        if (Arrays.binarySearch(sürpriz, "televizyon") == 3) {
            System.out.println("[binarySearch] değişiklik yaptığınız ürün listeye eklenmiştir.");
        }
        if (sürpriz[3] == "televizyon")
            System.out.println("[eşit eşittir]değişiklik yaptığınız ürün listeye eklenmiştir.");
        if (sürpriz[3].equals("televizyon"))
            System.out.println("[equals]değişiklik yaptığınız ürün listeye eklenmiştir.");




//        Questionx4Ikinci hed1 = new Questionx4Ikinci();
//        hed1.hediye(hed1.ürün);
//        String[] hed2 = hed1.hediye(hed1.ürün);
//        System.out.println(Arrays.toString(hed1.hediye(hed1.ürün)));
//        System.out.println(hed1.hediye(hed1.ürün)[0]);
//        System.out.println(hed2[1]);
//        Arrays.sort(hed1.hediye(hed1.ürün));
//        System.out.println(hed1.hediye(hed1.ürün)[0]);
//        Arrays.sort(hed2);
//        hed2[3] = "televizyon";
//        //Arrays.sort(hed2);
//        if (Arrays.binarySearch(hed2, "televizyon") == 3) {
//            System.out.println("[binarySearh] değişiklik yaptığınız ürün listeye eklenmiştir.");
//        }
//        if (hed2[3] == "televizyon")
//            System.out.println("[eşit eşittir]değişiklik yaptığınız ürün listeye eklenmiştir.");
//        if (hed2[3].equals("televizyon"))
//            System.out.println("[equals]değişiklik yaptığınız ürün listeye eklenmiştir.");


    }
}
