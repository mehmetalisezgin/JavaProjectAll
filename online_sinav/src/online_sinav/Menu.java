package online_sinav;

import java.util.Scanner;

public class Menu {
	
		
	public static void main(String[] args) {

	//Menu obj1 = new Menu();
	//obj1.menu();
		menu();	
		bitis();
	}
	
		
	public static String menu(){	
		System.out.println("<<<<<<Online Java Quiz>>>>>>");	
		System.out.println("Lutfen tercihinizi yapiniz\n1-Level A\n2-Level B\n3-Level C");
		
		Scanner scan = new Scanner(System.in) ;// tercih secenegi icin int tercih olusturduk
		int tercih ;	
	    
		int count = 0;
		
		
			tercih = scan.nextInt() ;
			switch (tercih) {
			case 1:
				do {
				Level_A.level_A();
				}while(count<6);
				System.out.println("Iyi Sanslar");
				break ;
			case 2 :
				
					Level_B.level_B();
					
				
			    break ; 
			case 3 :
				
				break ;
			case 4:
			System.out.println("bizi tercih ettiginiz icin tesekkurler");	
				
				break;
			default:
				
			}
			return Menu.bitis();
			
	}
	
	static String bitis(){
		System.out.println("Sinava Girdiginiz icin Tesekkurler");
		return null;
	}


	
	
	
}
