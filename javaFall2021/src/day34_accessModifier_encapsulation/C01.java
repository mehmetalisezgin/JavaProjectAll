package day34_accessModifier_encapsulation;

public class C01 {
	
	
	
	private int sayiPrivate = 10 ; // Private class uyelerine(variable olabilir method olabilir) sadece icinde bulundugu classdan ulasabilirz
	int sayiDefault = 20 ;// Access Modifier i default.Default class uyelerine sadece icinde bulunan package lardan ulasilabilir
	protected int sayiProtected = 30 ;// Protected class uyelerine icinde bulundug package deki tum classlar ve baska package 
	//lardaki child class lar ulasabilir
	public int sayiPublic = 40 ;
	// public class uyelerine butun classlardan ulasilabiliriz
	
	
// static olmadigi icin main methodundan direk ulasamayiz
	// ancak obje olusturursak ulasabiliriz
	
	public static void main(String[] args) {
		
	C01 obj = new C01();
	System.out.println(obj.sayiPrivate);
	System.out.println(obj.sayiDefault);
	System.out.println(obj.sayiProtected);
	System.out.println(obj.sayiPublic);
	

	}
	public void staticOlmayanMethod() {
		C01 obj=new C01();
		System.out.println(obj.sayiPrivate);
		System.out.println(obj.sayiDefault);
		System.out.println(obj.sayiProtected);
		System.out.println(obj.sayiPublic);
		
		
		
		
	}
	
	
	
	
	
	
	

}
