//program to perform multilevel inheritance
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
	
	
	class Derive2 extends Derive1
	{
		Derive2()
		{
			System.out.println("DERIVED CLASS 2 CONSTRUCTOR");
		}
		void show2()
		{
			System.out.println("DERIVED CLASS 2 METHOD");
		}
	}

	class Multilevel
		{
			public static void main(String[] args)
			{
				Derive2 ob=new Derive2();
					ob.display();
					ob.show1();
					ob.show2();
			}
		}
