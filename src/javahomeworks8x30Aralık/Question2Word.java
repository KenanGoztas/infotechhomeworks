package javahomeworks8x30Aralık;

import java.util.*;

public class Question2Word {
    public static void main(String[] args) {
//        1)Elemanlari A, C, E, ve F olan bir String ArrayList olusturup ekrana yazdiriniz.
        List <String> arr1= new ArrayList<>() ;//soru: elemanları arrayliste en başta topluca (array gibi) ekleme, tanımlama imkanı var mı?
        arr1.add("A");
        arr1.add("C");
        arr1.add("E");
        arr1.add("F");

        System.out.println(arr1);

        // 2)indexsiz add() methodunu kullanarak, B’yi ekleyiniz.
//        index’li add() methodunu kullanarak, L’yi 1 numarali index’e ekleyiniz.
//        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, E, F, B.
        arr1.add("B");
        arr1.add(1,"L");
        System.out.println(arr1);
//        3)set() methodu kullanarak, E’yi D yapiniz.
//          ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, F, B.
        arr1.set(3, "D");
        System.out.println(arr1);

//        4)remove() methodu kullanarak, F’yi siliniz.
//        ArrayList’i ekrana yazdiriniz, list goyle olmali; A, L, C, D, B.
        arr1.remove("F");
        System.out.println(arr1);
//        5)sort() methodu kullanarak, elemanlari alfabetik siraya diziniz.
//                ArrayList’i ekrana yazdiriniz, list goyle olmali; A, B, C, D, L.
        Collections.sort(arr1);
        System.out.println(arr1);

//        6)contains() methodu kullanarak, L’nin list’de var oldugunu ve M’nin list’de var
//        olmadigini dogrulayiniz.
        if (arr1.contains("L"))
            System.out.println("L listede var");
        if (!arr1.contains("M"))
            System.out.println("M listede değil");
//        7)size() methodu kullanarak, list’in kag eleman oldugunu ekrana yazdiriniz.
        System.out.println(arr1.size());
//        8)clear() methodu kullanarak, list’deki tum elemanlari siliniz.
        arr1.clear();
//        9)isEmpty() methodu kullanarak, list’deki tum elemanlarin silindigini dogrulayiniz
        System.out.println(arr1.isEmpty());
    }
}
