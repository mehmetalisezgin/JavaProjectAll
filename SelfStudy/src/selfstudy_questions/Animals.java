package selfstudy_questions;

public abstract class Animals {



    public abstract  void cats();
    public abstract void dogs();


public class Cats extends Animals{
    public void cats(){
        System.out.println("meowwwww");
    }

    @Override
    public void dogs() {

    }
    Cats cat = new Cats();
}
public class Dogs extends Animals{
    @Override
    public void cats() {

    }

    public void dogs(){
        System.out.println("Dogs bark");
    }
    Dogs dog = new Dogs();
}

    public static void main(String[] args) {
        /*
        Create an abstract class 'Animals' with two abstract methods 'cats' and 'dogs'.
        Now create a class 'Cats' with a method 'cats' which prints "Cats meow" and a class
        'Dogs' with a method 'dogs' which prints "Dogs bark", both inheriting the class 'Animals'.
         Now create an object for each of the subclasses and call their respective methods.
         */


    }
}
