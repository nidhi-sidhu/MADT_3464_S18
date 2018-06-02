/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

/**
 *
 * @author nidhi
 */
public class Day4 {

    
    public static void main(String args[]) 
    {
        // TODO code application logic here
    
        Employee emp1=new Employee("Rutvi","Address",22,"E101","12 May 2017",10);
//        emp1.name="Rutvi";
//        emp1.address="Toronto";
//        emp1.age=22;
        //System.out.println("Name : " + emp1.name + "\n Address : " + emp1.address + "\n Age : " + emp1.age);
        //System.out.println(emp1.toString());
        
        TemporaryEmployee tempemp=new TemporaryEmployee("nidhi","Brampton",22,"t123","01 may 2018",20,"android developer",80.50f);
        System.out.println(tempemp.toString());
        
        PermanentEmployee peremp=new PermanentEmployee("Ayush","Toronto",24,"t561","04 april 2018",2, "software developer",50000.0f);
        System.out.println(peremp.tString());
        
    }
    
}
