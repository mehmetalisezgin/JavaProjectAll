package _01_IfStatements_ok;

public class Doubleolusturma_OK {

	public static void main(String[] args) {
		/*   45 değerinde bir double oluşturun.
        Eğer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
        "able to divide by 5 and 8" yazdırınız.

        Eğer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
        "able to divide by 9 and divide by 10 reminder is 5" yazdırınız.
    */
  double x = 45 ; 
  if ((x%5==0)&&(x%8==0)) {
	  System.out.println("able to divide by 5 and 8");
  }else if((x%10==5)&&(x%9==0)) {
	  System.out.println("45 able to divide by 9 and divide by 10 reminder is 5");
  
  }

	}

}
