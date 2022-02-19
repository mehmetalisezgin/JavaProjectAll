package selfstudy_questions;

public class Question01 {
    int roomno;
    String roomtype ;
    float roomarea ;
    boolean ACmachine;

    void setData(int rno,String rt,float area,boolean ac ){
      roomno = rno ;
      roomarea = area;
      roomtype = rt ;
      ACmachine = ac ;
    }
    void displaydata(){
        System.out.println("The room #. is " +roomno);
        System.out.println("The room Type is " +roomtype);
        System.out.println("The room area is " +roomarea);
        String s = (ACmachine)? "yes":"no" ;
        System.out.println("The ACmachine needed " + s);
    }
    public static void main(String[] args) {
        /*
        Write a program to create a room class, the attributes of this class is
        roomno, roomtype, roomarea and ACmachine. In this class the member
        functions are setdata and displaydata
         */
      Question01 room1 = new Question01();
      room1.setData(101,"Deluxe",240.0f,true);
      room1.displaydata();






    }



}
