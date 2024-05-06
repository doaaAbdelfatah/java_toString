package library;

public class Main {
    public static void main(String[] args) {
        Book [] books = new Book[100];

        books[0] = new Book("123" , "Test" , "Doaa" , true);
        books[0].checkOut();
        System.out.println(books[0].isAvailable());
//        books[0].checkOut();
//        books[0].checkIn();
//        books[0].checkOut();

        books[1] = new Book("245" , "Demo" , "Ahmed" , true);


    }
}
