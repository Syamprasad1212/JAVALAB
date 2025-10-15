//program to execute Alive code 
class Alivee extends Thread{
    public void run(){
	try{
		    	Thread.sleep(1500);
		    	System.out.println("Thread finished...");
	   }
	   catch(Exception e){}
	}
}
public class Alive{
	public static void main(String[] args)
		throws InterruptedException{
			Alivee a=new Alivee();
			System.out.println("Before starting thread:-"+a.isAlive());
			a.start();
			System.out.println("After starting thread:-"+a.isAlive());
			a.join();
			System.out.println("after join method:-"+a.isAlive());
		}
	}
