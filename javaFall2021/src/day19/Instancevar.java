package day19;

public class Instancevar {
// instance variable class in icinde main in disinda olsuturulur
	
	int notMat = 50;
	int notFen ;
	int notEng = 75 ;
// instance variable larin scope inda main method yoktur
// main methodun icinden calss icindeki variable lara ulasmak icin obje olusturup obkje uzerinden erisim saglanir...

	public static void main(String[] args) {
// System.out.println(notMat);	yazdirmaz main method static oldugu icin static olmayan variable lar main method da direk kullanilamaz..
		
// main methodun disinda da method olabilir static olmak zorunda degil...
		
// scanner scan ... bir obje olusturma dir. // new anahtar kelime
// icinde oldugumuz class dan bir obje olsuturalim
		Instancevar celil = new Instancevar(); 
		System.out.println(celil.notMat);
		Instancevar nihal = new Instancevar();
		nihal.notMat = 70 ; 
		celil.notMat = 70;
		System.out.println(nihal.notMat + " and " + celil.notMat);
	// instance variable lara deger atamassak java instance a atanan degeri gorur alir.
		// ama istersek farkli bir deger atayabiliriz...bu durumda yeni aranan obkje icin yeni deger gecerli olur...
		
		
		//method2();
		
		celil.method2();
	
		// method2 static olmadigi icin main method dan direk cagiralamaz
	}
	
	public static void staticMethod() {
		
		
		
		
		
	}
	public void method2() {
		
	System.out.println("method2 deki noteFen : "+ notFen);	
		
	notFen = 100;	
	System.out.println("method2 deki duzeltilmis  noteFen : "+ notFen);		
		
	}

}
