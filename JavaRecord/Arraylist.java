// Program to demonstrate ArrayList and Vector
import java.util.ArrayList;
import java.util.Vector;
class ListDemoCollection {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        Vector<String> v = new Vector<>();
        al.add("S");
        al.add("Y");
        al.add("A");
        v.add("X");
        v.add("Y");
        System.out.println("ArrayList: " + al);
        System.out.println("Vector: " + v);
    }
}

Output:
ArrayList: [S, Y, A]
Vector: [X, Y]


