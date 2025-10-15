class DaemonnDemo  extends Thread{
	public void run(){
		try{
			  while(true){
			  	System.out.println("Daemonn Thread");
			  	Thread.sleep(500);
			  }		
		}
		catch(InterruptedException e){}
	}
}
class Daemonn{
	public static void main(String[] args)
		throws InterruptedException{
		DaemonnDemo d=new DaemonnDemo();
		d.setDaemon(true);
		d.start();
		Thread.sleep(1000);
		System.out.println("main thread exiting");
		
	}
}
