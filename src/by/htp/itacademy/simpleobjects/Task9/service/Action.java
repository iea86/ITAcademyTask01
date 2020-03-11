package by.training.tasks.aliv.simpleobjects.Task9.service;

import by.training.tasks.aliv.simpleobjects.Task9.model.Book;
import by.training.tasks.aliv.simpleobjects.Task9.model.Library;

import java.util.ArrayList;
import java.util.List;

public class Action {

    public List<Book> getByAuthor(Library library, String author) {
        List<Book> books = library.getBooks();
        List<Book> result = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                result.add(book);
            }
        }

        return result;
    }

    public List<Book> getByPublisher(Library library, String publisher) {
        List<Book> books = library.getBooks();
        List<Book> result = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getByYear(Library library, int year) {
        List<Book> books = library.getBooks();
        List<Book> result = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getYearPublihed() > year) {
                result.add(book);
            }
        }
        return result;
    }
}
