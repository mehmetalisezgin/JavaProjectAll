package day19;

public class Arrayss {

	public static void main(String[] args) {
		// array oncesinde mutlaka tanimlanmali
				// iki sey soylemeliyiz kac tane data barindiracak ikiciside icine koycagimiz primitive data turleri nelerdir
				// ornek ben bir array istiyorum icine iki tane char koycam ben bir int koycam icine iki int koycam veya string 
				// istiyorum icine bes string koycam.
				
				// array ler iclerinde ya primitive data lar barindirirlar yada non primitive e ayit referanslari barindirirlar
				// bir array in icine koyacagimiz tum variable lar ayni data type ina ayit olmalidir>>>
				// eger 5 tane int koyacaksak hepsi int olmali baska birsey olmamali...
				// ic ice array olur
				// bir array in icine konacak olan variable sayisina array in length i denir...
				// array lar object tir. bu sebepten heap memory de depolanirlar
				// value lerinin yaninda methodlari da vardir.
				// runtime da olsutururlurlar...yani biz yazdigimzda olsuturlmuyor nezman ki run tusuna basildi o zaman olsuturulur.
				// array declare etmek icin iki yol vardir 1- int myArray[]; bu cok kullanilir. ikincisi int [] myArray 
				// String[] args bu main methoda da vardir demek oluyor ki arg isminde icinde stringler bulunan bir array...
				// iki turlu array olsuturabiliriz 1- int myArray[]=new int[6] bu demek oluyor ki maksimum 6 variable var 
				// eger array e eleman eklemessek deger atamassak java data type ina uygun default degerler atar
				// int myArray[] = new int[3] maksumum uctane variable olacak 
				// su sekilde olabilir myArray[0] = 9 0.inci index 9 olsun myArray[2] = 10  ikinci index 10 olsun gibi..
		
		
		String arr[] = new String[4];
		arr[0] = "Ali" ; 
		arr[1] ="Veli" ; 
		arr[2] = "Ayse" ;
		arr[3] =" Fatma" ;
		
		String arr2[] = {"Ali", "Veli","Ayse","Fatma"} ; //  bu tip yazimda olur yukardaki gibi de olur
		
		
		// soru ali yerine ozan ayse yerine erva yazdir
		
		arr[0] = "ozan";
		
		
		
		
		
		
	}

}
