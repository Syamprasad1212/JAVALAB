// Program to demonstrate isAlive() and join()
class JoinDemo extends Thread {
    public void run() {
        try { 
Thread.sleep(1000);
    	System.out.println("Child finished");
    }
    catch (InterruptedException e) { }
    }
    public static void main(String[] args) {
        JoinDemo t = new JoinDemo();
        System.out.println("Before start: " + t.isAlive());
        t.start();
        try {
 t.join();
         }
        catch (InterruptedException e) { }
        System.out.println("After join: " + t.isAlive());
    }
}

Output:
Before start: false
Child finished
After join: false
