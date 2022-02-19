package LibraryProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kitapci {
// Kitapci class inin icinde kitabi ekleyen personelin ismini ve sifresini default olarak belirledik
	static String personel="Mehmet Ali";
	static String sifrem ="1234";
	
	
//***********************************************************************************	
public static void main(String[] args) {
// main method da kullanici nin class icindeki personel ve sifre sini karsilastirmak icin
		// ismini ve sifresini girmesini istedik
		Scanner scan =new Scanner(System.in);
        System.out.println("Kitapci Baba`ya Hosgeldiniz");	
		
		String isim = " " ;
		String sifre = " " ;
		int count = 1; // kullaniciya 3 kez yanlis giris hakkini saymak icin count 1 den basladi
// do while kullandik cunku yanlis giris yapmasi halinde tekrar sorduk 
		// hatta 3 giris hakki verdik 
		// simdilik duzgun giris yapalim cunku bir hata var :)
		do {
			System.out.println("Personel isim girisi:");
			isim = scan.nextLine();
		
		   System.out.println("Lutfen sifrenizi giriniz:");	
			sifre = scan.next();
        if (sifre.equals(sifrem) && isim.equalsIgnoreCase(personel)) {
			System.out.println("Giris Basarili");	
// isim ve sifre dogru ise kodu break ile kirdik 				
			break;	
			}	
			
		
		if (!sifre.equals(sifrem)|| !isim.equalsIgnoreCase(personel)) {
				
				count++ ;
				
			}
		if (count!=1) {
			System.out.println("Hatali giris yaptiniz kalan hakkiniz "+ (4-count));
			
		}if (count==4) {
			System.out.println("Kullanici girisiniz bloklandi... ");
			
		}
			
			
		}while(count<4); // kullanici 4 den az yani 3 kez hata yapana kadar dongu donecek
		
		// dogru giris oldugunda menu() methoduna yonlendirecek.
		
		menu();
		}
		

	


//***********************************************************************************
	public static void menu() {
	Scanner scan = new Scanner(System.in);
	int tercih ; 
// Kullanicidan yapmak istedigi islemleri siraladik
	// yine do while kullnadik birden fazla islem yapmak istediginde cikis yapana kadar
	// dongu devakm etsin diye.

	do {
		System.out.println("\nLutfen yapmak istediginiz islemi belirtin\n1->Kitap Ekle"
				+ "\n2->Kitap No ile Goruntule"
	       		+ "\n3->Text ile Goruntule\n4->Kitap Sil \n"
	                    + "5->Listele\n6->Cikis");	
	tercih = scan.nextInt();
	if(tercih>6)
		tercih = 6 ;
// 6 tercih var ama kullanici 6 dan buyuk sayi yazarsa 6 ya esitledik cikis yaptirdik
// uyarida verilebili isteyen olursa...
// switch ile tercihlerini sorduk ve case 1 Kitap Ekle oldugu icin KitapEkle class i icinden KitapEkle
	// methoduna yonlendirdik onu cagirdik.
// diyer case ler i asagida bir method ile olsuturduk.
	switch (tercih) {
	case 1 :
		KitapEkle.KitapEkle();
	break;
	case 2:   
        NoIleGoruntule();
        break;
        
    case 3:
        TextIleGoruntule();
        break;
        
    case 4:
        KitapSil();
        break;
        
    case 5:
        Listele();
        break;
        
    case 6:   
        System.out.println("Cikis basarili.");
        break;
        
    default:
        System.out.println("Lutfen gecerli islem seciniz.");
        break;
    }	
	} while (tercih!=6);
		
	}
//***********************************************************************************
	private static void TextIleGoruntule() {
		Scanner scan = new Scanner(System.in);
		String text ;
		int count = 0 ;
		do { 
			count = 0;
			System.out.println("Goruntulemek istediginiz kitabin yazar ismini giriniz...");
			text = scan.next();
			if(KitapEkle.yazarismilist.contains(text)) {
				int  textindex = KitapEkle.yazarismilist.indexOf(text);
				
				System.out.println("Kitap No :"+KitapEkle.kitapno.get(textindex));
				System.out.println("Kitap Ismi :"+KitapEkle.kitapismilist.get(textindex));
				break;
			}else {
				count++;
			}
		} while (count!=0);
		
}

	
//***********************************************************************************
// for dongusu icinde KitapEkle class indaki kitapno nun size ina kadar gittik ve check ettik
// butun KitapEkle class i icinde olusturulan variable larin i. indexlerini aldik
// yani butun listeyi yazdirmis olduk...
	public static void Listele() {
		
		for (int i = 0; i <KitapEkle.kitapno.size() ; i++) {
		
		System.out.print(KitapEkle.kitapno.get(i)+" "+KitapEkle.kitapismilist.get(i)+" "+KitapEkle.yazarismilist.get(i)+
			" "+KitapEkle.kitapfiyatlist.get(i)) ;
			
		}
	}
//**********************************************************************************
	public static void KitapSil() {
		
		 Scanner scan = new Scanner(System.in);
		 int silinecekkitapno ;// kullanicidan silmek istedigi kitabin numarasini istedik
		 int kitapindex;// silecegi kitabi bulmak icin kacinci indexte oldugunu bulmamiz gerekir
		 // bu sebepten int kitapindex variable ini olsuturduk.
// yine bir do while dongusu var cunku silme islemine tekrar devam etmek isteyebilir
		do {
			System.out.println("Silmek istediginiz kitabin numrasini giriniz...");
			silinecekkitapno = scan.nextInt();
			if(silinecekkitapno<1000) {
			System.out.println("Kitap numaralari dort basmakali olmalidir");
			
			}
		} while (silinecekkitapno<1000);
		// kitapindex silinecek kitap KitapEkle classi icinde kitapno un indexi ne esit oldu 
		// yani 1000 nolu kitap silinecek diyelim 1000 in hangi indexte olduguna baktik
		// cunku 1000 hangi indexteyse ona ayit kitap ismi ve yazar da ayni indexte olacak
		
		kitapindex = KitapEkle.kitapno.indexOf(silinecekkitapno);
		// int olanlar icin sildigimiz kitabin yerine 0 string olanlar icin silinmis yazdik
		// kitap fiyatini bastan string olustursaydik silinmis yazabilirdik
		
		KitapEkle.kitapno.set(kitapindex, 0);
		KitapEkle.kitapismilist.set(kitapindex, " silinmis ");
		KitapEkle.yazarismilist.set(kitapindex, " Silinmis ");
		KitapEkle.kitapfiyatlist.set(kitapindex, null);
// neler silinmis geriye ne kalmis diye tekrar bi listimizi gormek istedik...
		for (int i = 0; i <KitapEkle.kitapno.size() ; i++) {
	System.out.print(KitapEkle.kitapno.get(i)+" "+KitapEkle.kitapismilist.get(i)+" "+KitapEkle.yazarismilist.get(i)+
				" "+KitapEkle.kitapfiyatlist.get(i)) ;
				
			}
	}



	public static void NoIleGoruntule() {
		Scanner scan = new Scanner(System.in);
		int no ;
//Yine do while ile goruntiulemek istedigimiz kitabin no sunu sorduk ve 
		// sartlarimizi belirledik
		do {
			System.out.println("Goruntulemek istediginiz kitabin numrasini giriniz...");
			no = scan.nextInt();
			if(no<1000) {
				System.out.println("Kitap numaralari dort basmakali olmalidir");
				
			}
		} while (no<1000);
		
// ornegin 1000 nolu kitabi goruntulemek istiyorsa 1000-1000=0 yani 0. indexe baktik 		
		System.out.println("Kitap Ismi :"+KitapEkle.kitapismilist.get(no-1000));
		System.out.println("Kitap Yazari :"+KitapEkle.yazarismilist.get(no-1000));
		
		
				}



	

}
