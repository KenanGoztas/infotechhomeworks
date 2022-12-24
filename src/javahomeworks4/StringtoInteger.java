package javahomeworks4;

public class StringtoInteger {

	public static void main(String[] args) {
		
		String str = "12345";
		
		int i1= Integer.parseInt(str);
		System.out.println(i1 + 5);
		
		int i2= Integer.valueOf(str);
		System.out.println(i2);

		
		
		
		int i3= 123456;
		
		String str2 = String.valueOf(i3);
		System.out.println(str2 + 5);

		
		String str3= ""+ i3;
		
		String str4= Integer.toString(i3);
		System.out.println(str4 + 6);

	
		
		
		
		
	}

}
