package ca.bcit.comp2522.lab4;

public class Book implements Comparable<Book>, Printable, Reversible {

    private static int MAX_BOOK_LEN = 100;
    private static int CURRENT_YEAR = Date.getCurrentYear();
    private static int MINIMUM_YEAR = 1;

    private String title;
    private int yearPublished;
    private Author author;


    /**
     * Constructs a book with a title, year of publishing, and author.
     * @param title
     * @param yearPublished
     * @param author
     */
    public Book(final String title,
                final int yearPublished,
                final Author author)
    {
        validateTitle(title);
        validateYearPublished(yearPublished);
        validateAuthor(author);

        this.title = title;
        this.yearPublished = yearPublished;
        this.author = author;
    }


    private void validateTitle(final String title)
    {
        if (title == null)
        {
            throw new IllegalArgumentException("Title cannot be null");
        }

        if (title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be blank.");
        }

        if(title.length() > MAX_BOOK_LEN)
        {
            throw new IllegalArgumentException("Title cannot exceed 100 characters");
        }
    }


    private void validateYearPublished(final int yearPublished)
    {
        if (yearPublished > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Year cannot be greater than current year");
        }

        if (yearPublished < MINIMUM_YEAR)
        {
            throw new IllegalArgumentException(("Year cannot be lesser than 1 A.D."));
        }
    }


    private void validateAuthor(final Author author)
    {
        if (author == null)
        {
            throw new IllegalArgumentException("Author cannot be null");
        }
    }


    /**
     * Compares this book and another book.
     * @param that
     * @return Returns a positive number if this book's year published is older than the other book.
     *         Returns a negative number if this book's year published is younger than the other book.
     *         Returns 0 if publishing years are the same.
     */
    public final int compareTo(Book that)
    {
        return Integer.compare(this.yearPublished,
                that.yearPublished);
    }

    /**
     *  Prints and displays the books information.
     *  Implemented from the Printable interface.
     */
    @Override
    public void display()
    {
        System.out.println("\nTitle: " + this.title
                + "\nYear Published: " + this.yearPublished
                + "\nAuthor: " + this.author);
    }


    /**
     * Reverses the title of the book.
     * Implemented from the Reversible interface.
     */
    @Override
    public final void reverse()
    {
        final String reversed;
        final StringBuilder reverser;
        reverser = new StringBuilder(this.title);
        reversed = reverser.reverse().toString();

        System.out.println(reversed);
    }

    /**
     * Gets the title.
     * @return The title string.
     */
    public final String getTitle() {
        return this.title;
    }

    /**
     * Gets the year published.
     * @return The publication year.
     */
    public final int getYearPublished() {
        return this.yearPublished;
    }

    /**
     * Gets the author.
     * @return The Author object.
     */
    public final Author getAuthor() {
        return this.author;
    }

    /**
     * Sets the title.
     * @param title The title string to set.
     */
    public final void setTitle(final String title) {
        this.title = title;
    }

    /**
     * Sets the year published.
     * @param yearPublished The publication year to set.
     */
    public final void setYearPublished(final int yearPublished) {
        this.yearPublished = yearPublished;
    }

    /**
     * Sets the author.
     * @param author The Author object to set.
     */
    public final void setAuthor(final Author author) {
        this.author = author;
    }

}
