package javahomeworks8x30Aralık;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Aralık30xCokBoyutluDizi {
    public static void main(String[] args) {


        int[][] multiArray1 = new int[2][2];
        int[][] multiArray2 = {{2, 5, 4, 8}, {6, 8, 4, 6}};
        List<String> cities = new ArrayList<>();
        List<String> cities2= new ArrayList<>();

        cities.add("Adana");
        cities.add("Ankara");

        cities2.add("Konya");
        cities2.add("Kayseri");
        System.out.println(cities);
        System.out.println(cities2);
        cities.add(1,"İstanbul");
        System.out.println(cities);
        cities.addAll(cities2);
        System.out.println(cities);
        cities.remove(1);
        cities.remove("Ankara");
        System.out.println(cities);

        List<Integer> list1= new ArrayList<>();
        list1.add(2);
        list1.add(5);
        list1.add(7);
        list1.add(8);
        list1.add(3);
        list1.add(6);
        list1.add(1);

        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);
        System.out.println(list1.remove(0)); //silinen elemanı yazdırıyor..

        System.out.println(list1);

        System.out.println(list1.size());
//        list1.removeAll(list1); //listeyi boşaltıyor ama yavaş
//        list1.clear();  //listeyi boşaltıyor ve hızlı

        System.out.println(list1);
        System.out.println(list1.size());
        System.out.println(list1.contains(3)); //elemanın olup olmadığını soruyor
        list1.add(0,9); //indexi gösterirsek o indexe atıyor
        System.out.println(list1);
        list1.set(0,4); //ilgili indexdeki elemanı değiştir
        System.out.println(list1);
        list1.get(0); //index üzerinden erişim
        System.out.println(list1.get(0));

        System.out.println(list1.equals(cities)); //içeriğini karşılaştır
        Collections.sort(list1);
        System.out.println(list1);
        //forEach
        for (int i: list1) {
            System.out.print(i+ "\t");
        }

        List<Object> list2=new ArrayList<>();
        list2.add(2);
        list2.add("kenan");
        System.out.println(list2);








    }
}
