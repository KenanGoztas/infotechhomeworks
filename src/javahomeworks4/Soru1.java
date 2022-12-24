package javahomeworks4;

public class Soru1 {

	public static void main(String[] args) {
        /*
         * Soru 1) String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ”  string
        ifadesini “Java ogrenmek cok guzel.” sekline getirin
         */
		
        String str1 = " Java ogrenmek123 Cok guzel@ ";
        String str2= str1.replaceAll("\\d", ""); //regex ile rakamları çıkardım.
        System.out.println(str2);
        String str3= str2.trim();//trim ile baş ve sondaki boşlukları çıkardım.
        System.out.println(str3);
        //String str4= str3.substring(0, str3.length()-1);//substring ile son harfe kadar olan kısmı aldım
        String str4 = str3.replace("@", ".");
        String str5= str4.replace("C", "c");
        System.out.println(str5);

    }
}
