package javahomework15xintefacexiterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestMain5 {
    public static void main(String[] args) {
        List<String> listNames = new LinkedList<>();
        listNames.add("Ali");
        listNames.add("Veli");
        listNames.add("Can");
        listNames.add("Ayse");
        System.out.println(listNames);
        //foreach loop ile yaptım
        System.out.println("bir isim giriniz");
        Scanner input = new Scanner(System.in);
        String isim = input.nextLine();
        int i=0;
        for (String s : listNames) {
            if (s.equals(isim)) {
                i++;
                listNames.remove(s);
                System.out.println("Bu isim LinkedList'de vardi ve silindi");
                break;
            }
        }
        if (i==0)
            System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
        System.out.println(listNames);

//iterator ile yaptım
        System.out.println("bir isim daha giriniz!!");
        String isim2=input.nextLine();
        i=0;
        Iterator<String> stringIterator=listNames.iterator();
        while (stringIterator.hasNext()){
            if (stringIterator.next().equals(isim2)) {
                i++;
                listNames.remove(stringIterator.next());
                System.out.println("Bu isim LinkedList'de vardi ve silindi");
            }
        }
        if (i==0)
            System.out.println("Bu isim LinkedList'de yok bu yuzden silinemedi");
        System.out.println(listNames);


    }
}
