package felsefe;


class M
{
    //static
	
	public M(int r)// parametreli constructor
	
    {
        System.out.println('A');   //DXBAZEF   //DXBCZEF
    }

    {
        System.out.println('B'); // constructor
    }
    
 
    public M()//constructor
    {
        System.out.println('C');
    }
}

class N extends M
{
    static
    {
        System.out.println('D'); // once burasi yazdirilir herseyden evvel -->static 
    }
    
    {
    	System.out.println('E');   
    }
 
    public N(int d)//constructor
    {
    	super(5);
        System.out.println('F');
    }
}
 
public class A
{
    public static void main(String[] args)
    {
        M n = new N(3); //buradan 43 a gider -->elle olusturulmus 
       
    }
}