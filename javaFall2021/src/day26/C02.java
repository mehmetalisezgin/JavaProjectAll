package day26;

public class C02 {

	public static void main(String[] args) {
		/*iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For
		each loop
		kullanarak bulunuz. Sonucu ekrana yazdiriniz.
		Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz */
		
		
		
		
		String arr1[] = {"A","B","C","D","A"};
		
		String arr2[] = {"A","R","C","O","K","D"};
		
		
		int flag = 0;
		for (String each1 : arr1) {
			for(String each2: arr2) {
				if(each1.equals(each2)) {
					System.out.print(each1 + " ");
					flag++;
				}
			}
			
		}
		
		
		

	}

}
