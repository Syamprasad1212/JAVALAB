//java program to implement arraylist
import java.util.*;
import java.util.Collections;
 class Arraylistt
   {
      public static void main(String[] args)
        {
        	ArrayList<String> friends= new ArrayList<String>();
        	//adding elements to arraylist
        	friends.add("syam");
        	friends.add("ram");
        	friends.add("subba");
        	friends.add("surya");
        	friends.add("harish");
        	 for (int i = 0; i < friends.size(); i++)
        	  {
                System.out.println(friends.get(i));
             }
             friends.set(0,"kesava");
             //updating arraylist
             System.out.println("Arraylist after updating: syam->kesava");
             for (int i = 0; i < friends.size(); i++)
        	  {
                System.out.println(friends.get(i));
             }
             //removing elements
             friends.remove(1);
             System.out.println("After removed index 1 element :ram");
             for (int i = 0; i < friends.size(); i++)
        	  {
                System.out.println(friends.get(i));
             }
             //sorting Arraylist
             Collections.sort(friends);
             System.out.println("After sorting Arraylist:-");
             for (int i = 0; i < friends.size(); i++)
        	  {
                System.out.println(friends.get(i));
             }
        }
   }
