import java.util.Scanner;
public class first
{
	public static void main(String[] args)
	{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter number");
	     int num=sc.nextInt();
	        if(num<5)
	        {
	     	   System.out.println("num is lesser"+ num);
	        } 
	       else
	        {
	     	 System.out.println("num is greater"+ num);
	        }
	         sc.close();
           }
}

