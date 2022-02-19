package selfstudy_questions;

public class Question08A extends Question08 {
    Question08 obj = new Question08A();

    public Question08A(double kenar1, double kenar2, double kenar3) {
        super(kenar1, kenar2, kenar3);
    }

    public Question08A() {
        super();
    }

    public static void ucgenOlabilme(){

     if(((kenar3<kenar1+kenar2)&&(-1*(kenar1-kenar2))<kenar3)|| ((kenar2<kenar1+kenar3)&&(-1*(kenar1-kenar3))<kenar2)
     || ((kenar1<kenar3+kenar2)&&(-1*(kenar3-kenar2))<kenar1)){
         ucgenAlan();
     }
      else{
         System.out.println("Bi bir ucgen degildir");
     }

    }
    public static double ucgenAlan(){
     double   u=(kenar1+kenar2+kenar3)/2 ;
     double alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3)) ;
      return  alan ;
    }


}
