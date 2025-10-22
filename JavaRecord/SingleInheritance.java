// Program to demonstrate single inheritance
class Mind
{
    void show()
    {
        System.out.println("Mind Class ");
    }
}
class Body extends Mind
{
    void display(){
        System.out.println("Body class");
    }
}
public class SingleInh
{
    public static void main(String[] args)
    {
        Body c=new Body();
        c.display();
        c.show();
    }
}
Output:
Body Class
Mind Class
