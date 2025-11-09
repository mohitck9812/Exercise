package helperClasses;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetail(){
        System.out.println("The book: " + title + " is written by " + author + " and the price of the book is Rs " + price);
    }

}
