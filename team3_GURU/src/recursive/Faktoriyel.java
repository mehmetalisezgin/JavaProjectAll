package recursive;

public class Faktoriyel {

	public static void main(String[] args) {
		int sayi = 5;

		System.out.println(faktoriyel(sayi));

	}

	

	
	// ozyinelemeli metodlar ===Recursive Mothods

	private static int faktoriyel(int sayi) {

		if (sayi == 0)  return 1 ;
		if (sayi < 0)	{
			System.out.println("Negatif sayilarin factorial i olmaz");
			
		}else {
			
		return sayi * faktoriyel(sayi - 1);
	}
		return sayi;
	}
}
