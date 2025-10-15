//program to use formatter and random cls
import java.util.Formatter;
import java.util.Random;
class Formatt{
	public static void main(String[] args){
		Formatter f=new Formatter();
		Random r=new Random();
		for(int i=0;i<5;i++){
			f.format("%d",r.nextInt(100));
			}
			System.out.println("Random numbers:"+f.toString());
			f.close();
		}
}
