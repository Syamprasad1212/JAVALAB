//program to declare and implement array
import java.util.Scanner;
   class Arrays
    {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enetr elements:"+size);
			for(int i=0; i<size;i++)
			  {
				arr[i]= sc.nextInt();
			  }
			
			for(int i=0;i<size;i++)
			  {
				System.out.println("array is:"+arr[i]);
			  }
	}
    }			
