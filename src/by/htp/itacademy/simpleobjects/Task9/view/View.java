package by.training.tasks.aliv.simpleobjects.Task9.view;

import by.training.tasks.aliv.simpleobjects.Task9.model.Book;
import by.training.tasks.aliv.simpleobjects.Task9.model.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class View {

    private int id;
    private String author;
    private int yearPublihed;
    private String publisher;
    private int numberofPage;
    private double price;
    private String typeOfBinding;

    public Library create() {

        List<Book> books = new ArrayList<Book>();
        books.add(new Book(1, "Duma", 2009, "Publisher1", 234, 10, "Coil"));
        books.add(new Book(2, "Duma", 2010, "Publisher2", 26, 20, "Perfect"));
        books.add(new Book(3, "Duma", 2011, "Publisher3", 56, 30, "Wire"));
        books.add(new Book(4, "Duma", 2012, "Publisher4", 24, 40, "Suddle Stitched"));

        Library library = new Library("Library", books);
        return library;
    }

    public void print(Library library) {
        List<Book> books = library.getBooks();
        if (books.size() == 0) {
            System.out.println("не найдено книг");
        } else {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }

    }

    public void print(List<Book> books) {
        if (books.size() == 0) {
            System.out.println("не найдено книг");
        } else {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }

    }

    public String inputString() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        return str;
    }

    public int inputYear() {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        return year;
    }
}
