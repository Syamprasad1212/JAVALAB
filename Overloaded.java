class Overloading
{
	int x,y,z;
	
	int display(int a)
	{
		x=a;
		return x;
	}
	
	int display(int a, int b)
	{
		x=a;
		y=b;
		return x+y;
	}
	 
	int display(int a, int b, int c)
	{
		x=a;
		y=b;
		z=c;
		return x+y+z;
	}	
}	
	
public class Overloaded
{
		public static void main(String[] args)
	{
		Overloading s=new Overloading();
		System.out.println("integer value:"+s.display(3));
		System.out.println("Two integer values:"+s.display(3,5));
		System.out.println("Three integer values:"+s.display(3,4,5));
			
	}
}

	
