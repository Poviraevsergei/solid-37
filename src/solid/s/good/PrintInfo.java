package solid.s.good;

public class PrintInfo {
    public String printInfoAboutBook(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Pages: " + book.getPages());
        return "Book Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Pages: " + book.getPages();
    }
}
