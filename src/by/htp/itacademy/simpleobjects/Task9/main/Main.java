package by.training.tasks.aliv.simpleobjects.Task9.main;

import by.training.tasks.aliv.simpleobjects.Task9.service.Action;
import by.training.tasks.aliv.simpleobjects.Task9.model.Library;
import by.training.tasks.aliv.simpleobjects.Task9.view.View;

public class Main {
    public static void main(String[] args) {
        View view = new View();
        Action action = new Action();
        Library library = view.create();
        view.print(library);
        System.out.println("Введите автора для поиска его книг");
        String author = view.inputString();
        view.print(action.getByAuthor(library, author));

        System.out.println("Введите издательство для поиска его книг");
        String publisher = view.inputString();
        view.print(action.getByPublisher(library, publisher));

        System.out.println("Введите год");
        int year = view.inputYear();
        view.print(action.getByYear(library, year));


    }
}
