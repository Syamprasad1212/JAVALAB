// Program to demonstrate multilevel inheritance
class Parent
{
	int a=10;
}
class Small1 extends Parent
{
	int b=20;
	void display()
	{
		System.out.println("sum of "+a+"and"+b+"is :"+(a+b));
	}
}
class Small2 extends Child1
{
	int c=40;
	void display1()
	{
		System.out.println("sum of "+a+","+b+"and "+c+"is :"+(a+b+c));
	}
}
class MultiLevel
{
	public static void main(String[] args)
	{
		Small2 obj=new Small2();
		obj.display();
		obj.display1();
	}
}
Output:
sum of 10and20is :30
sum of 10,20and 40is :70
