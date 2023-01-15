package javahomework11xInheritence;

public class Memur extends Personel{

    static String isim = "İNSAN";
    int no = 1;
    Memur(String isim) {
       this.isim= isim;
    }

    @Override
    public int maasVer() {
        return 140;
    }
}
