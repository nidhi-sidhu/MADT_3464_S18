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
public class PermanentEmployee extends Employee
{
    String Qualification;
    float Salary;
    
    public PermanentEmployee()
    {
        super();
        this.Qualification="unknown";
        this.Salary=0.0f;
    }
    
    public PermanentEmployee(String name,String address,int age,String eID,String joiningDate,int deptNo,String qualification,float salary)
    {
       super(name,address,age,eID,joiningDate,deptNo);
       this.Qualification=qualification;
       this.Salary=salary;
    }
    
    public String tString()
    {
        return(super.toString()+" \n Qualification : "+ this.Qualification + "\n Salary : " + this.Salary);
    }
    
}
