//java program to implement abstract classes
import java.util.*;
abstract class Abstracttt
{
	abstract void printInfo();
}
class b extends Abstractt
{
	void printInfo()
	{	
		String name="syam";
		int age=19;
		System.out.println("name is "+name);
		System.out.println("age is :"+age);
	}
}

class Abstractt
{
	public static void main(String[] args)
	{
		b obj=new b();
		obj.printInfo();
	}
}
