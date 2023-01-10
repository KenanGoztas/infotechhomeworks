package javahomeworks10x6Ocak;

import java.util.*;

public class ErisimxEncapsulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car car1= new Car("Honda", "Civic", 2010, "06AB24" );
        Car car2= new Car("Toyota", "Corolla", 2015, "01BC33" );
        Car car3= new Car("Volkswagen", "Touran", 2013, "34TE22" );
        Car car4= new Car("Mercedes", "Vito", 2020, "33AC99" );
        Car car5= new Car("Bmw", "320", 2018, "44UC88" );
        Car car6= new Car("Renault", "Megane", 2016, "55AV77" );
        Car car7= new Car("Volvo", "Civic", 2010, "06AB24" );
        Car car8= new Car("Audi", "A3", 2022, "04TT44" );
        Car car9= new Car("Ford", "Focus", 2014, "33DD66" );
        Car car10= new Car("Fiat", "Egea", 2010, "06AB24" );

        Set<Car> autoList=new HashSet<>();
        autoList.add(car1);
        autoList.add(car2);
        autoList.add(car3);
        autoList.add(car4);
        autoList.add(car5);
        autoList.add(car6);
        autoList.add(car7);
        autoList.add(car8);
        autoList.add(car9);
        autoList.add(car10);

//for each ile araba plakalarını yazdırdım.
        for (Car c : autoList) {
            System.out.print(c.getLicensePlate() + " ");
           System.out.println(c.toString());
        }
// nesneleri yazdırdım.
        System.out.println("\n"+ autoList);

//çalıntı araçlar plakalarını ayrı bir linkedlistte topladım.
        Set<String> stolenListPlate= new HashSet<>();
        stolenListPlate.add("06AB24");
        stolenListPlate.add("01BC33");
        stolenListPlate.add("44UC88");
//çalıntı araç plakası ekledim.
        System.out.println("çalıntı araç plakası ekleyin");
        String newPlate= input.nextLine();
        stolenListPlate.add(newPlate);

//çalıntı araçları da bir linkedlistte toplayabiliriz
        Set<Car> stolenListCars= new HashSet<>();
        stolenListCars.add(car7);
        stolenListCars.add(car8);
        stolenListCars.add(car8);
        stolenListCars.add(car9);

 //stolenCars sınıfından nesne ile çalınan arabaları ve sorumlu polisi ekledim.
 //       StolenCars stolenCars= new StolenCars(stolenListPlate, "ali");
 //       System.out.println(stolenCars.getPoliceOfficer());
  //      System.out.println("Çalınan plakalar :" + stolenCars.getStolenPlate());

//for each ile çalıntı plaka ile araç plakasını karşılaştırdım.

        System.out.println("\nÇalıntı araçlar 1");
       for (Car sc: autoList) {
           for(String str: stolenListPlate)
               if (sc.getLicensePlate().equals(str))
                   System.out.println(sc.toString());
        }

 //eklediğim çalıntı plaka hangi araca ait, kontrol ettim.
        System.out.println("\nçalıntı araç 2");
       for (Car c: autoList){
           if (c.getLicensePlate().equals(newPlate))
               System.out.println("çalıntı araç 2 : "+ c.toString());
       }

 //listeleri karşılaştırdım.

        System.out.println("\n çalıntı araç 3");
       for (Car c: autoList) {
           for (Car d : stolenListCars) {
               if (c.equals(d))
                   System.out.println("çalıtı araç 3: " +c.toString());
           }
       }


    }
}
