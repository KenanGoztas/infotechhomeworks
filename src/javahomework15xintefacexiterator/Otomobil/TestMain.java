package javahomework15xintefacexiterator.Otomobil;

public class TestMain {
    public static void main(String[] args) {
        OtomobilOlustur oto1= new OtomobilOlustur();
        oto1.elektrikMotor();
        oto1.otoSanziman();

        OtomobilOlustur oto2 =new OtomobilOlustur();
        oto2.motor();
        oto2.duzSanziman();
        System.out.println(oto1.sasiNo());
        System.out.println(oto2.sasiNo());

    }
}
