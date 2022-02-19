package day32_varargds_stringBuilder;

public class C03_varargs {

	public static void main(String[] args) {
		kafanagoretopla(5,8,10,13); 
		
		
	}

	private static void kafanagoretopla(int add1,int... add) {
		int toplam = 0;
		
		for(int each:add) {
			toplam+=each ;
		}
		
		System.out.println(add1);
		System.out.println(toplam);
	}

}
