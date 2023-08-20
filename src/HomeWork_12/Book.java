package HomeWork_12;

public class Book {
    private Author author;
    private String nameBook;
    private int yearBook;


    public Book ( Author author, String nameBook, int yearBook) {
        this.author = author;
        this.nameBook = nameBook;
        this.yearBook = yearBook;

    }

    public Author getAuthor() {
        return author;

    }

    public String getNameBook(){
        return this.nameBook;
    }
    public int getYearBook(){
        return this.yearBook;
    }

    public void setYearBook(int yearBook){
        this.yearBook = yearBook;
    }

}
