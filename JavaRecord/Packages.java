// Program to demonstrate creating and using a package
//  package mypkg is defined separately with class Hello
package mypkg;
public class Hello {
    public void show() {
        System.out.println("Hello from mypkg!”);
    }
}

// Program file that uses the package created above
import mypkg.Hello;
class PackageDemo {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.show();
    }
}

Output:
Hello from mypkg! 
