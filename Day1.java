/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

/**
 *
 * @author nidhi
 */
public class Day1 {

  
    public static void main(String[] args) {

        System.out.println("Hello Nidhi,Welcome Back");
        // TODO code application logic here
        int n1=10;
        float f1=10.5f;
        double d1=12.990876;
        short s1=12;
        char c1='a';
        String str1="Java";
        boolean b1=true;
        
        System.out.println("value of integer is " + n1);//ln
        System.out.println("value of float is " + f1);
        System.out.println("value of double is " + d1);
        System.out.println("value of short is " + s1);
        System.out.println("value of char is " + c1);
        System.out.println("value of string is " + str1);
        System.out.println("value of boolean is " + b1);
        n1*=20; //n1=n1*20
        System.out.println("value of n1 is " + n1);
        f1+=2;
        System.out.println("value of f1 is " + f1);
        d1-=6;
        System.out.println("value of d1 is " + d1);
        n1++; //n1=n1+1
        System.out.println("value of n1 is " + n1);
        ++n1;
        System.out.println("value of n1 is " + n1);
        n1--;
        System.out.println("value of n1 is " + n1);
        
        
        //n1=201
        
       int n2 = ++n1;
       System.out.println("value of n2 is " + n2);
       System.out.println("value of n1 is " + n1);
        
       System.out.println("value of n1 is " + (n1+10));
       
       System.out.println(n1+10+ "value of n1 is " );
       
       
       c1='A';
       //A-Z 65-90
       System.out.println("value of c1 is " + c1);
       
       System.out.println("value of c1 is " +(char) (c1+10));
       System.out.println("value of c1 is " +  ++c1);
         System.out.println("value of c1 is " +  c1++);
    }

}
