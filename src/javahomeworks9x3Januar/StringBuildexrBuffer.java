package javahomeworks9x3Januar;

public class StringBuildexrBuffer {
    public static void main(String[] args) {
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder("kenan");
        StringBuilder sb3= new StringBuilder(5);
        System.out.println(sb3.capacity());
        sb3= new StringBuilder("kenan");
        sb3.append(sb3);
        System.out.println(sb3);
        System.out.println(sb2.equals(sb3));
        System.out.println(sb2.toString().equals(sb3.toString()));

        System.out.println(sb2.indexOf("n")); //verilen kelimenin ilk indeksini dönüyor
        System.out.println(sb2.indexOf("n",3)); //verilen sayıdan sonraki bulunan yeri buluyor.
        sb2.append("kozan");
        System.out.println(sb2.insert(2,"z")); //araya ekle
        System.out.println(sb2.insert(4, "isim", 0,1));

        System.out.println(sb2.replace(2,4,"ceren")); //değiştir
        System.out.println(sb2.reverse());//ters yaztır
        System.out.println(sb2.reverse());
        sb2.setCharAt(0, 'i');
        System.out.println(sb2);

        System.out.println(sb2.subSequence(2,4));
        String st=sb2.toString();
        String str= String.valueOf(sb2);
        System.out.println(str);
        StringBuilder sb4= new StringBuilder(str);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
        sb2.trimToSize();
        sb2=sb3;
        System.out.println(sb2.compareTo(sb3));
        System.out.println(sb2==sb3);






    }
}
