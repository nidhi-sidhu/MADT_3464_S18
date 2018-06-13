/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 * Demonstrating the concept of Generics
 * @author Nidhi
 * @version 1.0
 * @since 13 Jun 2018
 */
public class Generics 
{
    /**
     * Printing list of elements
     * @param <E> Indicates the generic type
     * @param inputArray list of elements to be printed
     * @return  no return value
     */
    public static <E> void printArray(E[] inputArray)
    {
        for(E element : inputArray)
        {
            System.out.printf("%s,", element);
        }
        System.out.println();
    }
    
    //determines the largest of three comparable objects
    /**
     * 
     * @param <T> Generic type
     * @param x first Value
     * @param y second value
     * @param z third value
     * @return returns maximum of three elements
     */
    
    public static <T extends Comparable<T>> T maximum(T x,T y,T z)
    {
        T max= x; // assume x is initially the largest
    
        if(y.compareTo(max) > 0)
        {
            max = y; //y is the largestso far
         }
    
        if(z.compareTo(max) > 0)
        {
             max = z;
        }
            return max;
    }
    
    /**
     * 
     * @param args Command line arguments
     * @return no return value
     */

    public static void main(String[] args)
    {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        System.out.printf("Integer value : %d \n " , integerBox.get());
        
        Box<String> stringBox =  new Box<String>();
        stringBox.set(new String("Hello world"));
        System.out.printf("String Value : %s\n\n" , stringBox.get());
        
        Integer[] intArray = {1,2,3,4,5};
    System.out.println("Array integerArray contains : ");
    printArray(intArray);  //pass an integer array
    
    Double[] doubleArray ={1.1,2.2,3.3,4.4};
    System.out.println("\n Array doubleArray contins : ");
    printArray(doubleArray); // pass a double array
    
    Character[] charArray = {'H','E','L','L','O'};
    System.out.println("\n Array characterArray contins : ");
    printArray(charArray); // pass a character Array
    
    //test Generic method maximum
    
        System.out.printf(" Max of %d, %d and %d is %d\n\n"
                            ,3,4,5, maximum(3,4,5));
        
         System.out.printf(" Max of %.1f, %.1f and %.1f is %.1f\n\n"
                            ,6.6,7.7,8.8, maximum(6.6,8.8,7.7));
         
          System.out.printf(" Max of %s, %s and %s is %s\n",
                            "pear","apple","orange", maximum("pear","apple","orange"));
        
    }
    
     
    
}
