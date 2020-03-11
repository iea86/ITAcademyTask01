package by.training.tasks.aliv.oop.Task1.bean;

import java.util.ArrayList;
import java.util.List;

public class Text {

	private final String header; // header of the text
	private final String author; // author of the text
	private List<Sentence> textBody = new ArrayList<Sentence>(0);

	// Empty constructor
	public Text() {
		header = "Не указан заголовок";
		author = "Не указан автор";
	}

	public Text(String header, String author) {
		this.header = header;
		this.author = author;
		
	}

	
	public List<Sentence> getTextBody() {
		return textBody;
	}

	public void setTextBody(List<Sentence> textBody) {
		this.textBody = textBody;
	}

	public String getHeader() {
		return header;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Text [header=" + header + ", author=" + author + ", textBody=" + textBody + "]";
	}
	
	

}
