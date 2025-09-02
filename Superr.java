// program to show the use of super keyword
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
	
	class Derive extends Top
	{
		Derive()
		{
			super();
			System.out.println("DERIVED CLASS CONSTRUCTOR");
		}
		void show()
		{
			System.out.println("DERIVED CLASS METHOD");
			super.display();
		}
	}
	
	

	class Superss
	{
			public static void main(String[] args)
			{
				Derive ob=new Derive();
					ob.show();
					
			}
	}
