import java.util.Scanner;
   class Binary
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
			 System.out.println("enter element to search");
			 int key=sc.nextInt();
			 int low=0,high=size-1;
			 boolean found=false;
			 while(low<=high)
			   {
			 	int mid=(low+high)/2;
			 	  if(arr[mid]==key)
			 	   {
			 	  	System.out.println("found:"+mid);
			 	  	found=true;
			 	  	break;
			 	   }
			 	  else if(arr[mid]<key)
			 	   {
			 	  	low=mid+1;
			 	   }
			 	  else
			 	   {
			 	  	high=mid-1;
			 	   }

			 	if(!found)
			 	   {
			         	 	System.out.println("Not Found");	
			 	   }
			 }	   
	}
   }			 	  
