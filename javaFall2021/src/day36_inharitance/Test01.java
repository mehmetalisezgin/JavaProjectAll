package day36_inharitance;




class Derived{
	public Derived(String temp) {// parametreli
		System.out.println("Derived class "+ temp);
	}
}


// hepside parametreli


public class Test01 extends Derived{
public Test01(String temp) { // parametreli 
	super(temp);
	System.out.println("Test class "+temp);
}
public static void main(String[] args) {
	Test01 obj = new Test01("Samet"); // constructor parametreli 
}	

}
