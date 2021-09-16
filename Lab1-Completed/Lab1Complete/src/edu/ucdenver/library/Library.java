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
    private ArrayList<Book> listBooks;
    private ArrayList<Author> listAuthors;

    public Library(String _libraryName){
        //Remember to creat the list objects here!! (not in the declaration above).
        libraryName = _libraryName;
        listAuthors = new ArrayList<Author>();
        listBooks = new ArrayList<Book>();
    }
    /*TODO: adds a book. receives all data and a string representing the author name. */
    public void addBook(String _title, LocalDate _publicationDate, String[] _otherTitles, int _numPages, String _authorOfBook)
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
        boolean throwValue = true;
        for(int j = 0; j < listAuthors.size(); j++) {
            if (listAuthors.get(j).toString().equals(_authorOfBook + " (Author)")) {
                throwValue = false;
            }
        }
        if(throwValue){
            throw new IllegalArgumentException("The author name does not exist");
        }
        else {
            Book newBook = new Book(_title, _publicationDate, _otherTitles, _numPages, _authorOfBook);
            listBooks.add(newBook);
        }
    }

    public void addAuthor(String _name) throws IllegalArgumentException{
        /** TODO:
         * Search to check if an author with that name exists.
         *   If the author exists, throw a IllegalArgumentException notifiying that.
         *   Look the previous method for inspiration.
         *
         *   Create the author object using it's constructor.
         *   add the author to the list.
         */
        for(int i = 0; i < listAuthors.size(); i++){
            if(listAuthors.get(i).toString().equals(_name + " (Author)")){
                throw new IllegalArgumentException("The author already exists.");
            }
        }
        listAuthors.add(new Author(_name));
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
        libraryString += String.format("This is the %s library.\n== Author List =\n", getLibraryName());
        for(int i = 0; i < listAuthors.size(); i++) {
            libraryString += (String.format("%s\n", listAuthors.get(i).toString()));
        }
        libraryString += "== Book List =\n";
        for(int i = 0; i < listBooks.size(); i++) {
            libraryString += listBooks.get(i) + "\n" ;
        }
        libraryString += "--o--\n";
        return libraryString;
    }

    //Todo: Getter for the library name.

    public String getLibraryName() {
        return libraryName;
    }
}
