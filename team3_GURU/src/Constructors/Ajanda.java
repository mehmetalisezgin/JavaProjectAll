package Constructors;

public class Ajanda {
	// static konuldugu zaman degisitirlebiliyor
	public  String name;     // aradaki farki gormek icin static ekledim buraya cunku gordum ki asagida method olsuturdugumzda static olmaz ise 
	public  String surname;   // method calismiyor
	public  String school ;  
	public  int    phone ; 
	public  int zipcode ;
	public   String city ="Istanbul" ;
	public  String    country;
	public  int classnumber;
	public  String director ="Mustafa"; 
	// Uygulamali olarak denedik public den sonra static yazilmasi default degerlerin
	//herkes tarafindan degistirilebilir oldugunu gorduk.
	// ic ice yani zincir constructor lar olustrduk asagida ki gibi, icerisine farkli parametreler kullanarak MainDeftyer adli method class dan print aldik
	
	Ajanda(){
		System.out.println("inside constructor!");
	}
	
	public Ajanda (int phone) {
		
	}
	public Ajanda(int zipcode, int classnumber) {
		this.zipcode =60100; //this.zipcode = zipcode; 
		this.classnumber = 12 ; 
	}
	public Ajanda(String city, String director) {
		this.city = city ;         //Ajanda ajanda3 = new Ajanda("Tokat","Hasan"); bu objeyi MainDefter class i icinde olsuturduk yukarda default degerler
		this.director = director;   // vardi normalde ama code bu kisimda ki city ve director e hedef gosterdi  ve obje icindeki degerleri aldi
	}
	
	
	
	// Asagidaki kisim her bir default parametresi icin method olusturmak icin yapildi 
	// ve 
	
	public static void added(){
		System.out.println("Information is added..");
	}
	
	public static void removed() {
		System.out.println("Information is removed..");
	}
	
	
	
	
	/*
	public static void setName(String setName) {
		name = setName ; 
	}
	public static void setSurname(String setSurname) {
		surname = setSurname ; 
	}
	public static void setSchool(String setSchool) {
		school = setSchool ; 
	}
	public static void setPhone(int setPhone) {
		phone = setPhone ; 
	}
	public static void setZipcode(int setZipcode) {
		zipcode = setZipcode ; 
	}
	public static void setCity(String setCity) {
		city = setCity ; 
	}
	public static void setCountry(String setCountry) {
		country = setCountry ; 
	}

	/*public Ajanda(int streetnumber) { //
		
	}*/
	
	
	
}
