// Program to demonstrate multiple inheritance using interfaces
interface Syam { 
void a();
 }
interface Mani {
 void b();
 }
class MultiImpl implements Syam, Mani {
    public void a() {
 System.out.println("Method Syam");
    }
    public void b() { 
System.out.println("Method Mani");
    }
    public static void main(String[] args) {
        MultiImpl m = new MultiImpl();
        m.a();
        m.b();
    }
}

Output:
Method Syan
Method Mani
