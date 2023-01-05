package javahomeworks9x3Januar;

import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        add("",3,4,5,6);
//argümanlar array gibi davranıyor

    }
    static void add(String s, int... number){
        s= "bulunan sonuç ";
        int i=0;
        for (int n:number) {
            i+=n;
        }
        System.out.println(s+ i);
        System.out.println(number[0]);
        System.out.println(number.length);
        System.out.println(Arrays.toString(number));

    }
}
