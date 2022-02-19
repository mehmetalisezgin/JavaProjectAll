package projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitap {
	static List<Kitap>kitapListe = new ArrayList<>();
	static Scanner scan = new Scanner(System.in);
	static int kitapNo =1000;
	public static void main(String[] args) {
		

	}
	public static void menu(List<Kitap>liste) {
		
		System.out.println("========= KİTAP PROGRAMI =============\n1: Kitap ekle\n2: Numara ile kitap sil\n3: "
				+ "Tum kitaplari listele\n4: Bitir");
		
		System.out.println("isleminizi secin");
		int tercih = scan.nextInt();
		
		switch(tercih) {
		   case 1: 
			   kitapEkle(liste);
			   break;
		   case 2:
			   noIleSil(liste);
			   break;
		   case 3: 
			   listele(liste);
			   break ;
		   case 4 :
			   bitir();
			   break;
			   default: System.out.println("yanlis giris yaptiniz");
			   break ;
		}		
		
	}
	private static void bitir() {
		
		
	}
	private static void listele(List<Kitap> liste) {
		// TODO Auto-generated method stub
		
	}
	private static void noIleSil(List<Kitap> liste) {
		// TODO Auto-generated method stub
		
	}
	private static void kitapEkle(List<Kitap> liste) {
		System.out.println("eklemek istediginiz kitabin ismini giriniz :");
		String kitapAdi = scan.nextLine();
		System.out.println("Kitabin yazar ismi giriniz :");
		String yazarAdi = scan.nextLine();
		System.out.println("yayin yilini giriniz :");
		int yayinyili = scan.nextInt();
		System.out.println("fiyatini giriniz :");
		double fiyat = scan.nextDouble();
		Kitapci kitapci = new Kitapci(++kitapNo,kitapAdi,yazarAdi,yayinyili,fiyat);
		liste.add(kitapci)	;	
	}

}
