//program to use user defined package
import Prime.PrimeCheck;
import java.util.*;
class IsPrime{
public static void main(String[] args){
	PrimeCheck obj=new PrimeCheck();
	int []list={2,3,5,7,9,11};
	for(int num:list){
		System.out.println(obj.check(num)+"");
	}
     }
}
