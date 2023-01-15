package javahomework11xInheritence;

public class Amir extends Personel{
    Amir(String isim) {
        super(isim);
    }
    int no= 2;

    @Override
    public int maasVer() {
        return 180;
    }
    public String supergetIsım(){
        int a= super.no;
        return super.getIsim();
    }
    public int numara(){
        return no;
    }

}
