package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Rejtő Jenő", "Csontbrigád");
        book.setRegNumber("001/ponyvaregény");

        Book anotherBook = new Book("Stephen King", "Holtsáv");
        anotherBook.setRegNumber("002/sci-fi");

        System.out.println("Könyvek: " + book.getAuthor() + ": " + book.getTitle() + " Azonosító: " + book.getRegNumber());
        System.out.println("Könyvek: " + anotherBook.getAuthor() + ": " + anotherBook.getTitle() + " Azonosító: " + anotherBook.getRegNumber());
    }
}
