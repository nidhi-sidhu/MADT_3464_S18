/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author macstudent
 */
public class Arithmetic 
{
    int num1=10;
    
    void addition()
    {
        System.out.println("addition:" +(num1+20));
        
    }
    
    int addition(int n1,int n2)
    {
        //System.out.println("sum: " + n1+ " and " + n2+ " is " + (n1+n2));
    
         return (n1+n2);
    }
    
    float addition(float n1,float n2)
    {
        return (n1+n2);
        
    }
    
    //void addition(int [] n1)
    //{
        //int sum1=0;
        //for(int i=0; i<n1.length;i++)
        //{
          //  sum1 +=n1[i];
       // }
    //System.out.println(" sum is" + sum1);
   // }
    
    void addition(int... numbers) // method overloading
    {
        int sum=0;
        for(int no:numbers)
        {
            sum+=no;
        }
        System.out.println("sum = " + sum);
    }
    
    
}
