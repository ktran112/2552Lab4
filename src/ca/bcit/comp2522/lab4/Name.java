package ca.bcit.comp2522.lab4;

/**
 * Represents a person's name consisting of a first name and last name.
 * Implements the Printable interface to allow displaying the full name.
 *
 * @author Kiet Tran
 * @author EngEng Nay
 * @version 1.0
 */
public class Name implements Printable
{
    private static final int MAX_NAME_LENGTH = 50;

    private final String firstName;
    private final String lastName;

    /**
     * Constructs a Name object with the specified first and last names.
     *
     * @param firstName the person's first name
     * @param lastName the person's last name
     */
    public Name(final String firstName,
                final String lastName)
    {

        validateName(firstName);
        validateName(lastName);

        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Returns the person's first name.
     *
     * @return the person's first name
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * Returns the person's last name.
     *
     * @return the person's last name
     */
    public String getLastName()
    {
        return this.lastName;
    }

    /**
     * Returns the person's full name.
     *
     * @return the person's full name in "first last" format
     */
    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    /**
     * Displays the person's full name.
     */
    @Override
    public void display()
    {
        System.out.println(this);
    }

    /**
     * Returns the string representation of this Name Object.
     *
     * @return the Name's full name in "first last" format
     */
    @Override
    public String toString()
    {
        return "This person's name is: " + firstName + " " + lastName;
    }

    /*
     * A helper method to validate if a name is valid or not.
     *
     * @param name the name of the object
     */
    private static void validateName(final String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or empty!");
        }

        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("Name cannot be longer than " + MAX_NAME_LENGTH);
        }
    }

}
