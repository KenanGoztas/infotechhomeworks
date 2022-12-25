package javahomeworks6;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class TestMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Araba araba1 = new Araba("Honda", 6767, 2010, "2,0", "otomatik", "benzin");
        System.out.println(araba1.name);
        System.out.println(araba1.id);

        Araba araba2 = new Araba();
        araba2.name = "Mazda";
        araba2.model = 2015;
        araba2.yakit = "dizel";
        System.out.println(araba2.name + araba2.model + araba2.yakit);

        System.out.println("******");

        Computer computer1 = new Computer("asus", "intel", "windows", 16, 500, true);
        Computer computer2 = new Computer("Macbook", "m2", "macOs", 8, 200, true);
        Computer computer3 = new Computer("hp", "intel", "windows", 16, 1000, true);
        Computer computer4 = new Computer("aser", "ryzen", "linux", 4, 256, true);
        Computer computer5 = new Computer("lenovo", "athlon", "windows", 8, 512,true);

        Computer computer6 = new Computer();
        Computer computer7 =new Computer();
        Computer computer8 = new Computer();
        Computer computer9 = new Computer();
        Computer computer10 = new Computer();

        computer1.marke = input.nextLine();

        System.out.println(computer1.marke);


    }
}
