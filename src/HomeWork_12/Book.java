package HomeWork_12;

public class Book {
    private String nameBook;
    private int yearBook;

    Author author;

    public Book (String nameBook, int yearBook) {
        this.nameBook = nameBook;
        this.yearBook = yearBook;
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
