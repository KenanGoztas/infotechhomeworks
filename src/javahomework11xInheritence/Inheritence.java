package javahomework11xInheritence;

public class Inheritence extends SuperClass{
    String n1="küçük";
    public Inheritence(String s){
        super("");
        System.out.println("subclass");
    }
    public static void main(String[] args) {
/*inheritence
extends anahtar ile miras alınır
her sınıf yalnızca bir sınıfı miras alabilir
bir sınıfı birden fazla sınıf miras alabilir
super anahtarı nasıl kullanılıyor, parametreli parametresiz nasıl oluyor araştır
 */;
        SuperClass sc=new Inheritence("arguman");
        System.out.println(( (Inheritence) sc).n1);
        System.out.println(sc.n1);
        if (sc instanceof SuperClass)
            System.out.println("bu sınıftandır");

    }
}
class SuperClass{
    String n1= "büyük";
    public SuperClass(String argsup){
        super();
        System.out.println("superclass");

    }
}
