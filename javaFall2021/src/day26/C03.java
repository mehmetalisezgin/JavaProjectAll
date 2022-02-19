package day26;

public class C03 {

	public static void main(String[] args) {
		/* Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For
		each loop
		kullanarak bulunuz. Sonucu ekrana yazdiriniz.*/
		
		int arr[] = {3,4,2,5,6};
		 
		int carpim = 1;
		
		for(int each : arr) {
			carpim*=each;
		}
		
		System.out.println("Arrayin icindeki elemanlarin carpimi :"+carpim);
				
}
}