package plant;

import java.util.Objects;

public class Goruntule extends Runner {
	
	static Objects goruntule(){
	if(Material.demir.size()==0) {
		
		
	}else {
		System.out.println("<<<<<<<<DEMIR<<<<<<<<");
		System.out.println(Material.demir);
		System.out.println();
	}
	
	if(Material.celik.size()==0) {
		
	}else {
		System.out.println("<<<<<<<CELIK<<<<<<<<");
		System.out.println(Material.celik);
		System.out.println();
	}

	
	
    if(Material.bakir.size()==0) {
		
	}else {
		System.out.println("<<<<<<<BAKIR>>>>>>>>");
		System.out.println(Material.bakir);
		System.out.println();
	}
	
    if(Material.pamuk.size()==0) {
		
	}else {
		System.out.println("<<<<<<<PAMUK>>>>>>>>");
		System.out.println(Material.pamuk);
		System.out.println();
	}
	
    if(Material.plastik.size()==0) {
		
	}else {
		System.out.println("<<<<<<<PLASTIK>>>>>>>>");
		System.out.println(Material.plastik);
		System.out.println();
	}
	
    
	if(Material.krom.size()==0) {
		
	}else {
		System.out.println("<<<<<<<<KROM>>>>>>>>>>>");
		System.out.println(Material.krom);
		
	}
	
	
	
	
	
	System.out.println("Ana menuye donmek icin 1 e cikmak icin 2 ye basiniz");
	int tercih = scan.nextInt();
	if(tercih==1) {
		return Runner.runner();
	}
	
	
	return null;
	
	
		
		
		
	}
	
	

	
}
