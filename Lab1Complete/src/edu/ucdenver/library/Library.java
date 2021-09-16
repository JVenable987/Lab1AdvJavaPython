package edu.ucdenver.library;
import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    /** TODO:        Declare the instance attributes for the Library.
     * Follow the software engineering practices discussed in our videos.
     * Review the provided uml to identify data types.
     * - library name
     * - list of books
     * - list of authors
     *
     * Hint: use ArrayList for lists.
     */
    private String libraryName;

    public Library(String _libraryName){
        //Remember to creat the list objects here!! (not in the declaration above).
        ArrayList<String> listBooks;
        ArrayList<String> listAuthors;
    }
    /*TODO: adds a book. receives all data and a string representing the author name. */
    public void addBook(Book _book)
    throws IllegalArgumentException{ //Todo: observe this line. It's notifying clients that this method may throw an exception. (no code needed)
        /**
         *   TODO:
         *   Search to retrieve the author object based on the name.
         *      Basically for each author compare the name. remember to use str1.equals(str2) to compare strings.
         *      If found, use keep it and terminate the search.
         *   If the author doesn't exist, throw a IllegalArgumentException notifiying that.
         *
         *   Create the book object using the book constructor.
         *   add the book to the list.
         *
         *   NOTE: object (reference) variables should be initialized with null. and you can ask if var == null
          */
    }

    public void addAuthor(String name) throws IllegalArgumentException{
        /** TODO:
         * Search to check if an author with that name exists.
         *   If the author exists, throw a IllegalArgumentException notifiying that.
         *   Look the previous method for inspiration.
         *
         *   Create the author object using it's constructor.
         *   add the author to the list.
         */
    }

    public String toString(){
        String libraryString = "";
        /** Todo: Library toString()
         * The string representing the book should look like:
                                 This is the [name] library.
                                 == Author List =
                                 [print each author, one per line - add new line after each author]
                                 == Author List =
                                 [print each book, one per line- add new line after each book]
                                 --o--
         * See example on Canvas
         **/
        // Hint generate a string and concatenate. You can also use StringBuilder if you want to. Return that string.
        String.format("This is the %s library.\n== Author List =\n", libraryName);

        return libraryString;
    }

    //Todo: Getter for the library name.

    public String getLibraryName() {
        return libraryName;
    }
}
