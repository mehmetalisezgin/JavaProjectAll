package javaProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
@SuppressWarnings("unchecked")
public static void main(String[]args) {
	Scanner scan = new Scanner(System.in);
	
	String islem;
	Registration userReg = new Registration();
	
	ArrayList<User>register = null;
	boolean cikilsinmi =false;
	while(!cikilsinmi) {
		System.out.println("Lutfen\nKisi eklemek icin --->1\nKisi listelemek icin --->2\nSansli kisi icin --->3"
				+ "\nCikis icin --->4");
		
		islem = scan.next();
		switch(islem) {
		case "1" :
			register = (ArrayList<User>)userReg.register();
		break;
		case "2" :
			userReg.listele(register);
		break;
		case "3" :
			userReg.printHappyUsers(register);
		break;
		case "4" :
			cikilsinmi  = true;
		break;
		default :
			System.out.println("hatali veri girdiniz");
		break;
		
		}
		
		
	}
	
}
}
