/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classactivityday4;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Bank 
{
    String Bankname;
    int BankID;
    Scanner sc=new Scanner(System.in);

    public Bank() 
    {
        Bankname="unknown";
        BankID=1;
    }
    
    public Bank(String Bankname, int BankID) 
    {
        this.Bankname = Bankname;
        this.BankID = BankID;
    }

    public void setBankname()
    {
        System.out.println("Enter Bank name : ");
        this.Bankname = sc.nextLine();
    }

    public String getBankname() 
    {
        return this.Bankname;
    }

    public void setBankID()
    {
       System.out.println("Enter BankID : ");
       this.BankID = Integer.parseInt(sc.nextLine());
    }
    
    
    public int getBankID() 
    {
        return this.BankID;
    }
    
    void data()
    {
        setBankname();
        setBankID();
    }
    
    @Override
    public String toString()
    {
        String data="Bank Name : " +Bankname+ " \n Bank Id : " +BankID;
        return data;
    }

    
    
}
