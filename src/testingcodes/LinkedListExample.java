/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingcodes;
import java.util.*;
/**
 *
 * @author Lenovo
 */


    /**
     * @param args the command line arguments
     */
  

public class LinkedListExample {

   public static void main(String args[]) {
      LinkedList<String> linkedlist=new LinkedList<String>();
      linkedlist.add("Apple");
      linkedlist.add("Orange");
      linkedlist.add("Mango");

      /*for loop*/
      System.out.println("**For loop**");
      for(int num=0; num<linkedlist.size(); num++)
      {
    	  System.out.println(linkedlist.get(num));
      }

      /*Advanced for loop*/
      System.out.println("**Advanced For loop**");
      for(String str: linkedlist)
      {
    	  System.out.println(str);
      }

      /*Using Iterator*/
      System.out.println("**Iterator**");
      Iterator i = linkedlist.iterator();
      while (i.hasNext()) {
	  System.out.println(i.next());
      }

      /* Using While Loop*/
      System.out.println("**While Loop**");
      int num = 0;
      while (linkedlist.size() > num) {
	  System.out.println(linkedlist.get(num));
	  num++;
      }

   }
}
    

