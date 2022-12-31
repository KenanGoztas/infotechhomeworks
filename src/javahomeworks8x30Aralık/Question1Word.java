package javahomeworks8x30Aralık;


//        Soru1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana yazdiran bir
//        method yaziniz.
//        { {1,2,3}, {4,5,6} }
//        Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini ekrana
//        yazdiran bir program yaziniz.
//        { {1,2,3}, {4,5}, {6} }
//        Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip elemanlarin
//        toplamini ekrana yazdiran bir program yaziniz.
//        arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
//        Soru4) Asagidaki multidimensional array’in ic array’lerindeki tum elemanlarin toplamini birer
//        birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’I ekrana yazdiran bir
//        program yaziniz.
//        Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=64+5=96+7=13==>output:{6,9,13}
//        Soru5)Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.

import java.util.Arrays;
import java.util.Scanner;

public class Question1Word {
    public static void main(String[] args) {
        //      Soru1 ) Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana yazdiran bir
//        method yaziniz.
//        { {1,2,3}, {4,5,6} }
        System.out.println("soru 1");
        int[][] multiArray1 = {{1, 2, 3}, {4, 5, 6}};
        int number1 = 1;
        for (int i = 0; i < multiArray1.length; i++) {
            for (int j = 0; j < multiArray1[i].length; j++) {
                System.out.println(multiArray1[i][j]); //elemanları yazdırdırm
                number1 *= multiArray1[i][j]; //elemanaları her döngüde çarptım
                System.out.println(number1); //her çarpım işlemini tek tek yazdırdım
            }
        }
        System.out.println(number1); //sonuç


//        Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini ekrana
//        yazdiran bir program yaziniz.
//        { {1,2,3}, {4,5}, {6} }
        System.out.println("soru 2");
        int[][] multiArray2 = {{1, 2, 3}, {4, 5}, {6}};
        int number2 = 1;
        for (int i = 0; i < multiArray2.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(multiArray2[i][multiArray2[i].length - 1]); //elemanları yazdırdırm
                number2 *= multiArray2[i][multiArray2[i].length - 1]; //elemanaları her döngüde çarptım
                System.out.println(number2); //her çarpım işlemini tek tek yazdırdım
            }
        }
        System.out.println(number2); //sonuç

//        Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip elemanlarin
//        toplamini ekrana yazdiran bir program yaziniz.
//        arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
        System.out.println("soru 3");

        int[][] arr1 = {{1, 2}, {3, 4, 5}, {6}};
        int[][] arr2 = {{7, 8, 9}, {10, 11}, {12}};
        int number3 = 0;
        for (int i = 0; (i < arr1.length) && (i < arr2.length); i++) {
            for (int j = 0; (j < arr1[i].length) && (j < arr2[i].length); j++) {
                System.out.println(arr1[i][j] + arr2[i][j]); //aynı indexdeki elemanların toplamını yazdırdım
                number3 += arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(number3); //sonuç


//        Soru4) Asagidaki multidimensional array’in ic array’lerindeki tum elemanlarin toplamini birer
//        birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’I ekrana yazdiran bir
//        program yaziniz.
//        Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=6  4+5=9  6+7=13==>output:{6,9,13}
        System.out.println("4. soru");
        int[][] arr4 = {{1,2,3},{4,5},{6,7}};
        int []toplam = new int[arr4.length];

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                toplam[i]+= arr4[i][j];
            }
        }
        System.out.println(Arrays.toString(toplam));

        for (int i = 0; i < toplam.length; i++) {
            System.out.print(toplam[i]+ " ");
            System.out.println();
        }

//        Soru5)Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.
        System.out.println("soru 5");
        System.out.println("bir cümle giriniz");
        Scanner input = new Scanner(System.in);
        String[] kelimeArrayi=input.nextLine().split( " ");
        System.out.println(kelimeArrayi.length);

    }
}
