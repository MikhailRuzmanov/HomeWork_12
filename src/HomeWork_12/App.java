package HomeWork_12;

import java.sql.SQLOutput;

public class App {

    public static void main(String[] args) {
        System.out.println("Домашнее задание №12");
        System.out.println(" ");
        //
        Author author = new Author("Иван", "Гончаров");

        //System.out.println("Автор - " + author.getFirstName() + " " + author.getLastName());

        Book book = new Book(author,"Обрыв", 1869);
        Author author1 = book.getAuthor();
        System.out.println("Автор - " + author1.getFirstName() + " " + author1.getLastName());
        System.out.println("Название книги - " + book.getNameBook());
        System.out.println("Год издания - " + book.getYearBook());
        book.setYearBook(1736);
        System.out.println("Измененный год издания - " + book.getYearBook());
        System.out.println(" ");

        Book book2 = new Book(author,"Бесы", 1871);
        Author author2 = book.getAuthor();
        System.out.println("Автор - " + author2.getFirstName() + " " + author2.getLastName());
        System.out.println("Название книги - " + book2.getNameBook());
        System.out.println("Год издания - " + book2.getYearBook());
        book2.setYearBook(1872);
        System.out.println("Измененный год издания - " + book2.getYearBook());



    }
}
