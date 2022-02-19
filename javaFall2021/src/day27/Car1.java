package day27;

public class Car1 {
	// dunku Car classin dan bir pobje olusturmak istedigimizde
	//java Car class ini icinde bulundugumuz class a import etmek istersek 
	
	int yil=2000;
    String renk;
    String model;
    int km;
    boolean satilikMi;
   
    public Car1(int km, String Model, String renk, int yil, boolean satilikMi) {
		// atama yapacagimiz tum ozellikleri parametre olarak yolladik
	}

    // ben 5 ozelligi birden degsitiren bir constructor urettigimde
    // java default constructor i siler
    // bu durumda daha onceden yazilan ve default constructor i kullanan tum kodlar coker
    // bu durumda kodlari duzeltmek icin javanin sildigi defauklt constructor yerine 
    // parametsresiz bir constructor olsuturmaliyiz
    
    
    
    
    
    
    
    public Car1() {
    	
    }
 // parametresiz constructor uretmenin syntax'i clasAdi+() + {}
    
	public Car1(int i) { // bu satirdaki int km ile calss level daki int km farkli scope lkardadir
		km=i ;
	}
	
	public Car1(int i, int j) {
		//      yil      km
		yil=i;
		km=j;
	}
	
	public void hiz(int hiz) {
        System.out.println("araba saatte " + hiz + " km yapar");
    }
    
    public void yakit(String yakit) {
        System.out.println("Araba yakit olarak " + yakit + " kullanir");
    
       
        
        
        
        
        
        
	 
	}
}

