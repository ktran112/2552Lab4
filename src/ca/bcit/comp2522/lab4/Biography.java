package ca.bcit.comp2522.lab4;

import java.util.Objects;

public class Biography extends Book implements Printable {

    private Person subject;


    /**
     * Constructs a biography using the data from the Book class, as well as a subject.
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

        this.subject = subject;
    }


    private void validateSubject(final Person subject)
    {
        if (subject == null)
        {
            throw new IllegalArgumentException("Subject cannot be null.");
        }
    }


    /**
     * Checks for equality between this biography and an object.
     * @param o   the reference object with which to compare.
     * @return
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

        Biography that;
        that = (Biography) o;

        return Objects.equals(this.subject,
                that.subject);
    }


    /**
     * Returns a hash code for this biography.
     * @return
     */
    @Override
    public final int hashCode()
    {
        return Objects.hashCode(this.subject);
    }


    /**
     *  Prints and displays the books information, as well as the subject.
     *  Implemented from the Printable interface.
     */
    @Override
    public void display()
    {
        return super.print()
                + "\nSubject: " + this.subject.toString();
    }

}



