/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classactivityday4;

/**
 *
 * @author macstudent
 */
public class ClassActivityDay4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Bank b=new Bank();
        b.data();
        System.out.println(b.toString());
        
        BankAccount ba=new BankAccount();
        ba.data();
        System.out.println(ba.toString());
        
    }
    
}
