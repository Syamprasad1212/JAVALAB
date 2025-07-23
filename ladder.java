import java.util.Scanner;
public class ladder
{
	public static void main(String[] args)
	{
	      Scanner m=new Scanner(System.in);
	      System.out.println("enter number");
	      int num=m.nextInt();
	         if (num<=100 && num>=75)
	         {
	      	    System.out.println("A GRADE:"+num);
	         }
	        else if(num<75 && num>=50)
	        {
	      	    System.out.println(" B GRADE:"+num);
	        }
	        else if(num>35 && num<50)
	        {
	      	    System.out.println("C GRADE:" +num);
                   }
	        else
	        {
	       	    System.out.println("fail:"+num);
	        }
	        m.close();
	}  
}  
