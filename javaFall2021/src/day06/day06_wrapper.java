package day06;

public class day06_wrapper {

	public static void main(String[] args) {
		int num1 = 10;
		Integer num2 = 20;
		
		// num1 yazildiginda hic bir metod cikmaz cunku int bir primitive dir.
		// num2 yazildiginda ise bir cok metod geliuyor cunku num2 Integer dir yani wrapper dir.
		
		String tel1 = "31235";
		String tel2 = "3273454";
		System.out.println(tel1+tel2);
		
		// bu sayilari toplamak istersek
		
		System.out.println(Integer.valueOf(tel1)+Integer.valueOf(tel2));
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		String caddeno="203";
		String sokakno="1564";
		System.out.println(Integer.valueOf(caddeno)+Integer.valueOf(sokakno));
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
