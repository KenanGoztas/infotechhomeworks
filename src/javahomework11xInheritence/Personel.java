package javahomework11xInheritence;

import java.util.function.Predicate;

public class Personel extends Insan {
    String isim = "İNSAN";
    int no = 1;
    Personel(){
        super();
    }
    Personel(String isim){
        super();
        this.isim=isim;
    }

    public int maasVer(){
        return 0;
    }
    public String getIsim(){
        return isim;
    }
    public static Personel nesne(){
        Personel nesne = null;
        return nesne;
    }

}
