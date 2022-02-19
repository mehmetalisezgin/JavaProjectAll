package selfstudy_questions;

public class Question05 {
    String name ;
    int roll_no ;
    String phone_number ;


    public Question05(String isim, int no,String tel) {

      name = isim;
      roll_no = no ;
      phone_number = tel ;
    }

    public Question05() {

    }


    public static void main(String[] args) {
        /*
        Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
        Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
         */
 /*
       Assign and print the roll number, phone number and address of two students having names
        "Sam" and "John" respectively by creating two objects of class 'Student'.
         */


      Question05 obj = new Question05();
        System.out.println( );
       obj.name = "John";
       obj.roll_no = 2 ;
        System.out.println(obj.name+"\n"+obj.roll_no);

        Question05 obj2 = new Question05() ;
        obj2.name = "Sam" ;
        obj2.phone_number = "123456";
        System.out.println(obj2.name+"\n"+obj2.phone_number);
    }
}
