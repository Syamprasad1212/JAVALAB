// Program to find the roots of a quadratic equation
import java.util.Scanner;
class QuadraticRoots {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficients a, b, and c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Roots are real and distinct: " + r1 + ", " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are real and equal: " + r);
        } else {
            double real = -b / (2 * a);
            double imag = Math.sqrt(-d) / (2 * a);
            System.out.println("Roots are complex: " + real + " ± " + imag + "i");
        }
    }
}

Output:
Enter coefficients a, b, and c: 1 5 6
Roots are real and distinct: -2.0, -3.0
