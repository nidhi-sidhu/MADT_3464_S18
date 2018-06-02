/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author macstudent
 */
import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Person 
{
    String name;
    String address;
    int age;
    Scanner sc=new Scanner(System.in);
    
    //default constructor
    Person()
    {
        name= "unknown";
        address="unknown";
        age=1;
    }
    
    //parametrized constructor
    Person(String name,String address,Integer age)
    {
      this.name=name;
      this.address=address;
      this.age=age;
    }

    Person(Person anotherPerson) {
        this.name=anotherPerson.name;
        this.address=anotherPerson.address;
        this.age=anotherPerson.age;
    }
    
    void setName()
    {
        
        System.out.println("Enter name : ");
        this.name = sc.nextLine();
    }
    
    String getName()
    {
      return this.name;  
    }
     
   void setAddress()
   {
       System.out.println("Enter address:");
       this.address = sc.nextLine();
   }
   
   String getaddress()
   {
       return this.address;
      
   }
   
   void setAge()
   {
       System.out.println("Enter age : ");
       age = Integer.parseInt(sc.nextLine());
   }
   
   int getAge()
   {
      return age; 
   }
    
   void setData()
   {
       setName();
       setAddress();
       setAge();
   }
   
    @Override
   public String toString()
    {
        String data = "Name : " + name + "\n Address : " + address + "\n Age : " + age;
         return data;     
    }
}
