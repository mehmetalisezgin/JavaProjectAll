package day06ifstatement;
import java.util.Scanner ;
public class ifodev {

	public ifodev() {
		
	}

	public static void main(String[] args) {
		
		/*Kullanıcıdan bir tamsayı alın eğer tamsayı 10 dan kucuk ve 0’dan büyük eşit ise ekrana
          “Rakam” yazdırın. Diğer durumlarda ekrana “Sayı” yazdırın.
		  
		 */	
		
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Please enter an integer : ");
		int a = scan.nextInt();
		System.out.println("a : " + a);
		
		if (a>=0 && a < 10) {
			System.out.println("a bir rakamdir " + a);
		}
		//if  (( a < 0 )||( a != int )) {
			//System.out.println("please write a pozitif number");
			
		
		else {
			
			System.out.println("a bir sayidir " + a);
		}
		
		
		System.out.println("Write to lengths of triangle :");
		
		double  a1 =scan.nextDouble();
		double b1 = scan.nextDouble();
		double c1 = scan.nextDouble();
		System.out.println("a1 : " + a1);
		System.out.println("b1 : " + b1);
		System.out.println("c1 : " + c1);
		
		if ((a1==b1) && (a1==c1)) {
			System.out.println("it is an equilateral triangle ");
			
		}
		if (((a1!=b1) && (b1==c1)) || (c1!=b1)&&(c1==a1||(a1==b1)&&(a1!=c1))) {
			System.out.println("it is an isoscales triangle");
			
			
		}
		else {
			System.out.println("it is a nonequaliteral triangle ");
		}
		
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
         1. 50 den az - D     2. 50(dahil) ile 60 arası - C       3. 60(dahil) ile 80 arası - B.     
         4. 80(dahil) ustu- A
		
		
		System.out.println("Enter your grade : ");
		double  grade1 =scan.nextDouble();
		
		if(grade1<0) {
			System.out.println("Please write your grade");
		}
		else if ( grade1<50){
			System.out.println("Your grade is D");
		}
		else if (grade1<60){
			System.out.println("Your grade is C");
		}	
		else if (grade1<80){
			System.out.println("Your grade is B");
	}
	
		else if (grade1<100){
			System.out.println("Your grade is A");
	
		}
		
		else {
			System.out.println("Please write your grade");
		}
		
		Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum” yazdırın.
		Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl” yazdırın.
		Eğer yıl 10’a bulunuyorsa ekrana “Onyıl” yazdırın.
		*/
		System.out.println("Please enter a year : ");
		int year = scan.nextInt(); 
		
		if (year%1000==0) {
			System.out.println("Milenum ");
		}
		
		
	}
	
	
	
	
}
