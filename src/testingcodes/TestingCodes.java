/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingcodes;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class TestingCodes {

    /**
     * @param args the command line arguments
     */
  
public static void main(String [] args){
    HashMap<String,String>TelephoneBook = new HashMap<String,String>();
         TelephoneBook.put("SARA", "12345678");
  TelephoneBook.put("TARA", "6787348730");
  TelephoneBook.put("LARA", "678645730");
  TelephoneBook.put("MARA", "670967548730");
  TelephoneBook.put("KARA", "8765748730");
  
  Scanner scanrecord = new Scanner(System.in);
  System.out.print("Enter Name=");
  String name=scanrecord.next().toUpperCase();
    
  if(TelephoneBook.containsKey(name)) {
   System.out.println(name +" = "+TelephoneBook.get(name));
  }
  else{
      System.out.println("Not FOUND");
  }
}
}