package ca.bcit.comp2522.lab4;

import java.util.Objects;

/**
 * Represents a biography.
 *
 * @author Kiet Tran
 * @author EngEng Nay
 *
 * @version 1.0
 */
public class Biography extends Book implements Printable {

    private final Person subject;


    /**
     * Constructs a biography using the data from the Book class, as well as a subject.
     *
     * @param title
     * @param yearPublished
     * @param author
     * @param subject
     */
    public Biography(final String title,
                     final int yearPublished,
                     final Author author,
                     final Person subject)
    {
        super(title, yearPublished, author);

        validateSubject(subject);

        this.subject = subject;
    }

    /*
     * A helper method to validate if a subject is valid or not.
     *
     * @param subject the subject of the object
     */
    private static void validateSubject(final Person subject)
    {
        if (subject == null)
        {
            throw new IllegalArgumentException("Subject cannot be null.");
        }
    }


    /**
     * Checks for equality between this biography and an object.
     *
     * @param o   the reference object with which to compare.
     *
     * @return True if objects equal each other, false if otherwise
     */
    @Override
    public final boolean equals(final Object o) {
        if (this == o)  // Pointing to same address, therefore must be equal
        {
            return true;
        }

        if (!(o instanceof Biography)) {
            return false;
        }

        final Biography that;
        that = (Biography) o;

        return Objects.equals(this.subject,
                that.subject);
    }


    /**
     * Returns a hash code for this biography.
     * @return The hash code
     */
    @Override
    public final int hashCode()
    {
        return Objects.hashCode(this.subject);
    }


    /**
     * Displays the details of this Biography.
     * Prints all inherited Book attributes along with
     * the subject of the biography in a formatted output.
     */
    @Override
    public void display()
    {
        System.out.println(this);
    }

    /**
     * Returns a string representation of this Biography object.
     * Includes the book's title, year published, author,
     * and the subject of the biography.
     *
     * @return a formatted string containing all Biography details
     */
    @Override
    public String toString()
    {
        return super.toString()
                + "\nSubject: " + subject;
    }


}



