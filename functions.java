//program to implement copyOf() function
import java.util.Arrays;
class Array{
	public static void main(String[] args)
	 {
		int[] arr={2,4,8,5,6};
		int[] array=new int[5];
		int[] newarr=Arrays.copyOf(arr,4);
		    System.out.println("orginal array:-"+Arrays.toString(arr));
		    //Arrays.copyOf
		    System.out.println("Arrays.copyOf():-"+Arrays.toString(newarr));
		    System.arraycopy(arr,0,array,0,2);
			  //arraycopy
				System.out.println("arraycopy():-"+Arrays.toString(array));
				//clonearray
				int[] clonearr=arr.clone();
				System.out.println("array clone():-"+Arrays.toString(clonearr));
				//sort
				Arrays.sort(arr);
				System.out.println("orginal array sorted:-"+Arrays.toString(arr));
				//binary search
				System.out.println("binary search:-"+Arrays.binarySearch(arr,5));
				//fill
				int fillarr[]={1,2,3,4,5};
				Arrays.fill(fillarr,8);
				System.out.println("fill():-"+Arrays.toString(fillarr));
				System.out.println("Methods in java done:");
	 }
}
