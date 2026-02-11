package ca.bcit.comp2522.lab4;

/**
 * This class represents a Person with a date of birth,
 * name and date of death (optional).
 *
 * @author Kiet Tran
 * @author AngEng Nay
 * @version 1.0
 */
public class Person implements Comparable<Person>, Printable, Reversible
{
    private final Date dateOfBirth;
    private final Name name;

    private Date dateOfDeath;

    /**
     * Constructs a Person with a date of birth and name.
     * The date of death is initially set to null.
     *
     * @param dateOfBirth person's date of birth
     * @param name        person's name
     */
    public Person(final Date dateOfBirth,
                  final Name name)
    {

        validateDate(dateOfBirth);
        validateName(name);

        this.dateOfBirth = dateOfBirth;
        this.name = name;
        this.dateOfDeath = null;
    }

    /**
     * Sets the person's date of death.
     *
     * @param dateOfDeath the person's date of death
     */
    public void setDateOfDeath(final Date dateOfDeath)
    {
        if (dateOfDeath.compareTo(this.dateOfBirth) < 0)
        {
            throw new IllegalArgumentException(
                    "Death date: " + dateOfDeath +
                            " cannot be before birth date: " + dateOfBirth
            );
        }

        this.dateOfDeath = dateOfDeath;
    }

    /**
     * Determines whether the person is alive.
     *
     * @return true if the person is alive; otherwise false
     */
    public boolean isAlive()
    {
        return dateOfDeath == null;
    }

    /**
     * Compares this Person with another Person based on age.
     * An older person is considered greater than a younger person.
     *
     * @param other the Person to be compared
     * @return a positive integer if this person is older than the other,
     *         a negative integer if this person is younger than the other,
     *         or 0 if both persons are the same age
     */
    @Override
    public int compareTo(final Person other)
    {
        return this.dateOfBirth.compareTo(other.dateOfBirth);
    }

    /**
     * Displays the person's name, date of birth,
     * and date of death if applicable.
     */
    @Override
    public void display()
    {
        System.out.println(this);
    }

    /**
     * Returns a string representation of this Person object.
     *
     * @return a formatted string containing the person's name,
     *         date of birth, and date of death if applicable
     */
    @Override
    public String toString()
    {
        if (isAlive())
        {
            return name + " (Born: " + dateOfBirth + ")";
        }
        else
        {
            return name + " (Born: " + dateOfBirth
                    + ", Died: " + dateOfDeath + ")";
        }
    }

    /**
     * Prints the Person's full name backward.
     */
    @Override
    public void backward()
    {
        final StringBuilder reversedString;
        final String fullName;

        reversedString = new StringBuilder();
        reversedString.append(name.getFullName());
        reversedString.reverse();

        fullName = reversedString.toString();
        System.out.println(fullName);
    }

    /*
     * A helper method to validate if the date is valid or not.
     *
     * @param date the Date object
     */
    private static void validateDate(Date date)
    {
        if (date == null)
        {
            throw new IllegalArgumentException("Date cannot be null");
        }
    }

    /*
     * A helper method to validate if the name is valid or not.
     *
     * @param name the name object
     */
    private static void validateName(Name name)
    {
        if (name == null)
        {
            throw new IllegalArgumentException("Name cannot be null");
        }
    }
}
