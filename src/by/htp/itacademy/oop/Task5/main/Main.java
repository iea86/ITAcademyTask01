package by.training.tasks.aliv.oop.Task5.main;
import by.training.tasks.aliv.oop.Task5.model.Voucher;
import by.training.tasks.aliv.oop.Task5.service.Action;
import by.training.tasks.aliv.oop.Task5.view.View;

import java.util.ArrayList;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		View view = new View();
		Action action = new Action();
		List<Voucher> offer = new ArrayList<Voucher>();
		
		//cформировать набор предложений, что есть в наличии
		offer = view.create();
		view.print(offer);
		
		//ввести нужный транспорт, длительность и тип питания
		int transportCode = view.inputTransport();
		int durationCode=view.inputDuration();
		int mealCode=view.inputMeal();
		
		//вывести возможное предложение
		List<Voucher> getOfferperChoice=action.getOfferperChoice(offer, transportCode, mealCode, durationCode);
		view.print(getOfferperChoice);
		
		//cортировать путевки
		System.out.println("cортировать путевки по цене");
		action.sortbyPrice(offer);
		view.print(offer);
		
		

	}

}
