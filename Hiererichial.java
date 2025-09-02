// java program to implement  hierarchical inheritance
import java.util.*;
 class Top
  {
	Top()
	{
        	System.out.println("BASE CLASS CONSTRUCTOR");
	}
	void display()
	{
		System.out.println("BASE CLASS METHOD");
	}
				
   }
	
  class Derive1 extends Top
   {
	Derive1()
	{
		System.out.println("DERIVED CLASS1 CONSTRUCTOR");
	}
	void show1()
	{
		System.out.println("DERIVED CLASS1 METHOD");
	}
   }
 
  class Derive2 extends Top
   {
	Derive2()
	{
		System.out.println("DERIVED CLASS2 CONSTRUCTOR");
	}
	void show2()
	{
		System.out.println("DERIVED CLASS2 METHOD");
	}
   }

  class Hier
   {
	public static void main(String[] args)
	{
		Derive1 obj1=new Derive1();
		obj1.display();
		obj1.show1();
		Derive2 obj2=new Derive2();
		obj2.display();
		obj2.show2();
		
	}
   }
	
 
