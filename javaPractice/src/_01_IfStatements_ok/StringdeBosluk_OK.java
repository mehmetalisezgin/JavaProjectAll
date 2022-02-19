package _01_IfStatements_ok;

import java.util.Scanner;

public class StringdeBosluk_OK {

	public static void main(String[] args) {
// Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        

        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
    	
    	Scanner scan = new Scanner(System.in);
    	System.out.println("lutfen bir kelime yaziniz...");
    	String name = scan.nextLine();
    	
    	if (name.isBlank()){
    		System.out.println("lutfen bir kelime yaziniz birsey yazmadiniz...");
    	}else 
    	System.out.println("girdiginiz kelimede bosluklar mevcut mu ?"+name.contains(" "));
    	
    	
    	
    	scan.close();
		
		
		
		
		

	}

}
