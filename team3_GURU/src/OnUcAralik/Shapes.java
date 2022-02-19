package OnUcAralik;

public class Shapes
{
public static Shape randshape()
{
switch((int)(Math.random()*3))
{
case 0: return new Circle();
case 1: return new Square();
case 2: return new Triangle();
default : System.out.println("default");
return new Shape();
}
}
public static void main (String arg[])
{
Shape s[] = new Shape[9];
for(int i = 0;i< s.length; i++)
	 s[i] = randshape();
for(int i= 0;i < s.length; i++)
s[i].draw();
}
} 
