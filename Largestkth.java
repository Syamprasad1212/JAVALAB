import java.util.*;

class Largestkth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of kth element to find:- ");
        int k = sc.nextInt();

        // Declare arr as an array of Integer objects
        Integer[] arr = {3, 5, 6, 4, 8}; 

        // Sort the array in reverse order
        Arrays.sort(arr, Collections.reverseOrder()); 

        // Print the k-th largest element (k-1 index)
        System.out.println(arr[k - 1]); 

        sc.close(); // Close the scanner
    }
}
