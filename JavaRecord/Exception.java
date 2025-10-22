// Program to demonstrate exception handling
class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught: " + e);
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}

Output:
Caught: java.lang.ArithmeticException: / by zero
Finally block executed

