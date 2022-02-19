package day28;

public class Demo {
	
	int x = 3 ; 
	int y = 5 ;
	
	Demo(){
		x+=1 ;
		System.out.println("-x"+x);
	}
	Demo(int i){
	 this();
	 this.y = i ; 
	 x+=y ;
		System.out.println("-x"+x);
	}
	Demo(int i , int i2){
		this(3);
		this.x-=4 ;
		System.out.println("-x"+x);
	}
	
	public static void main(String[]args) {
		
		Demo demo = new Demo(4,3);
		
	// Constructor calismaya basladiktan sonra x ve y ile ilgili
		// degismeler (x ve y instance variable oldugundan)  sadece c01 objesini ilgilendirir
		// constructor in isi bittiginde instance degerler ilk halini alir...
		
		
		
		System.out.println("demo icin x : "+ demo.x + ", demo icin y degeri "+ demo.y);
		
		
		
		
	}
	
	
	
	

}
