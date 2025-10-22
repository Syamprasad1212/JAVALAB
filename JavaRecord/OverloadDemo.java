// Program to demonstrate method overloading
class OverloadDemo {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        OverloadDemo od = new OverloadDemo();
        System.out.println(od.add(3,2));
        System.out.println(od.add(3.5, 4.1));
        System.out.println(od.add(1, 3, 2));
    }
}

Output:
5
7.6
6
