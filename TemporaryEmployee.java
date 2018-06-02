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
public class TemporaryEmployee extends Employee
{
    String designation;
    float hourlyRate;
    
    public TemporaryEmployee()
    {
        super();
        this.designation="unknown";
        this.hourlyRate=0.0f;
    }
    
    public TemporaryEmployee(String name,String address,int age,String eID,String joiningDate,int deptNo,String Designation,float hourlyRate)
    {
        super(name,address,age,eID,joiningDate,deptNo);
        this.designation= Designation;
        this.hourlyRate=hourlyRate;
    }
    
    public String toString()
    {
        return(super.toString()+ "\n Designation : " + this.designation+ " \n hourlyRate : " + this.hourlyRate);
    }
}
