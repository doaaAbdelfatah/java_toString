package library;

public class Book extends LibraryItem {

    private String author;
    private  boolean isAvailable;

    public Book(String itemId, String title, String author) {
        super(itemId, title);
        this.author = author;
    }

    public Book(String itemId, String title, String author, boolean isAvailable) {
        super(itemId, title);
        this.author = author;
        this.isAvailable = isAvailable;
    }

    @Override
    public void checkOut() {
        if (this.isAvailable){ // if true
            System.out.println("Book is available then checkOut");
            this.isAvailable = false;
        }else{
            System.out.println("Book is not available you can't checkOut");
        }
    }

    @Override
    public void checkIn() {
        System.out.println("Thank you the Book now checkIn");
        isAvailable = true;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


}
