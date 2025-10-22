// Program to demonstrate runtime polymorphism
class SuperClass {
    void show() { 
System.out.println("Super show");
    }
}
class SubClass extends SuperClass {
    void show() { 
System.out.println("Sub show");
    }
}
class RuntimePolyDemo {
    public static void main(String[] args) {
        SuperClass s = new SubClass();
        s.show();
    }
}

Output:
Sub show
