package by.training.tasks.aliv.oop.Task1.bean;

public class Word {

    private String wordValue;

    public Word() {
        this.wordValue = "";
    }

    public Word(String wordValue) {
        this.wordValue = wordValue;
    }

    public String getWordValue() {
        return wordValue;
    }

    public void setWordValue(String wordValue) {
        this.wordValue = wordValue;
    }

    @Override
    public String toString() {
        return "Word [wordValue=" + wordValue + "]";
    }


}    
    