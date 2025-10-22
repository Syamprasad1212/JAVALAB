// Program to demonstrate super keyword
class Parent
{
	int a,b;
	Parent(int x,int y)
	{
		a=x;
		b=y;
	}
	void display()
	{
		System.out.println("sum of"+a+"and "+b+"in parent class is :"+(a+b));
	}
		
}
class Child extends Parent
{
	Child()
	{
	super(20,20);
	}
	void display()
	{
		System.out.println("sum of"+a+"and "+b+"in child class is :"+(a+b));
		super.display();
	}
}
class Super
{
	public static void main(String[] args)
	{
		Child obj =new Child();
		obj.display();
	}
}

Output:
sum of 20 and 20 in child class is :40
sum of30 and 20 in parent class is :50
