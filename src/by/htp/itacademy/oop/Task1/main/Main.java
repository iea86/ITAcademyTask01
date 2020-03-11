package by.training.tasks.aliv.oop.Task1.main;


import by.training.tasks.aliv.oop.Task1.TextAction.TextAction;
import by.training.tasks.aliv.oop.Task1.bean.Sentence;
import by.training.tasks.aliv.oop.Task1.bean.Text;
import by.training.tasks.aliv.oop.Task1.view.TextView;

public class Main {

	public static void main(String[] args) {
		TextView intout = new TextView();
		TextAction action = new TextAction();

		// заполняем текст
		Text text = intout.create();
		intout.print(text);

		// дополняем текст
		Sentence sentence = intout.enterSentence();
		text = action.append(text, sentence);
		intout.print(text);
		
		//выводим заголовок
		intout.printHeader(text);

	}
}
