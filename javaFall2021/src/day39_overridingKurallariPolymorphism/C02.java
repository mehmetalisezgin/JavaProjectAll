package day39_overridingKurallariPolymorphism;

public class C02 extends C01{
	public static void main(String[]args) {
		
		C02 obj1 = new C02();
		obj1.privateMethod();
		obj1.staticMethod();
		
		C01 obj2 = new C02();
	//	obj2.privateMethod();
	// data type i C01 oldugundan oncelikle C01 class indaki 
// methoda bakmamiz gerekir anca private oldugundan ulasamayiz
// ulasamadigimiz bir methodu override yapamayiz
	// dilayisiyla signutura ayni olmasina ramen farkli iki method olarak gordu
		obj2.staticMethod();
// static methodlar override edilemezlern		
		
		
	}

	public static void staticMethod() {
		System.out.println("child class static method calisti");

	}

    private void privateMethod() {
    	System.out.println("child class private method calisti");
}
    /*public final void finalMethod() {
    	System.out.println("child class final method calisti");
    }*/

}
