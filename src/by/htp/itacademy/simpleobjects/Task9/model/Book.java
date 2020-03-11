package by.training.tasks.aliv.simpleobjects.Task9.model;


public class Book {
    private int id;
    private String author;
    private int yearPublihed;
    private String publisher;
    private int numberofPage;
    private double price;
    private String typeOfBinding;

    public Book(int id, String author, int yearPublihed, String publisher, int numberofPage, double price, String typeOfBinding) {
        this.id = id;
        this.author = author;
        this.yearPublihed = yearPublihed;
        this.publisher = publisher;
        this.numberofPage = numberofPage;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublihed() {
        return yearPublihed;
    }

    public void setYearPublihed(int yearPublihed) {
        this.yearPublihed = yearPublihed;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberofPage() {
        return numberofPage;
    }

    public void setNumberofPage(int numberofPage) {
        this.numberofPage = numberofPage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setTypeOfBinding(String typeOfBinding) {
        this.typeOfBinding = typeOfBinding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", yearPublihed=" + yearPublihed +
                ", publisher='" + publisher + '\'' +
                ", numberofPage=" + numberofPage +
                ", price=" + price +
                ", typeOfBinding='" + typeOfBinding + '\'' +
                '}';
    }
}
