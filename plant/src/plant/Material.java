package plant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Material extends Runner{
// Fabrikamiz asagidaki urunleri kullanmaktadir
	static List<Object> demir = new ArrayList<>(); 
	static List<Object> celik = new ArrayList<>();
	static List<Object> bakir = new ArrayList<>();
	static List<Object> pamuk = new ArrayList<>();
	static List<Object> plastik = new ArrayList<>();
	static List<Object> krom = new ArrayList<>();
	static int metre ;
	static int kg ;
	static int metrekup ;
	static int batch =101 ; 
	
	
// Asagidaki method material ekleme dir.
//Kullanicidan eklemek istedigi material i istiyoruz
//Switch case ile her bir material icin method olusturduk o method ismi ile cagiriyoruz
	static Object materialekleme() {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Eklemek Istediginiz urunu seciniz"
			+ "\n1-demir\n2-celik\n3-bakir\n4-pamuk"
			+ "\n5-plastik\n6-krom");
	
	int tercih = scan.nextInt() ;
	
	switch (tercih) {
	case 1: 
		demirekle();
		break ;
	case 2:
		celikekle();
		break ;
	case 3 :
		bakirekle() ;
		break ;
	case 4 :
		pamukekle();
		break;
	case 5 :
		plastikekle();
		break ;
	case 6 :
		kromekle();
		break ;
	default:
		
	}
	return null;	
		
		
		
		
	}
//********************************************************************************************************
	static Object demirekle(){
		System.out.println("Material Demir ekleyin: ");
		String demir1 = scan.next();
		
		demir.add(demir1);
		
		System.out.println("Unit Ekleyin\n1-kg\n2-metre\n3-metrekup");
		
		int unit1 = scan.nextInt();
		
		
		if(unit1!=1 && unit1!=2) {
			return materialekleme() ;
		}
		else if(unit1==1) {
		System.out.println("Kac Kg?");	
		int kg = scan.nextInt();
		demir.add("kg :" + kg);
		
		}
		else if(unit1==2) {
			  
		System.out.println("Kac Metre?");
		int metre = scan.nextInt();
		demir.add("metre :"+metre);
		}
		
		else if(unit1==3) {
		System.out.println("Kac Metrekup?");	
		int metrekup = scan.nextInt();
		
		demir.add("metrekup :"+metrekup);
		}else {
			System.out.println("yanlis giris yaptiniz");
			//return materialekleme() ;
		}
			
		
		
		
		
		batch ++;
		demir.add("batch :"+batch) ;
		
		System.out.println("Eklemek istediginiz Baska Material Varsa 1 yoksa 2 ye basiniz");
		
		
		int devam = scan.nextInt();
		if(devam==1) {
			return materialekleme() ;
		}else {
			Runner.main(null);
		}
		return null;
	}
	
	//********************************************************************************************************	
	static Object celikekle(){
		System.out.println("Material Celik ekleyin: ");
		String celik1 = scan.next();
		celik.add(celik1);
		System.out.println("Unit Ekleyin\n1-kg\n2-metre\n3-metrekup");
		
int unit1 = scan.nextInt();
      
       if(unit1!=1 && unit1!=2) {
    	   
	    return materialekleme() ;
       }
       else if(unit1==1) {
		System.out.println("Kac Kg?");	
		int kg = scan.nextInt();
		celik.add("kg :" + kg);
		
		}
       else if(unit1==2) {
			  
		System.out.println("Kac Metre?");
		int metre = scan.nextInt();
		celik.add("metre :"+metre);
		}
		
       else if(unit1==3) {
		System.out.println("Kac Metrekup?");	
		int metrekup = scan.nextInt();
		
		celik.add("metrekup :"+metrekup);
		}
       
       
		batch ++;
		celik.add("batch :"+batch) ;
		
		System.out.println("Eklemek istediginiz Baska Material Varsa 1 yoksa 2 ye basiniz");
		int devam = scan.nextInt();
		if(devam==1) {
			return materialekleme() ;
		}else {
			Runner.main(null);
		}
		return null;
	}
	
	static Object bakirekle(){
		System.out.println("Material Bakir ekleyin: ");
		String bakir1 = scan.next();
		bakir.add(bakir1);
		System.out.println("Unit Ekleyin\n1-kg\n2-metre\n3-metrekup");
		
       int unit1 = scan.nextInt();
       
       if(unit1!=1 && unit1!=2) {
			return materialekleme() ;
		}
       else if(unit1==1) {
		System.out.println("Kac Kg?");	
		int kg = scan.nextInt();
		demir.add("kg :" + kg);
		
		}
       else if(unit1==2) {
			  
		System.out.println("Kac Metre?");
		int metre = scan.nextInt();
		bakir.add("metre :"+metre);
		}
		
       else if(unit1==3) {
		System.out.println("Kac Metrekup?");	
		int metrekup = scan.nextInt();
		
		bakir.add("metrekup :"+metrekup);
		}
       
       
       
		batch ++;
		bakir.add("batch :"+batch) ;
		
		System.out.println("Eklemek istediginiz Baska Material Varsa 1 yoksa 2 ye basiniz");
		int devam = scan.nextInt();
		if(devam==1) {
			return materialekleme() ;
		}else {
			Runner.main(null);
		}
		return null;
	}
	//********************************************************************************************************	
	static Object pamukekle(){
		System.out.println("Material Pamuk ekleyin: ");
		String pamuk1 = scan.next();
		pamuk.add(pamuk1);
		System.out.println("Unit Ekleyin\n1-kg\n2-metre\n3-metrekup");
		
        int unit1 = scan.nextInt();
        if(unit1!=1 && unit1!=2) {
        	
			return materialekleme() ;
		}
        else if(unit1==1) {
		System.out.println("Kac Kg?");	
		int kg = scan.nextInt();
		pamuk.add("kg :" + kg);
		
		}
        else if(unit1==2) {
			  
		System.out.println("Kac Metre?");
		int metre = scan.nextInt();
		pamuk.add("metre :"+metre);
		}
		
        else if(unit1==3) {
		System.out.println("Kac Metrekup?");	
		int metrekup = scan.nextInt();
		
		pamuk.add("metrekup :"+metrekup);
		}
        
        
        
		batch ++;
		pamuk.add("batch :"+batch) ;
		
		System.out.println("Eklemek istediginiz Baska Material Varsa 1 yoksa 2 ye basiniz");
		int devam = scan.nextInt();
		if(devam==1) {
			return materialekleme() ;
		}else {
			Runner.main(null);
		}
		return null;
	}
	
	//********************************************************************************************************	
	static Object plastikekle(){
		System.out.println("Material Plastik ekleyin: ");
		String plastik1 = scan.next();
		plastik.add(plastik1);
		System.out.println("Unit Ekleyin\n1-kg\n2-metre\n3-metrekup");
		
        int unit1 = scan.nextInt();
        if(unit1!=1 && unit1!=2) {
			return materialekleme() ;
		}
        else if(unit1==1) {
		System.out.println("Kac Kg?");	
		int kg = scan.nextInt();
		plastik.add("kg :" + kg);
		
		}
        else if(unit1==2) {
			  
		System.out.println("Kac Metre?");
		int metre = scan.nextInt();
		plastik.add("metre :"+metre);
		}
		
        else if(unit1==3) {
		System.out.println("Kac Metrekup?");	
		int metrekup = scan.nextInt();
		
		plastik.add("metrekup :"+metrekup);
		}
        
		batch ++;
		plastik.add("batch :"+batch) ;
		
		System.out.println("Eklemek istediginiz Baska Material Varsa 1 yoksa 2 ye basiniz");
		int devam = scan.nextInt();
		if(devam==1) {
			return materialekleme() ;
		}else {
			Runner.main(null);
		}
		return null;
	}
	
	//********************************************************************************************************	
	static Object kromekle(){
		System.out.println("Material Krom ekleyin: ");
		String krom1 = scan.next();
		krom.add(krom1);
		System.out.println("Unit Ekleyin\n1-kg\n2-metre\n3-metrekup");
		
       int unit1 = scan.nextInt();
       if(unit1!=1 && unit1!=2) {
			return materialekleme() ;
		}
       else if(unit1==1) {
		System.out.println("Kac Kg?");	
		int kg = scan.nextInt();
		krom.add("kg :" + kg);
		
		}
       else if(unit1==2) {
			  
		System.out.println("Kac Metre?");
		int metre = scan.nextInt();
		krom.add("metre :"+metre);
		}
		
       else if(unit1==3) {
		System.out.println("Kac Metrekup?");	
		int metrekup = scan.nextInt();
		
		krom.add("metrekup :"+metrekup);
		}
       
       
		batch ++;
		krom.add("batch :"+batch) ;
		
		System.out.println("Eklemek istediginiz Baska Material Varsa 1 yoksa 2 ye basiniz");
		int devam = scan.nextInt();
		if(devam==1) {
			return materialekleme() ;
		}else {
			Runner.main(null);
		}
		return null;
	}
	
	
	

}
