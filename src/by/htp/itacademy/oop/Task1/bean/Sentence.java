package by.training.tasks.aliv.oop.Task1.bean;

import java.util.ArrayList;
import java.util.List;

public class Sentence {

	private List<Word> sentenceBody = new ArrayList<Word>(0);

	public Sentence() {
	}

	public Sentence(List<Word> wordList) {
		for (Word word : wordList) {
			sentenceBody.add(word);
		}
	}

	public List<Word> getSentenceBody() {
		return sentenceBody;
	}

	public void setSentenceBody(List<Word> sentenceBody) {
		this.sentenceBody = sentenceBody;
	}

	@Override
	public String toString() {
		return "Sentence [sentenceBody=" + sentenceBody + "]";
	}

}