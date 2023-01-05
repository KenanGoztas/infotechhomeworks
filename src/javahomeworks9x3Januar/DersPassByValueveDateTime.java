package javahomeworks9x3Januar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DersPassByValueveDateTime {
    public static void main(String[] args) {
        int i1 =100;
        int[] arr1= {4,5,6};
        System.out.println(arr1);
        System.out.println(valueMethod(i1));
        System.out.println(i1);
        List<Integer> arrayL =new ArrayList<>();
        arrayL.add(2);
        arrayL.add(5);
        arrayL.add(8);
        System.out.println(arrayL);
        for (int i:arrayL) {
            i++;
            System.out.println(i);
        }
        System.out.println(arrayL);
        System.out.println(arrListMethod(arrayL));
        System.out.println(arrayL);

        String str= "kenan";
        System.out.println(str.hashCode());
        str= "zeynep";
        System.out.println(str.hashCode());
        String s2="zeynep";
        System.out.println(s2.hashCode());

        //DATE
        LocalDate date1= LocalDate.now();
        System.out.println(date1);
        System.out.println(date1.plusDays(2));
        System.out.println(date1.plusWeeks(1));
        System.out.println(date1.plusMonths(3));
        System.out.println(date1.minusDays(1));
        System.out.println(date1.getEra());
        System.out.println(date1.getDayOfMonth());

        long l1= System.currentTimeMillis();
        System.out.println("ilk zaman"+ l1);

        LocalDate date2 = LocalDate.of(2023,01,01);
        System.out.println(date1.isBefore(date2));

        LocalTime localTime1= LocalTime.now();

        String zaman= (localTime1.toString());
        System.out.println(localTime1);
        System.out.println(localTime1.plusHours(2));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println("\nPeriod");
        Period period= Period.between(date1, date2);
        System.out.println(period.getYears());



        System.out.println("\nDate sınıfı");
        Date date3= new Date();
        System.out.println(date1);
        System.out.println(date1);


        long l2= System.currentTimeMillis();
        System.out.println(l2);
        System.out.println("fark");
        System.out.println(l2-l1);


    }

    static int valueMethod(int i) {
        i=5;
        return i;
    }
    static List<Integer> arrListMethod(List <Integer> a){
        a.add(0,7);
        return  a;
    }
}
