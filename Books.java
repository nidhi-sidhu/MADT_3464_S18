/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylisttest;

import java.util.Comparator;

/**
 *
 * @author macstudent
 */
public class Books
{
    int bookID;
    String bookTitle;
    int bookRating;

    public Books() 
    {
        this.bookID=0;
        this.bookTitle="unknown";
        this.bookRating=0;
    }

    public Books(int bookID, String bookTitle, int bookRating) {
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.bookRating = bookRating;
    }
    
    public void setID(int ID) 
    {
        this.bookID = bookID;
    }
    
    public int getID() 
    {
        return this.bookID;
    }
    
    public void setBookTitle(String bookTitle)
    {
        this.bookTitle = bookTitle;
    }
   
    public String getBookTitle() 
    {
        return this.bookTitle;
    }

    public void setBookRating(int bookRating)
    {
        this.bookRating = bookRating;
    }
    
    public int getBookRating()
    {
        return this.bookRating;
    }

    void displayInfo()
    {
        System.out.println("BookID : " + this.bookID
         + " \n Book Title : " + this.bookTitle + 
                " \n Book Rating : " + this.bookRating);
    }
}

class bookTitleComparator implements Comparator<Books>
{

    @Override
    public int compare(Books o1, Books o2)
    {
        return o1.bookTitle.compareToIgnoreCase(o2.bookTitle);
    }
        
    
}

class bookRatingComparator implements Comparator<Books>
{

    @Override
    public int compare(Books o1, Books o2) 
    {
        if (o1.bookRating == o2.bookRating)
            return 0;
        else if (o1.bookRating < o2.bookRating)
            return 1;
        else
            return -1;
     }
        
    
}
