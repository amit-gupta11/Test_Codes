/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingcodes;

/**
 *
 * @author Lenovo
 */
class Table{  
 synchronized void printTable(int n){//synchronized method  
   for(int i=1;i<=5;i++){  
     System.out.println(n*i);  
     try{  
      Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  
  
class MyThread1 extends Thread{  
Table t;  
MyThread1(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(5);  
}  
  
}  
class MyThread2 extends Thread{  
Table t;  
MyThread2(Table t){  
this.t=t;  
}  
public void run(){  
t.printTable(100);  
}  
}  
  
public class Sync{  
public static void main(String args[]){  
Table obj = new Table();//only one object  
MyThread1 test1=new MyThread1(obj);  
MyThread2 test2=new MyThread2(obj);  
test1.start();  
test2.start();  
}  
} 
