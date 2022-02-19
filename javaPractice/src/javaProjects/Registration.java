package javaProjects;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {
	
	ArrayList<User>kullanicilar = new ArrayList<>();
// User yazdik cunku User class indan objeleri atacagiz liste

public List<User>register(){
	Scanner scan = new Scanner(System.in); 
	
	System.out.println("adinizi giriniz : "); 
	String isim = scan.nextLine() ;
	
	User user = new User(isim,LocalDateTime.now());
	
	kullanicilar.add(user) ;
	 
	 
	 
	return kullanicilar;
	 
 }
	
public void printHappyUsers(ArrayList<User>users) {
// user lardan gelen objelerin ilk 10 saniyesini alacagiz	
// calistigin class User icindeki each lar yani her bir elemani each ya ata	
	
	for (User each : users) {
		if (each.registerDate.getSecond()<10) {
		System.out.println("sansli kisinsiniz "+ each.name+" agam 5 kg bal kazandin");	
		}else {
			System.out.println("maalesef "+each.name+" ballar balini buldunuz kovaniniz yagmalandi");
		}
		
		
	}
	}
	public void listele(ArrayList<User>users) {
		for(User each : users) {
			System.out.println("Adi: "+each.name+" kayit zamani :"+ each.registerDate);
		}
}	
}	
	
	

