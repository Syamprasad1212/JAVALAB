// Program to search an element using binary search (iterative)
import java.util.Arrays;
class BinarySearchDemo {
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid =( low + high) / 2;
            if (arr[mid] == key){
                return mid;
            }
            else if (arr[mid] < key){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
            return -1;
        }
        public static void main(String[] args) {
            int[] arr = {2, 4, 6, 8, 10, 12};
            int key = 8;
            System.out.println("Array: " + Arrays.toString(arr));
            int idx = binarySearch(arr, key);
            if (idx != -1){
                System.out.println("Element " + key + " found at index " + idx);
            }
            else{
                System.out.println("Element not found");
            }
        }
    }

Output:
Array: [2, 4, 6, 8, 10, 12]
Element 8 found at index 
