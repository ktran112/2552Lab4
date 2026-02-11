package ca.bcit.comp2522.lab4;

/**
 * Represents an immutable Book with a title, publication year, and author.
 *
 * @author Kiet Tran
 * @author EngEng Nay
 *
 * @version 1.0
 */
public class Book implements Comparable<Book>, Printable, Reversible {

    private static final int MAX_BOOK_LEN = 100;
    private static final int CURRENT_YEAR = Date.getCurrentYear();
    private static final int MINIMUM_YEAR = 1;

    private final String title;
    private final int yearPublished;
    private final Author author;


    /**
     * Constructs a Book with the specified title, publication year, and author.
     *
     * @param title         the title of the book; must not be null, blank,
     *                      or longer than MAX_BOOK_LEN
     * @param yearPublished the year the book was published; must be between
     *                      1 and the current year (inclusive)
     * @param author        the author of the book; must not be null
     *
     * @throws IllegalArgumentException if title is null, blank, or too long
     * @throws IllegalArgumentException if yearPublished is invalid
     * @throws IllegalArgumentException if author is null
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

    /**
     * Compares this book and another book.
     *
     * @param that the other Book Object to be compared
     *
     * @return Returns a positive number if this book's year published is younger than the other book.
     *         Returns a negative number if this book's year published is older than the other book.
     *         Returns 0 if publishing years are the same.
     */
    public final int compareTo(final Book that)
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
        System.out.println(this);
    }

    /**
     * Returns a string representation of this Book object.
     *
     * @return a formatted string containing the book's title,
     *         year published, and th
     */
    @Override
    public String toString()
    {
        return "\nTitle: " + this.title
                + "\nYear Published: " + this.yearPublished
                + "\nAuthor: " + this.author;
    }


    /**
     * Reverses the title of the book.
     * Implemented from the Reversible interface.
     */
    @Override
    public void backward()
    {
        final String reversed;
        final StringBuilder reverser;

        reverser = new StringBuilder(this.title);
        reversed = reverser.reverse().toString();

        System.out.println(reversed);
    }

    /**
     * Returns the title.
     *
     * @return The title string.
     */
    public final String getTitle() {
        return this.title;
    }

    /**
     * Returns the year published.
     *
     * @return The publication year.
     */
    public final int getYearPublished() {
        return this.yearPublished;
    }

    /**
     * Returns the Author object.
     *
     * @return The Author object.
     */
    public final Author getAuthor() {
        return this.author;
    }

    /*
     * A helper method to validate if the title is valid or not.
     *
     * @param title The title of the Book object
     */
    private static void validateTitle(final String title)
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
            throw new IllegalArgumentException("Title cannot exceed " + MAX_BOOK_LEN + " characters");
        }
    }

    /*
     * A helper method to validate if the publishing year is valid or not.
     *
     * @param yearPublished the year of publishing of the object
     */
    private static void validateYearPublished(final int yearPublished)
    {
        if (yearPublished > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Year cannot be greater than " + CURRENT_YEAR);
        }

        if (yearPublished < MINIMUM_YEAR)
        {
            throw new IllegalArgumentException(("Year cannot be lesser than " + MINIMUM_YEAR));
        }
    }

    /*
     * A helper method to validate if the author is valid or not.
     *
     * @param author The Author object
     */
    private static void validateAuthor(final Author author)
    {
        if (author == null)
        {
            throw new IllegalArgumentException("Author cannot be null");
        }
    }
}