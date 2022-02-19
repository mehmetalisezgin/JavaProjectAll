package day19_whileLoop_doWhileLoop;

public class C05_dowhile {

	public static void main(String[] args) {
		// while loop oince kontrol eder sonra kodu calistirir loop icinde artis yapilsa da bir sonraki kontrole ladar
		// kod calismaya devam eder bu da bazi durumlarda hatali nsonuclara sebep olabilir

		// do while loop ise once islemi yapr sopnra sarti kontrol eder...
		int a=0;
        do {
            System.out.println(a + " ");
            a++;
        }while(a<5);
		
	}

}
