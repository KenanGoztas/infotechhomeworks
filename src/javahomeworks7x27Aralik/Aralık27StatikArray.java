package javahomeworks7x27Aralik;

import java.util.Arrays;

public class Aralık27StatikArray {
    public static void main(String[] args) {
        int[] a;
        a= new int[5];
        String[] isimler= {"kenan", "zeynep"};
        String [] isim=isimler;
        if (isim==isimler)
            System.out.println("eşit");
        String s= "benim adım kenan";
        String []sarray= s.split(" ");//stringi arraya alma
        System.out.println(Arrays.toString(sarray));//arrayı yazdırma

        int [] array2= {1,4,3,6,8,5};
        Arrays.sort(array2);
        Arrays.binarySearch(array2, 1);
//binarySearch elemanın var olup olmadığını sorar, ama önce sort yapılmalı







    }
}
