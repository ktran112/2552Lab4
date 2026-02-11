package ca.bcit.comp2522.lab4;

/**
 * Author yes.
 *
 * @author Kiet Tran
 * @author AngEng Nay
 * @version 1.0
 */
public class Author extends Person implements Printable
{
    private static final int MAX_GENRE_LENGTH = 30;
    private final String genre;

    public Author(final Date dateOfBirth,
                  final Name name,
                  final String genre)
    {
        super(dateOfBirth, name);
        validateGenre(genre);

        this.genre = genre;
    }

    /**
     *
     */
    @Override
    public void display()
    {
        System.out.println(this);
    }

    /**
     * Returns a string representation of this Author object.
     *
     * @return a formatted string containing the author's
     *         personal details and genre
     */
    @Override
    public String toString()
    {
        return super.toString() + ", Genre: " + genre;
    }


    /*
     * A helper method to validate if a genre is valid or not.
     *
     * @param genre the genre of the object
     */
    private static void validateGenre(final String genre) {
        if (genre == null || genre.isBlank()) {
            throw new IllegalArgumentException("Genre cannot be null or empty!");
        }

        if (genre.length() > MAX_GENRE_LENGTH) {
            throw new IllegalArgumentException("Genre cannot be longer than " + MAX_GENRE_LENGTH);
        }
    }
}
