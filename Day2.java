/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day2;

/**
 *
 * @author nidhi
 */
public class Day2 {

    
    public static void main(String[] args) {
        
        int n1=15;
        if(n1 % 2 ==0){
            System.out.println("No is Even");
        }
        else
            System.out.println("No is odd");
        
        char pass='A';
        
        switch(pass)
        {
            case 'A':
                //System.out.println("Adult pass: valid pass");
                //break;
                
            case 'S':
                //System.out.println("Student pass: valid pass");
                //break;
                
            case 'O':
                System.out.println("Valid pass");    // senior citizen pass
                break;
                
            default:
                System.out.println("invalid pass");
                break;
        }
        
        switch(10+20){
            case 10:
                System.out.println("value is 10");
                break;
                
            case 20:
                System.out.println("value is 20");
                break;
                
            case 30:
                System.out.println("value is adding");
                break;
                
            default:
                System.out.println("invalid value");
                break;
        }
        
        String province="ON";
        
        switch(province){
            case "ON":
                System.out.println("province is ontario");
                break;
                
            case "NV":
                System.out.println("province is Nova scotia");
                break;
                
            case "AB":
                System.out.println("province is Alberta");
                break;
                
                default:
                    System.out.println("not valid province");
                    break;
        }
        
        
        n1=20;
        while(n1>10 ){
            System.out.println("n1:"+n1);
            n1--;
            
        }
          
        do{
            System.out.println("n1:"+n1);
            n1--;
        }
        while(n1>10);
        {
        System.out.println("n1:"+n1);
    }
        
        for(int i=0;i<=5;i++){
            System.out.println("i:"+i);
        }
        
        int i=0;
         for( ; ; ){
             //if(i==3){
               //  continue;
             //}
             
            // else 
                 if(i<5){
                 
             
            System.out.println("i:"+i++);
             
        }
                
         else{
                 break;
             }
         }
         for(i=1;i<=5;i++)
         {
             if(i==3){
                 continue;
             }
             else{
                 System.out.println("i:" +i);
             }
         }
         
         for (i=1;i<=5;i++){      // for printing stars
             for(int j=1;j<=i;j++){
             System.out.print("* ");
             }
             System.out.println("");
         }
         
         for (i=1;i<=5;i++){ // for printing pyramid stars
             for(int space=5;space>i;space--){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
             System.out.print("* ");
             }
             System.out.println("");
         }
         
         for (i=5;i>=1;i--){ // for printing pyramid stars
             for(int space=5;space>i;space--){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
             System.out.print("* ");
             }
             System.out.println("");
         }
         
         System.out.println("");
         
        for (i=5;i>=1;i--){ // for printing pyramid stars
             for(int space=5;space>i;space--){
                 System.out.print(" ");
             }
             for(int j=1;j<=i;j++){
             System.out.print("* ");
             }
             System.out.println("");
         } 
         
        int numbers[]= new int[5];
        numbers[0]=10;
        System.out.println("number [0] : " + numbers[0]);
        
        for(i=0;i<5;i++){
            numbers[i]=(int)Math.pow((i+1),2);
            System.out.println("number ["+i+"] : " + numbers[i]);
        }
        
        for(i=0;i<numbers.length;i++){
            System.out.println("value " + (i+1) + ":" + ( numbers[i] *10));
        }
      
        for(int no: numbers){
            System.out.println("no: "+no);
        }
        
        int table[][] =new int[5][3];
        for(int row=0;row<5;row++){
            for(int col=0;col<3;col++){
                table[row][col]=row+col;
                System.out.print(table[row][col]+" ");
            }
            System.out.println(" ");
        }
        
    } 
        
}
