//program to use wrapper classes 
import java.util.*;
public class Wrapper{
	public static void main(String[] args){
		int a=10;
		Integer obj=a;//boxing
		System.out.println("autoboxing the primitive type to obj:"+obj);
		int b=obj;
		System.out.println("Unboxing the primtive type:"+b);
	}
}
