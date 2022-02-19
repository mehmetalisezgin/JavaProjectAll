package day32_varargds_stringBuilder;

public class C02_varargs {

	public static void main(String[] args) {
		add(5,8,10,13,15,25); 
	
	
	}

	private static void add(int... add) {
		int toplam = 0;
		
		for(int each:add) {
			toplam+=each ;
		}
		
		System.out.println(toplam);
		
		
		
		
		
	}

	

}
