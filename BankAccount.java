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
public class BankAccount extends Bank
{
    int accountNumber;
    String OwnerName;
    float Amount;
    float Withdrawamount;
    float DepositAmount;
    Scanner sc1=new Scanner(System.in);
    
    public BankAccount() 
    {
        super();
        this.accountNumber=111;
        this.OwnerName="unknown";
        this.Amount=0.0f;
        this.Withdrawamount=0.0f;
        this.DepositAmount=0.0f;
    }
   
    public BankAccount(String Bankname,int BankID,int accountNumber, String OwnerName, float Amount,float withdrawAmount,float depositAmount ) 
    {
        super(Bankname,BankID);
        this.accountNumber = accountNumber;
        this.OwnerName = OwnerName;
        this.Amount = Amount;
        this.Withdrawamount=withdrawAmount;
        this.DepositAmount=depositAmount;
    }

     public void setAccountNumber()
    {
        System.out.println("Enter Account Number : ");
        this.accountNumber= Integer.parseInt(sc1.nextLine());
    }
     
     public int getaccountNumber()
     {
         return this.accountNumber;
     }
     
    public void setOwnerName()
    {
        System.out.println("Enter owner Name : ");
        this.OwnerName= sc1.nextLine();
    }
    
    public String getOwnername()
     {
         return this.OwnerName;
     }
    
     public void setAmount()
    {
        System.out.println("Enter Amount: ");
        this.Amount= Float.parseFloat(sc1.nextLine());
    }
     
     public float getAmount()
     {
         return this.Amount;
     }
     
      public void setWithdrawAmount()
    {
        System.out.println("Enter WithdrawAmount: ");
        this.Withdrawamount= Float.parseFloat(sc1.nextLine());
    }
     
      void data()
    {
        setAccountNumber();
        setOwnerName();
        setAmount();
        setWithdrawAmount();
    }
    
    @Override
    public String toString()
    {
        String data="\n Account number : " +accountNumber+ " \n Owner Name : " +OwnerName+ " \n avialiable Amount :" +Amount+ "\n Enter withdraw Amount" +Withdrawamount;
        return data;
    }
    
//    public int withdraw()
//    {
//        if(balanceAmount>)
//        
//    }
    
   
    
    
}
