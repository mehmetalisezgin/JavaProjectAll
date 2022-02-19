package LibraryProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class KitapEkle {
// KitapEkle class i sadece eklenecek kitaplarin bilgilerini tutmak icin olusturuldu
// diyer butun islemler Kitapci class inda yapilacak ve buradaki variable lar cagirilacak
// 1-KitapEkle class i olusturuldu bu class in ayri olusturulmasi istenmisti.
// 2-kitapismilist,	yazarismilist,kitapfiyatlist,kitapno variable larimiz KitapEkle methodunda 
// kullanilmak uzere olsuturldu. count = 1000 yaptik cunku kitap numaralrinin 1000 den baslamasi isteniyor.
	
	static List<String> kitapismilist = new ArrayList<>();
	static List<String> yazarismilist = new ArrayList<>();
	static List<Double> kitapfiyatlist = new ArrayList<>();
	static List<Integer> kitapno = new ArrayList<>();
	static int count =1000 ;
	
	Kitapci kitapci = new Kitapci(); // Kitapci class indan bir constructor olusturduk
	
	public static void KitapEkle() { // Kitap ekle methodumuz
// Kullanicidan eklemek istedigi kitabin ismini yazarin adini ve fiyatini girmesini istedik
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Kitap ismini giriniz");
		String kitapismi = scan.nextLine();
		
		System.out.println("Yazar ismini giriniz");
		String yazarismi = scan.nextLine();
		
		System.out.println("Kitap fiyatini giriniz");
		double kitapfiyat = scan.nextDouble();
//Class icindeki variable larimiza kullanicidan aldigimiz degerleri assign ettik atadik...
		kitapismilist.add(kitapismi);
		yazarismilist.add(yazarismi);
		kitapfiyatlist.add(kitapfiyat);
		kitapno.add(count);
// count++ ile kitapno nun her seferinde 1 artacak sekilde olmasini sagladik
		count++ ;
// her defasinda eklediklerimizi gormek icin print aldik
		System.out.println(kitapismilist);
		System.out.println(yazarismilist);
		System.out.println(kitapfiyatlist);
		System.out.println(kitapno);
// Kitap eklemek icin tekrark kullaniciya sorduk		
		System.out.println("Eklemek istediginiz baska bir kitap varsa 1 e yoksa 2 ye tiklayiniz");
		int devam = scan.nextInt();
		if (devam==1) {
			KitapEkle();
		}if (devam==2) {
// eklemek istedigi baksa bir kitap yok ise kullaniciyi Kitapci class indaki menu methoduna yonlendirdik
		Kitapci.menu();
		}
		
		}
				
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

