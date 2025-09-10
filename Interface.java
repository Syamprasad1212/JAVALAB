//java program to implement interfaces
import java.io.*; 
interface Add
{
	int add(int a,int b);
}

interface Sub
{
	int sub(int a, int b);
}

class A implements Add , Sub
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
}

class Interfacee
{
	public static void main(String[] args)
	{	
		A obj=new A();
		System.out.println("Addition of A and B:"+obj.add(2,1));
		System.out.println("Subtraction of A and B "+obj.sub(3,1));
	}
}
