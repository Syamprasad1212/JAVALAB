// Program to demonstrate multiple catch blocks
class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {1,2,3};
            System.out.println(arr[5]);
            int a = 10 / Integer.parseInt("0");
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }
}

Output:
ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
