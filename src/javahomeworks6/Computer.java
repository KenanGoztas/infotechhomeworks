package javahomeworks6;

public class Computer {

    // 1 E-ticaret sitelerini inceleyiniz. Bir urunun(objenin) ne gibi ozellikleri oldugunabakiniz.
    //  Bir tane class olusturarak bu ozellikleri kullanan 15 tane urun hazirlayiniz.
    //     (5 tanesi kullanicidan veri alinarak , 5 tanesi parametreliconstructor kullanilarak,
    //     5 tanesi bos constructor kullanilarak olmali)
    // https://www.mediamarkt.de/de/category/pcs-365.html
    public Computer() {

    }

    public Computer(String brand, String chipsetBrand, String operatingSystem, int ram, int hardDrive, boolean depoda) {
        this.brand = brand;
        this.chipsetBrand = chipsetBrand;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.depoda = depoda;
    }

    String brand; //apple, aser, msi, lenovo, hp
    String chipsetBrand; //intel, ryzen, athlon
    String operatingSystem; //windows, macos, linux
    int ram; //ram
    int hardDrive; //hafıza
    boolean depoda;


}
