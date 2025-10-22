//java program to demonstrate the concept of interface
import java.util.*;
interface Read
{
        public void Take();
        public void add();
        public void sub();
}
class A implements Read
{
        int a,b;
        public void Take()
        {
                Scanner sc=new Scanner(System.in);
                System.out.println("eter a,b values");
                 a=sc.nextInt();
                 b=sc.nextInt();
        }
        public void add()
        {
                System.out.println("add of a,b: "+(a+b));
        }
        public void sub()
        {
                System.out.println("sub of a,b: "+(a-b));
        }
}
class Interface
{
        public static void main(String[] args)
        {
                A obj =new A();
                obj.Take();
                obj.add();
                obj.sub();
        }
}


Output:
eter a,b values
20
20
add of a,b: 40
sub of a,b: 0
