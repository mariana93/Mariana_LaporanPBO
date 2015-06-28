package Mariana;

public class Argument1 {

	public static void passingPrimitif(int a)
	{
		a=9;;
	}
	
	public static void passingObject(Titik b)
	{
		b.x=7;
		b.y=10;
	}
	
	public static void main (String args[])
	{
		int a = 9;
		passingPrimitif(a);
		System.out.println(a);
		
		Titik b = new Titik();
		passingObject(b);
		System.out.println(b.x + " " + b.y);
		System.out.println(a + " "+ b.x + " " + b.y);
	}
	
}

class Titik {
	public int x;
	public int y;
	
	public Titik(){
		x=0;
		y=0;
	}

}
