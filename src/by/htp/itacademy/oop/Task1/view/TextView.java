package by.training.tasks.aliv.oop.Task1.view;

import by.training.tasks.aliv.oop.Task1.TextAction.TextAction;
import by.training.tasks.aliv.oop.Task1.bean.Sentence;
import by.training.tasks.aliv.oop.Task1.bean.Text;
import by.training.tasks.aliv.oop.Task1.bean.Word;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextView {

	public Text create() {
		TextAction action = new TextAction();
		Text text = new Text("Header", "Author");

		List<Word> words = new ArrayList<Word>();
		words.add(new Word("Let"));
		words.add(new Word("me"));
		words.add(new Word("speak"));
		words.add(new Word("from"));
		words.add(new Word("my"));
		words.add(new Word("heart."));

		Sentence sentence = new Sentence(words);
		text = action.append(text,sentence);
		return text;
	}

	public void print(Text text) {
		StringBuilder sb = new StringBuilder();
		List<Sentence> textBody = text.getTextBody();

		for (Sentence sentence : textBody) {
			List<Word> words = sentence.getSentenceBody();
			for (Word w : words) {
				sb.append(w.getWordValue() + " ");
			}
		}
		System.out.println(sb.toString());
	}

	public void printHeader(Text text) {
		System.out.println(text.getHeader());
	}

	public Sentence enterSentence() {
		Scanner sc = new Scanner(System.in);
		List<Word> words = new ArrayList<Word>();
		System.out.println("Cоставляем предложение из слов. Введенный символ . вместо слова означает завершение ввода предложения");

		String s;
		do {
			System.out.println("Введите слово: ");
			s = sc.nextLine();
			Word word = new Word(s);
			words.add(word);
		} while (!s.equals("."));

		Sentence sentence = new Sentence(words);
		return sentence;

	}

}
