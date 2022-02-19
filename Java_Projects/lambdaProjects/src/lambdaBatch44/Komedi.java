package lambdaBatch44;

public class Komedi {

    public static void main(String[] args) {
      bahceli();
    }

    private static void bahceli() {
       int yeniyil = 2022 ;
       int adet = 0;
       int yil = 0 ;
       String meymenetsiz = "RecepTayyipErdogan" ;

       while(yeniyil!=0){
           yil = (yeniyil%10)+yil ;
           yeniyil/=10 ;
           ++adet ;
       }
       // bahceliTeoremi : bir sayi da ayni olan rakam sayisi kadar carpim olur 2022= 3 tane 2
       int bahceliTeoremi = yil *3 ;
        if(meymenetsiz.length()==bahceliTeoremi){
            System.out.println("Bu Sene Geberecek");
        }else{
            System.out.println("Bir baska bahara...");
        }


    }
}
