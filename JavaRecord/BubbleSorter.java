// Program to perform Bubble Sort on an array
import java.util.*;

class BubbleSorter {
    static void sortArray(int[] numbers) {
        int size = numbers.length;
        boolean swapped;
        for (int i = 0; i < size - 1; i++) {
            swapped = false;
            for (int j = 0; j < size - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swapping elements
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swapped = true;
                }
            }
            // optimization: stop if already sorted
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] data = {45, 12, 78, 34, 23, 89, 5};

        System.out.println("Array before sorting : " + Arrays.toString(data));
        sortArray(data);
        System.out.println("Array after sorting  : " + Arrays.toString(data));
    }
}
Output:
Array before sorting : [45, 12, 78, 34, 23, 89, 5]
Array after sorting  : [5, 12, 23, 34, 45, 78, 89]
