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
        /* Variables for storing the year of Person Objects were born. */
        final int thisPersonYear;
        final int otherPersonYear;
        final int yearCompare;

        thisPersonYear = this.dateOfBirth.getYear();
        otherPersonYear = other.dateOfBirth.getYear();
        yearCompare = Integer.compare(otherPersonYear, thisPersonYear);

        if (yearCompare != 0)
        {
            return yearCompare;
        }

        /* Variables for storing the month of Person Objects were born. */
        final int thisPersonMonth;
        final int otherPersonMonth;
        final int monthCompare;

        thisPersonMonth = this.dateOfBirth.getMonthNumerical();
        otherPersonMonth = other.dateOfBirth.getMonthNumerical();
        monthCompare = Integer.compare(otherPersonMonth, thisPersonMonth);

        if (monthCompare != 0)
        {
            return monthCompare;
        }

        /* Variables for storing the day of the Person Objects were born. */
        final int thisPersonDay;
        final int otherPersonDay;
        final int dayCompare;

        thisPersonDay = this.dateOfBirth.getDay();
        otherPersonDay = other.dateOfBirth.getDay();
        dayCompare = Integer.compare(otherPersonDay, thisPersonDay);

        return dayCompare;
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
     *
     * @return the full name in reversed order
     */
    @Override
    public String backward()
    {
        final StringBuilder reversedString;
        final String fullName;

        reversedString = new StringBuilder();
        reversedString.append(name.getFullName());
        reversedString.reverse();

        fullName = reversedString.toString();
        return fullName;
    }
}
