//program to perfoem ragged arrays
import java.util.Scanner;
import java.util.Arrays;
class Ragg
{
    public static void main(String[] args)
    {
        int[][] raggedarr=new int[5][];
        raggedarr[0]=new int[1];
        raggedarr[1]=new int[7];
        raggedarr[2]=new int[8];
        raggedarr[3]=new int[7];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<raggedarr.length;i++)
        {
            for(int j=0;j<raggedarr.length;j++)
            {
                System.out.println("enter ele");
                raggedarr[i][j]=sc.nextInt();
            }
        }
        System.out.println("ragged arrays:-"+Arrays.toString(raggedarr));
        
        
    }
}
