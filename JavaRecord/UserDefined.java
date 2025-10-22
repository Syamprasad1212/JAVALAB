// Program to demonstrate a user-defined exception

class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

class UserDefinedExceptionDemo {
    public static void checkAge(int age) throws AgeException {
        if (age < 18)
            throw new AgeException("Age must be 18 or above to proceed.");
        else
            System.out.println("Age is valid. You are eligible.");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } 
        catch (AgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
} 

Output:
Caught Exception: Age must be 18 or above to proceed.
