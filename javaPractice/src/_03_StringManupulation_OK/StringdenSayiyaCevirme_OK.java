package _03_StringManupulation_OK;

public class StringdenSayiyaCevirme_OK {

	public static void main(String[] args) {
		/*
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */

		String  str1= "%13.99" ;
	    String str2 = "%10.55" ;
	    
	    str1=str1.replace("%", "");
	   
	    
	    str2=str2.replace("%", "");
        System.out.println(str1); //13.99
        System.out.println(str2);
        double sayi1= Double.parseDouble(str1); //bu metod olmazsa stringi aritmrtik toplayamazsınız
        double sayi2= Double.parseDouble(str2);
        double toplam= (sayi1+sayi2) ;
        System.out.println("$" + toplam); 
		
		
	}

}
