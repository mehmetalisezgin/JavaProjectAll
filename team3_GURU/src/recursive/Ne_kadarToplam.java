package recursive;

public class Ne_kadarToplam {

	public static void main(String[] args) {
		int ustLimit = 0 ;
				
		// [5 ~ 10]

		System.out.println(topla(ustLimit));

	}

	private static int topla(int a) {
		if (a < 0) { 
		return a +topla(a+1);}
		if(a>0) {
		return a + topla(a - 1);}
		if(a==0) {
			return 0;}
		return a;
	}

}
