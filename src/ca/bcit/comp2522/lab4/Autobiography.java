package ca.bcit.comp2522.lab4;

/**
 * Represents an autobiography.
 *
 * @author Kiet Tran
 * @author EngEng Nay
 *
 * @version 1.0
 */
public class Autobiography extends Biography implements Printable
{

    public Autobiography(final String title,
                         final int yearPublished,
                         final Author author)
    {
        
        super(title, yearPublished, author, author);
    }

//    /**
//     *  Prints and displays the books information, as well as the author's information.
//     *  Implemented from the Printable interface.
//     */
//    @Override
//    public void display()
//    {
//        super.display();
//        System.out.println("\n");
//        super.getAuthor().display();
//    }

    /**
     * Displays the details of this Autobiography,
     * including book and author information.
     */
    @Override
    public void display()
    {
        System.out.println(this);
    }

    /**
     * Returns a string representation of this Autobiography.
     * Includes the book information and indicates that the
     * author and subject are the same person.
     *
     * @return a formatted string containing all Autobiography details
     */
    @Override
    public String toString()
    {
        return super.toString()
                + "\n(Note: This is an autobiography.)";
    }


}
