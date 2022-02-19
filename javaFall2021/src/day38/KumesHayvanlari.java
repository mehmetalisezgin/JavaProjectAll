package day38;

public class KumesHayvanlari extends Kuslar  {

	public static void main(String[] args) {
		KumesHayvanlari kms1 = new KumesHayvanlari();
		kms1.beslenme();//Tum hayvanlar beslenir
		kms1.hareket();// kumes hayvanlari yuruyerek hareket eder
		kms1.solunum();// kuslar akcigerleriyle hareket eder
		
		Kuslar kms2 = new KumesHayvanlari();
		
		kms2.beslenme();// Animals==> Tum hayvanlar beslenir
		kms2.hareket();// Kuslar ===> kumes hayvanlari yuruyerek hareket eder
		kms2.solunum(); // Kuslar ===> Kuslar akcigerleriyle nefes alir
		// kendi spesifik ozellikleri disinda kus,ara tabi oluyor
		// ama spesific bir durumu varsa farkini ortaya koyuyor
        Kuslar kms3 = new Kuslar();
		
		kms3.beslenme();// Tum hayvanlar beslenir
		kms3.hareket();// Kuslar ucarak hareket eder
		kms3.solunum();// Kuslar akcigerleriyle nefes alir
		
       KumesHayvanlari kms4 = new KumesHayvanlari();
       kms4.beslenme();
	   kms4.hareket();
	   kms4.solunum();
	}
   public void hareket() {
	System.out.println("Kumes Hayvanlari");
}
}
