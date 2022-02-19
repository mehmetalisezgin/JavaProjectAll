package day01variables;

public class Variables02 {

	private static final char M = 0;

	public static void main(String[] args) {
	//Class in icinde variable ve method olurdu,
		//variable olusturmak icin 1) data type yazilir 
		//2) variable ismi 3) "=" isareti konulacak 4) variable a bir deger atamasi yapilir
		//";" sonuna konur
		
		//1. yol
		int age = 23 ; //data type ile variable ismi arasinda bosluk birakmak gerekir
		int salary = 5000 ;
		System.out.println("bu adamin yasi  :" + age);//23
		System.out.println("bu adamin maasi :" + salary);
		
		//2.yol
		
		int lenght ;
		lenght = 123 ;
		System.out.println("bu adamin boyu :" + lenght);
		
		
		//3. yol
		int width = 12 , height = 23 , money = 42 ;
		System.out.println("width" + "height" + "money");
		/* javada temelde 2 farkli data type vardir
		 1) primitive data type 8 tanedir
		 a) boolean; true yada false durumlarinda kullanilir memory de az yer kaplar
		 b) char: tek karekterli (her bir sembol bir karekterdir) ifadeler icin char data type kullanilir
		 // bir char memory de 16 bit yer kaplar,
		 c) byte: -128 den 127 ye kadar olan butun tam sayilari icerir 8 bit lik yer kaplar
		 d) short -32768 den 32767 ye kadar olan tum tamsayilari icerir, memoryyde 8 bit yer kaplar
		 e) int -2147483648 den 2147483647 e kadar ki tum tam sayilari kaplar memoryde 32 bit yer kaplar
		 f) long -9223372036854755808 den 9223372036854755807 e kadar olan tum tam sayilari kaplar memoryde 64 bit yer kaplar
		 g) float ondalik sayilar icin kullanilan data type lardir floatlar ondalik kisimlarinda en fazla 7 rakam barindirir
		 //32 bit yer kaplar, float oldugunu anlamak icin en sona 'f' veya 'F' yazilir.sonuna f konulmassa 
		  * java double olarak kaul eder.
		 h) double ondalik sayilar icin kullanilan data type lardir daha hassasdirlar ondalik kismlarinda 16 rakam barindirir
		 //64 bit yer kaplar
		
		 2) nonprimitive data type, 
		 
		 */
		
			// firstly write data type of bloolean
		
		
		boolean emekli = false ;
		boolean engelli = true ;
		boolean x = true ;
		
		System.out.println(emekli);
		System.out.println(engelli);
		System.out.println(x);
		char initial = 'M' ; //kirmizi cizgi hatasi compire time error. char datay type icin tek tirnak
		System.out.println(initial);
		char second = 'A';
		System.out.println(second);
		char ch1 = '3' ;
		char ch2 = '2' ;
		// char ch3 = ''""'; char olustururken iki tirnak arasinda sadece bir karekter olmalidir...
		char ch5 = 'T' ;
		//JAVADA HER HARFIN HER SEMBOLUN BIR SAYI DEGERI VARDIR ORNEGIN a=97 dir b=98 dir gibi...
		
		 System.out.printf("%1$-8s %2$-10s %3$s\n",
	                "Decimal", "ASCII", "Hex");
		 char tsk = 123 ;
		 System.out.println(tsk);
		 char mng = 28;
			System.out.println(mng);
           System.out.println(tsk+mng );//char lar ile matematiksel islemler yapilirsa char larin acii table daki degerlerini kullanir
           System.out.println(tsk > mng);
           System.out.println(mng > tsk);// karsilastirma islemlerinin sonucu ya true yada false olur System.out.println(mng > tsk)
           //karsilastirmasi true yada false olarak sonuclanir yani boolean ...
           char erva = 'A';
           char eva = 'a' ;
           System.out.println(erva > eva);
           
           // her hangi bir karekterin ascii degerini code yazarak bulma:
           char space = ' ' ;
           System.out.println( space+0);
           char tokat = '.';
           System.out.println(tokat+0);
           
           char mali = '?' ;
           System.out.println(mali+0);
           
           float f1 =2.23f ;
           
           double d1 = 2.32 ;
            System.out.println(f1);
           System.out.println(d1);
           
           /*byte<<short<<int<<long<<double
            * 2) nonprimitive data type,
            * String : cift tirnak arasinda yazilan sifir veya daha fazla character lerden olusur
            * primitive data type ile non primitive data type arasinda ki farklar:
            * 1- primitive data type isimlerinde  tum harfler kucuk harf  olmalidir non primitive 
            * data type larinda ilk harf buyuk yazilmalidir.
            * 2-primitive data typle larini java olsuturmustur, biz primitive data type olusturamayiz ama 
            * non primitive data type lari java programcilari tarafindan istenildigi kadar olsuturulabilr 
            * 3-primitive data type larin memry de kapladigi yer data type ina gore degisir 
            * 4-primitive data typle larinin memoryde ayirdigi alanda sadece o primitive datanin degeri vardir
            * non primitive in ayirdigi yerin icinde methodlar vardir 
            */
        
             
          
       String str1 = "mehmet ali sezgin";
       System.out.println(str1);
           
           
           
           
           
	}

}
