package ca.bcit.comp2522.lab4;

public class Autobiography extends Biography implements Printable
{

    public Autobiography(final String title,
                         final int yearPublished,
                         final Author author,
                         final Person subject)
    {
        super(title, yearPublished, author, author.person);
    }


    /**
     *  Prints and displays the books information, as well as the author's information.
     *  Implemented from the Printable interface.
     */
    @Override
    public void display()
    {
        System.out.println(super.print()
                            + "\n"
                            + super.getAuthor().print());
    }

}
