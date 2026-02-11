package ca.bcit.comp2522.lab4;

public class Main
{
    public static void main (final String[] args)
    {
        final Date georgeOrwellDOB;
        final Date harperLeeDOB;
        final Date janeAustenDOB;
        final Date fScottFitzgeraldDOB;
        final Date hermanMelvilleDOB;
        final Date robertCaroDOB;
        final Date walterIsaacsonDOB;
        final Date martinGilbertDOB;
        final Date ronChernowDOB;
        final Date anneFrankDOB;
        final Date nelsonMandelaDOB;
        final Date mahatmaGandhiDOB;
        final Date mayaAngelouDOB;
        final Date malcolmXDOB;
        final Date robertMosesDOB;
        final Date steveJobsDOB;
        final Date winstonChurchillDOB;
        final Date alexanderHamiltonDOB;
        final Date albertEinsteinDOB;

        final Name georgeOrwellName;
        final Name harperLeeName;
        final Name janeAustenName;
        final Name fScottFitzgeraldName;
        final Name hermanMelvilleName;
        final Name robertCaroName;
        final Name walterIsaacsonName;
        final Name martinGilbertName;
        final Name ronChernowName;
        final Name anneFrankName;
        final Name nelsonMandelaName;
        final Name mahatmaGandhiName;
        final Name mayaAngelouName;
        final Name malcolmXName;
        final Name robertMosesName;
        final Name steveJobsName;
        final Name winstonChurchillName;
        final Name alexanderHamiltonName;
        final Name albertEinsteinName;

        final Person georgeOrwell;
        final Person harperLee;
        final Person janeAusten;
        final Person fScottFitzgerald;
        final Person hermanMelville;
        final Person robertCaro;
        final Person walterIsaacson;
        final Person martinGilbert;
        final Person ronChernow;
        final Person anneFrank;
        final Person nelsonMandela;
        final Person mahatmaGandhi;
        final Person mayaAngelou;
        final Person malcolmX;
        final Person robertMoses;
        final Person steveJobs;
        final Person winstonChurchill;
        final Person alexanderHamilton;
        final Person albertEinstein;

        final Book book1;
        final Book book2;
        final Book book3;
        final Book book4;
        final Book book5;
        final Book bio1;
        final Book bio2;
        final Book bio3;
        final Book bio4;
        final Book bio5;
        final Book auto1;
        final Book auto2;
        final Book auto3;
        final Book auto4;
        final Book auto5;

        // Initialize Dates for Authors
        georgeOrwellDOB = new Date(
                1903,
                6,
                25
        );
        harperLeeDOB = new Date(
                1926,
                4,
                28
        );
        janeAustenDOB = new Date(
                1775,
                12,
                16
        );
        fScottFitzgeraldDOB = new Date(
                1896,
                9,
                24
        );
        hermanMelvilleDOB = new Date(
                1819,
                8,
                1
        );
        robertCaroDOB = new Date(
                1935,
                10,
                30
        );
        walterIsaacsonDOB = new Date(
                1952,
                5,
                20
        );
        martinGilbertDOB = new Date(
                1936,
                10,
                25
        );
        ronChernowDOB = new Date(
                1949,
                3,
                3
        );
        anneFrankDOB = new Date(
                1929,
                6,
                12
        );
        nelsonMandelaDOB = new Date(
                1918,
                7,
                18
        );
        mahatmaGandhiDOB = new Date(
                1869,
                10,
                2
        );
        mayaAngelouDOB = new Date(
                1928,
                4,
                4
        );
        malcolmXDOB = new Date(
                1925,
                5,
                19
        );

        // Initialize Dates for People (Biography Subjects)
        robertMosesDOB = new Date(
                1888,
                12,
                18
        );
        steveJobsDOB = new Date(
                1955,
                2,
                24
        );
        winstonChurchillDOB = new Date(
                1874,
                11,
                30
        );
        alexanderHamiltonDOB = new Date(
                1755,
                1,
                11
        );
        albertEinsteinDOB = new Date(
                1879,
                3,
                14
        );

        // Initialize Names for Authors
        georgeOrwellName = new Name(
                "George",
                "Orwell"
        );
        harperLeeName = new Name(
                "Harper",
                "Lee"
        );
        janeAustenName = new Name(
                "Jane",
                "Austen"
        );
        fScottFitzgeraldName = new Name(
                "F. Scott",
                "Fitzgerald"
        );
        hermanMelvilleName = new Name(
                "Herman",
                "Melville"
        );
        robertCaroName = new Name(
                "Robert",
                "Caro"
        );
        walterIsaacsonName = new Name(
                "Walter",
                "Isaacson"
        );
        martinGilbertName = new Name(
                "Martin",
                "Gilbert"
        );
        ronChernowName = new Name(
                "Ron",
                "Chernow"
        );
        anneFrankName = new Name(
                "Anne",
                "Frank"
        );
        nelsonMandelaName = new Name(
                "Nelson",
                "Mandela"
        );
        mahatmaGandhiName = new Name(
                "Mahatma",
                "Gandhi"
        );
        mayaAngelouName = new Name(
                "Maya",
                "Angelou"
        );
        malcolmXName = new Name(
                "Malcolm",
                "X"
        );

        // Initialize Names for People (Biography Subjects)
        robertMosesName = new Name(
                "Robert",
                "Moses"
        );
        steveJobsName = new Name(
                "Steve",
                "Jobs"
        );
        winstonChurchillName = new Name(
                "Winston",
                "Churchill"
        );
        alexanderHamiltonName = new Name(
                "Alexander",
                "Hamilton"
        );
        albertEinsteinName = new Name(
                "Albert",
                "Einstein"
        );

        // Initialize Authors
        georgeOrwell = new Author(
                georgeOrwellDOB,
                georgeOrwellName,
                "Dystopian"
        );
        harperLee = new Author(
                harperLeeDOB,
                harperLeeName,
                "Fiction"
        );
        janeAusten = new Author(
                janeAustenDOB,
                janeAustenName,
                "Romance"
        );
        fScottFitzgerald = new Author(
                fScottFitzgeraldDOB,
                fScottFitzgeraldName,
                "Fiction"
        );
        hermanMelville = new Author(
                hermanMelvilleDOB,
                hermanMelvilleName,
                "Adventure"
        );
        robertCaro = new Author(
                robertCaroDOB,
                robertCaroName,
                "Biography"
        );
        walterIsaacson = new Author(
                walterIsaacsonDOB,
                walterIsaacsonName,
                "Biography"
        );
        martinGilbert = new Author(
                martinGilbertDOB,
                martinGilbertName,
                "Biography"
        );
        ronChernow = new Author(
                ronChernowDOB,
                ronChernowName,
                "Biography"
        );
        anneFrank = new Author(
                anneFrankDOB,
                anneFrankName,
                "Autobiography"
        );
        nelsonMandela = new Author(
                nelsonMandelaDOB,
                nelsonMandelaName,
                "Autobiography"
        );
        mahatmaGandhi = new Author(
                mahatmaGandhiDOB,
                mahatmaGandhiName,
                "Autobiography"
        );
        mayaAngelou = new Author(
                mayaAngelouDOB,
                mayaAngelouName,
                "Autobiography"
        );
        malcolmX = new Author(
                malcolmXDOB,
                malcolmXName,
                "Autobiography"
        );

        // Initialize People (Biography Subjects)
        robertMoses = new Person(
                robertMosesDOB,
                robertMosesName
        );
        steveJobs = new Person(
                steveJobsDOB,
                steveJobsName
        );
        winstonChurchill = new Person(
                winstonChurchillDOB,
                winstonChurchillName
        );
        alexanderHamilton = new Person(
                alexanderHamiltonDOB,
                alexanderHamiltonName
        );
        albertEinstein = new Person(
                albertEinsteinDOB,
                albertEinsteinName
        );

        // Initialize Books
        book1 = new Book(
                "1984",
                1949,
                (Author) georgeOrwell
        );
        book2 = new Book(
                "To Kill a Mockingbird",
                1960,
                (Author) harperLee
        );
        book3 = new Book(
                "Pride and Prejudice",
                1813,
                (Author) janeAusten
        );
        book4 = new Book(
                "The Great Gatsby",
                1925,
                (Author) fScottFitzgerald
        );
        book5 = new Book(
                "Moby-Dick",
                1813,
                (Author) hermanMelville
        );

        // Initialize Biographies
        bio1 = new Biography(
                "The Power Broker",
                1974,
                (Author) robertCaro,
                robertMoses
        );
        bio2 = new Biography(
                "Steve Jobs",
                2011,
                (Author) walterIsaacson,
                steveJobs
        );
        bio3 = new Biography(
                "Churchill: A Life",
                1991,
                (Author) martinGilbert,
                winstonChurchill
        );
        bio4 = new Biography(
                "Alexander Hamilton",
                2004,
                (Author) ronChernow,
                alexanderHamilton
        );
        bio5 = new Biography(
                "Einstein: His Life and Universe",
                2007,
                (Author) walterIsaacson,
                albertEinstein
        );

        // Initialize Autobiographies
        auto1 = new Autobiography(
                "The Diary of a Young Girl",
                1947,
                (Author) anneFrank
        );
        auto2 = new Autobiography(
                "Long Walk to Freedom",
                1994,
                (Author) nelsonMandela
        );
        auto3 = new Autobiography(
                "The Story of My Experiments with Truth",
                1927,
                (Author) mahatmaGandhi
        );
        auto4 = new Autobiography(
                "I Know Why the Caged Bird Sings",
                1969,
                (Author) mayaAngelou
        );
        auto5 = new Autobiography(
                "Autobiography of Malcolm X",
                1965,
                (Author) malcolmX
        );

        // Display all books
        book1.display();
        book2.display();
        book3.display();
        book4.display();
        book5.display();

        // Display all biographies
        bio1.display();
        bio2.display();
        bio3.display();
        bio4.display();
        bio5.display();

        // Display all autobiographies
        auto1.display();
        auto2.display();
        auto3.display();
        auto4.display();
        auto5.display();

        // Reversible: Book titles backward
        book1.backward();
        book2.backward();

        // Reversible: Author names backward
        georgeOrwell.backward();
        harperLee.backward();

        // Comparable: Compare books by year
        System.out.println(book1.compareTo(book2));
        System.out.println(book3.compareTo(book5));

        // Comparable: Compare authors by birthdate
        System.out.println(georgeOrwell.compareTo(harperLee));

        // Equals: Compare biographies by subject
        System.out.println(bio2.equals(bio5));
        System.out.println(bio1.equals(bio1));

    }
}
