package selfstudy_questions;

public class Question02 {
     String name ;
     String school ;
     String clasroom ;
     int clasnumber ;

     void setData(String nm,String sc, String cls,int clno){
         name = nm;
         school = sc ;
         clasroom = cls ;
         clasnumber = clno ;

     }

  void displayData(){
      System.out.println("The name of student is :" +name);
      System.out.println("school is :" + school);
      System.out.println("classroom is :" +clasroom);
      System.out.println("the class number is: "+clasnumber);

  }

    public static void main(String[] args) {
        Question02 student = new Question02();
        student.setData("Mehmet Ali","University of Ljubljana","125mf",125);
        student.displayData();
    }


}
