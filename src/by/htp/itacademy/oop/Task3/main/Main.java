package by.training.tasks.aliv.oop.Task3.main;

import by.training.tasks.aliv.oop.Task3.action.Action;
import by.training.tasks.aliv.oop.Task3.model.City;
import by.training.tasks.aliv.oop.Task3.model.State;
import by.training.tasks.aliv.oop.Task3.view.View;

import java.util.List;



public class Main {
	public static void main(String[] args) {

		Action action = new Action();
		View view = new View();
		State st;
		st = view.create();
		System.out.println("Столица государства:");
		System.out.println(action.getCapital(st));

		System.out.println("Количество регионов:");
		int number = action.getNumberOfRegions(st);
		System.out.println(number);
		
		System.out.println("Площадь государства:");
		int s = action.getSquare(st);
		System.out.println(s);

		
		List<City> result=action.getRegionCenters(st);
		view.print(result);
	}
}
