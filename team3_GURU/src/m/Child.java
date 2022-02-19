package m;


public class Child extends Father {
	
	
	
	void shoot(String a) {
		super.shoot();
		System.out.println("I am the Child");
		}		

	public static void main(String[] args) {
		
		
		Father fc = new Child();
		fc.shoot();
		
       /* Child fc = new Child();
        fc.shoot();*/
	

	}

}
