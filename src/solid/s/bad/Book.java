package solid.s.bad;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    //выводит информацию о книге
    public String printInfoAboutBook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        return "Book Title: " + title + ", Author: " + author + ", Pages: " + pages;
    }

    public boolean saveBookToFile(Book book){
        //сохраняем в файл
        return false;
    }

    public void printAndSaveToFile(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        //сохраняем в файл
    }
}

//1. модель - Plain Old Java Object
//2. сохраняет книги в файлы
//3. печать информации о книгах
