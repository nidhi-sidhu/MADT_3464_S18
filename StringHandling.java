/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day5;

/**
 *
 * @author macstudent
 */
public class StringHandling
{
    public static void main(String args[])
    {
        String str1="Test";
        String str2=new String("Java");
        
        System.out.println("str1 : " + str1);
        System.out.println("str2 : " + str2);
        
        String str3 = str1 + str2;
        str3 = str2.concat(str1);
        
        System.out.println("str3 : " + str3);
        
        int len = str2.length();
        System.out.println("len : " + len);
        
        str2 = "test String";
        for(int i=0;i<=str2.length()-1;i+=2)
        {
            //System.out.print("i : " + i);
            System.out.print(str2.charAt(i) + " ");
        }
        System.out.println("");
        
        
        for(int i=str2.length()-1;i>=0;i--)
        {
           //System.out.print("i : " + i);
            System.out.print(str2.charAt(i) + " "); 
        }
        
        System.out.println(""); 
        str2="Java";
        str3="java";
        
        //if(str2.equals(str3))
        if(str2.equalsIgnoreCase(str3))
        {
            System.out.println("equal strings");
        }
        else
            System.out.println("different strings");
        
        
        str2="Java";
        str3="Jbva";
        System.out.println(str2.compareToIgnoreCase(str3));
        
        System.out.println(str2.endsWith("vb"));
        
        str2="this is a test string";
        int p;
        p=str2.indexOf('i');
        
        p=str2.indexOf("test");
        
        p=str2.indexOf('i',4);
        
        p=str2.lastIndexOf('i');
       
        System.out.println("p : " + p);
        
        System.out.println(str2.replace('i', '$'));
        
        str2="this is a test string";
        
        int wordcount=0;
        for(int i=0;i<str2.length();i++)
        {
            if(Character.isWhitespace(str2.charAt(i)))
                    {
                       wordcount++; 
                    }
            
        }
        System.out.println("wordcount : " + wordcount++);
        System.out.println();
        
        StringBuffer str4= new StringBuffer("Hello there");
        int len1=str4.length();
        
        System.out.println("str4 : " + str4);
        str4.append(" good afternoon");
        
        str4.setCharAt(1, '&');
        
        str4.insert(4,"@@@");
        System.out.println("str4 : " + str4);
        
        //str4=()"this is a boring class";
        System.out.println(str4.reverse());
        
//        String s = " this is a test ";
//        //String[] split=s.split(" ");
//        String result = "";
////        for(int i = split.length-1;i>=0;i--)
////        {
////            result += (split[i] + " ");    
////        }
//        System.out.println(result.trim());

//            String s=" This is a test";
//            String result="";
//            String[] words = s.split(" ");
//            for(int i=words.length-1;i>=0;i--)
//            {
//                result =result + words[i] + " ";
//            }
//            System.out.println(result);
//        

                String sentence=" This is a test";
                String[] sentencewords= sentence.split(" ");
                StringBuffer reverse=new StringBuffer();
                
                for(int i=sentencewords.length-1;i>=0;i--)
                {
                    reverse.append(sentencewords[i] + " ");
                }
                
                System.out.println(reverse.toString());
            
    }
    
}
