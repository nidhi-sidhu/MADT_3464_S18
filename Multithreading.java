/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author macstudent
 */
public class Multithreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Thread t1= Thread.currentThread();
        System.out.println("Current thread : " + t1);
        
        t1.setName("test Thread ");
        t1.setPriority(10);
        System.out.println(" Thread Info after modification : " + t1);
        System.out.println("State of thread t1 : " + t1.getState());
        
        System.out.println("Alive or dead : " + t1.isAlive());
        t1.getPriority();
        
        System.out.println("Daemon or non-daemon : " + t1.isDaemon());
        
        try{
            for(int i=1; i<=5; i++)
            {
                System.out.println("Main thread : " + i);
                new FirstThread();
                
                new SecondThread("Second cup");
                new SecondThread("Second innings");
                
                Thread.sleep(6000);
               // System.out.println("State after sleep : " + t1.getState());
            }
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
            
        }
        finally
        {
            System.out.println(" Exiting from main thread");
        }
           
    }
    
}
