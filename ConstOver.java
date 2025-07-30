class Const
{
	int a,b,c;
	Const()
	{
		System.out.println("CONSTRUCTOR CALLED");
	}
	Const(int x,int y)
	{
		a=x;
		b=y;
		c=a+b;
		System.out.println("A+B IS:"+c);
	}
	
	Const(double x,int y)
	{
		double a=x;
		b=y;
		double c=a+b;
		System.out.println("A+B IS:"+c);
	}
		
}

class ConstOver
{
	public static void main(String[] args)
	{
		Const obj=new Const();
		Const obj1=new Const(10,20);
		Const obj2=new Const(10.23,10);
	}
}
