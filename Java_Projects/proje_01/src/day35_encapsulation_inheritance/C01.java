package day35_encapsulation_inheritance;

public class C01 {

    private double not = 49.9 ;
    private  boolean gecerMi = false ;
    // not u set edebilmemiz icin bir method yazdik
    public void setNot(double not){
        this.not = not ;
    }
    public boolean isGecerMi(){
        if (not>50) {
           gecerMi = true ;
        }
        return gecerMi;
    }


    public static void main(String[] args) {

    }
}
