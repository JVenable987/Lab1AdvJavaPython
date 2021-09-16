package edu.ucdenver.library;

import java.time.LocalDate;

public class Book {
    /** TODO:        Declare the instance attributes for the book.
     * Follow the software engineering practices discussed in our videos.
     * Review the provided uml to identify data types.
     * - title
     * - publication date
     * - other titles
     * - number of pages.
     * - author.
     */
    String title;
    LocalDate publicationDate;
    String[] otherTitles;
    int numPages;
    Author authorOfBook;

    /*TODO: The constructor should receive all the data to create the book. (including the author obj) */
    public Book(String _title, LocalDate _publicationDate, String[] _otherTitles, int _numPages, Author _authorOfBook){
        title = _title;
        publicationDate = _publicationDate;
        otherTitles = _otherTitles;
        numPages = _numPages;
        authorOfBook = _authorOfBook;
    }

    public String toString(){
        /** Todo: Book toString()
         * The string representing the book should look like:
                             Book: [name], with [#pages] pages published on [YYYY-MM-DD] written by [Author].
                             ---a.k.a:[first other title]
                             ---a.k.a:[second other title]
                             ---a.k.a:[so on so forth]
         *See example on Canvas
         **/
        // Hint generate a string and concatenate. You can also use StringBuilder if you want to.
        //for(int i = 0; i < )
    }

    /** Todo: Add getters/setters accordingly to the UML class diagram */
}
