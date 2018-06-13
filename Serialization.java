/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author macstudent
 */
public class Serialization 
{
    /**
     * 
     * @param args command line arguments
     * @return no return value
     * @exception IOexception while trying to read or write from the file
     * @exception  ClassNotFoundException while retriving object from file
     * @see IOException
     * @see ClassNotFoundException
     */
    public static void main(String[] args) 
    {
        Employee emp = new Employee();
        emp.name = "Ashley";
        emp.address = "Vancouver";
        emp.SSN = 444444;
        emp.number = 101;
        
        //serialization
        try
        {
            FileOutputStream fileout = new FileOutputStream("Employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(emp);
            
            out.close();
            fileout.close();
            
            System.out.println("Serialized data is saved as employee.txt");
            
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        
        //deserialization
        
        Employee e = null;
        
        try
        {
            FileInputStream fileIn = new FileInputStream("Employee.txt");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        }
        
        catch(IOException i)
        {
             i.printStackTrace();
             return;
        }
        catch(ClassNotFoundException c)
        {
            System.out.println("\n Employee class not found");
            c.printStackTrace();
            return;
        }
        
        System.out.println("\n ....Deserialized Employee....");
        System.out.println("Name : " + e.name);
        System.out.println("Address : " + e.address);
        System.out.println("SSN : " + e.SSN);
        System.out.println("Number : " + e.number);
        
        
    }
    
}
