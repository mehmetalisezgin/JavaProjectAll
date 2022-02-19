package day11;

public class C02_equalsIgnoreCase {

	public static void main(String[] args) {
		String str1 = "ali"	;
		String str2 = "can"	;
		String str3 = "Ali Can"	;	
		String str4 = str1 + " " + str2	;	
		System.out.println(str4);// ali can
		System.out.println(str3==str4);//false 
		System.out.println(str3.equals(str4));//false
		
		System.out.println(str3.equalsIgnoreCase(str4));
		
		System.out.println(str1.length());
		String isim="";
		String isim1 = null ;
		System.out.println(isim1.length());
		
		
		
		
		
		
		
		

	}

}
