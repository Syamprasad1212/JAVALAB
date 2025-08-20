//program to perfoem ragged arrays
import java.util.Scanner;
import java.util.Arrays;
class Ragg
{
    public static void main(String[] args)
    {
        int[][] raggedarr=new int[3][];
        raggedarr[0]=new int[1];
        raggedarr[1]=new int[3];
        raggedarr[2]=new int[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<raggedarr.length;i++)
        {
         System.out.println("enter ele");
            for(int j=0;j<raggedarr[i].length;j++)
            {
                raggedarr[i][j]=sc.nextInt();
            }
        }
        	for(int i=0;i<raggedarr.length;i++)
        	{
        		System.out.print("array is:");
        	  for(int j=0;j<raggedarr[i].length;j++)
        	  {
        		System.out.print(raggedarr[i][j]);
        	  }
        	       System.out.println("  ");
        	}
        
        
    }
}
