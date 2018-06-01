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
public class PersonTest 
{
    public static void main(String args[])
    {
        Person sumanth = new Person();
        sumanth.name="Nidhi";
        sumanth.address="Toronto";
        sumanth.age=23;
        
        System.out.println("Name : " + sumanth.name + "\n Address : " + sumanth.address + "\n Age : " + sumanth.age);
    
    
//    Person foram=new Person();
//    foram.setName();
//    String nm=foram.getName();
//    
//    foram.setAddress();
//    String ad=foram.getaddress();
//    
//    foram.setAge();
//    int age=foram.getAge();
//    
//   System.out.println("Name : " + nm + "\n Address : " + ad + "\n Age : " + foram.age);
//    
//   Person anu = new Person();
//   anu.setData();
//   System.out.println(anu.toString());
   
        Person aman = new Person();
        System.out.println(aman.toString());
        
        Person rimpal = new Person("Rimpal","Brampton",20);
        System.out.println(rimpal.toString());
        
        Person rimpal2=new Person(rimpal);
        System.out.println(rimpal2.toString());
    }
    
}
