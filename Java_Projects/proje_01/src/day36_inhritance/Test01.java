package day36_inhritance;
class Derived{
    public Derived(String temp){
        System.out.println("Derived class : "+ temp);
    }
}



public class Test01 extends Derived{

    public Test01(String temp){
        super(temp);
        System.out.println("Test class : "+temp);
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Test01 obj = new Test01("Samet");
    }


}
