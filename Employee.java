/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day4;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Employee extends Person
{
    String eID;
    String joiningDate;
    int DeptNo;
    
    Scanner sc1=new Scanner(System.in);

    public Employee() 
    {
        super();
        this.eID = "E###";
        this.joiningDate = "DD MON YYYY";
        this.DeptNo = 0;
    }

    public Employee(String name,String address,int age,String eID, String joiningDate, int DeptNo)
    {
        super(name,address,age);
        this.eID = eID;
        this.joiningDate = joiningDate;
        this.DeptNo = DeptNo;
    }
    
    @Override
    public String toString()
    {
        
        String personaldetails=super.toString();
        String data="\n Employee Id : " + eID + " \n Joining Date : " + this.joiningDate + "\n Dept No : " + this.DeptNo;
        
        return personaldetails+data;
    }

    public void setID(String eID) 
    {
        this.eID = eID;
        System.out.println("Enter Employee Id:");
    }

    public String getID() 
    {
        return this.eID;
    }

    public void setJoiningDate(String joiningDate)
    {
        this.joiningDate = joiningDate;
    }

    public void setDeptNo(int DeptNo) 
    {
        this.DeptNo = DeptNo;
    }

    public int getDeptNo() 
    {
        return DeptNo;
    }

}
