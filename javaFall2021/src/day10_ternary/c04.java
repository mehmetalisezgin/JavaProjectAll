package day10_ternary;

public class c04 {

	public static void main(String[] args) {
		int gunNo= 1;
		
		switch(gunNo) {
		case 0: 
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3 :
			System.out.println("carsamba");
			break;
		case 4 :
			System.out.println("persembe");
			break;
		case 5 :
			System.out.println("cuma");
			break;
		case 6 :
			System.out.println("c.tesi");
			break;
		case 7 :
			System.out.println("pazar");
			break;
			default:
				System.out.println("lutfen gecerli bir gun numarasi yaziniz");
		}

	}

}
