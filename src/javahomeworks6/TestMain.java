package javahomeworks6;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        //homework 2
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

        //Homework 1

        Computer computer1 = new Computer("asus", "intel", "windows", 16, 500, true);
        Computer computer2 = new Computer("Macbook", "m2", "macOs", 8, 200, true);
        Computer computer3 = new Computer("hp", "intel", "windows", 16, 1000, true);
        Computer computer4 = new Computer("aser", "ryzen", "linux", 4, 256, true);
        Computer computer5 = new Computer("lenovo", "athlon", "windows", 8, 512,true);

        Computer computer6 = new Computer();
        computer6.brand= "hp";
        computer6.chipsetBrand= "ryzen";
        computer6.operatingSystem= "linux";
        computer6.hardDrive= 512;
        computer6.depoda= true;

        Computer computer7 =new Computer();
        computer7.brand= "Macbook";
        computer7.chipsetBrand= "m1";
        computer7.operatingSystem= "MacOs";
        computer7.hardDrive= 512;
        computer7.depoda= true;

        Computer computer8 = new Computer();
        computer8.brand= "asus";
        computer8.chipsetBrand= "ryzen";
        computer8.operatingSystem= "windows";
        computer8.hardDrive= 1000;
        computer8.depoda= true;

        Computer computer9 = new Computer();
        computer9.brand= "hp";
        computer9.chipsetBrand= "ryzen";
        computer9.operatingSystem= "linux";
        computer9.hardDrive= 512;
        computer9.depoda= true;

        Computer computer10 = new Computer();
        computer10.brand= "sony";
        computer10.chipsetBrand= "intel";
        computer10.operatingSystem= "linux";
        computer10.hardDrive= 256;
        computer10.depoda= true;

        Computer computer11= new Computer();
        computer11.brand= input.nextLine();
        computer11.chipsetBrand= input.nextLine();
        computer11.operatingSystem= input.nextLine();
        computer11.hardDrive= input.nextInt();
        computer11.depoda= Boolean.parseBoolean(input.nextLine());


    }
}
