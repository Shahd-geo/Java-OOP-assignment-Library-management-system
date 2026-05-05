package Data;

public class Book extends LibraryItem {

    private String author;

    //public Book(int newId, String newTitle, String newAuthor) {
      //  super(newId, newTitle);
        //author = newAuthor;
    //}

    public String getDetails() {
        return "Book: " + getTitle() + " by " + author;
    }
}