package javahomeworks6;

public class Computer {

    //  E-ticaret sitelerini inceleyiniz. Bir urunun(objenin) ne gibi ozellikleri oldugunabakiniz.
    //  Bir tane class olusturarak bu ozellikleri kullanan 15 tane urun hazirlayiniz.
    //     (5 tanesi kullanicidan veri alinarak , 5 tanesi parametreliconstructor kullanilarak,
    //     5 tanesi bos constructor kullanilarak olmali)
   // https://www.mediamarkt.de/de/category/pcs-365.html
   public Computer(){

   }

    public Computer(String marke, String prozessorModell, String betriebSystem, int arbeitsspeicher, int speicherkapazität, boolean depoda) {
        marke = marke;
        this.prozessorModell = prozessorModell;
        this.betriebSystem = betriebSystem;
        this.arbeitsspeicher = arbeitsspeicher;
        this.speicherkapazität = speicherkapazität;
        this.depoda = depoda;
    }

    String marke; //apple, aser, msi, lenovo, hp
    String prozessorModell; //intel, ryzen, athlon
    String betriebSystem; //windows, macos, linux
    int arbeitsspeicher; //ram
    int speicherkapazität; //hafıza
    boolean depoda;








}
