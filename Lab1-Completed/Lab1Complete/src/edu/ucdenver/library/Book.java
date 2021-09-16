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
    private String title;
    private LocalDate publicationDate;
    private String[] otherTitles;
    private int numPages;
    private Author authorOfBook;

    /*TODO: The constructor should receive all the data to create the book. (including the author obj) */
    public Book(String _title, LocalDate _publicationDate, String[] _otherTitles, int _numPages, String _authorOfBook){
        title = _title;
        publicationDate = _publicationDate;
        otherTitles = _otherTitles;
        numPages = _numPages;
        authorOfBook = new Author(_authorOfBook);
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
        String bookString = "";
        bookString += String.format("Book: %s, with %d pages published on %s written by %s.\n", title, numPages, publicationDate.toString(), authorOfBook);
        for(int i = 0; i < otherTitles.length; i++) {
            bookString += String.format("---a.k.a:%s\n", otherTitles[i]);
        }
        return bookString;
    }

    /** Todo: Add getters/setters accordingly to the UML class diagram */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String[] getOtherTitles() {
        return otherTitles;
    }

    public void setOtherTitles(String[] otherTitles) {
        this.otherTitles = otherTitles;
    }

    public int getNumberPages() {
        return numPages;
    }

    public void setNumberPages(int numPages) {
        this.numPages = numPages;
    }

    public Author getAuthor() {
        return authorOfBook;
    }
}
