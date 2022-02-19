package day33_stringBuilder;

public class C01_Append_Length_Capacitiy {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		StringBuilder sb2 = new StringBuilder("Java Jandir") ;
		
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		
		StringBuilder sb3 = new StringBuilder(7) ;
		sb3.append("Mehlika"); //sb3 e eklenen string in length inden daha kisa bir rakam yazarsak capasity iki 
		// katindan iki fazla olarak ayarlaniyor.
		
		System.out.println(sb3.length());
		System.out.println(sb3.capacity());
		
        StringBuilder sb4 = new StringBuilder(7);
		
		System.out.println(sb4.length());  // 0
		System.out.println(sb4.capacity()); // 7
		
		sb4.append("Nilgun");
		System.out.println(sb4.length());  // 6
		System.out.println(sb4.capacity()); // 7
		
		sb4.append(" candir");
		System.out.println(sb4.length());  // 13
		System.out.println(sb4.capacity()); // 16
		
		sb.append("Java");
		System.out.println(sb); // Java
		
		sb.append(" candir");
		System.out.println(sb); // Java candir
		
		sb.append("anlasildi mi", 3, 6);
		
		System.out.println(sb); // Java candirasi
		

	}

}
