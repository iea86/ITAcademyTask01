package by.training.tasks.aliv.oop.Task1.TextAction;

import by.training.tasks.aliv.oop.Task1.bean.Sentence;
import by.training.tasks.aliv.oop.Task1.bean.Text;

import java.util.List;

public class TextAction {

	public Text append(Text text, Sentence sentence) {

		List<Sentence> textBody = text.getTextBody();
		textBody.add(sentence);
		return text;
	}
}
