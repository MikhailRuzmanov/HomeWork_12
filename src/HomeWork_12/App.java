package HomeWork_12;

import java.sql.SQLOutput;

public class App {

    public static void main(String[] args) {
        System.out.println("Домашнее задание №12");
        System.out.println(" ");
        //

        Author author = new Author("Иван", "Гончаров");
        System.out.println("Автор - " + author.getFirstName() + " " + author.getLastName());

        Book book = new Book("Обрыв", 1869);
        System.out.println("Название книги - " + book.getNameBook());
        System.out.println("Год издания - " + book.getYearBook());
        book.setYearBook(1736);
        System.out.println("Измененный год издания - " + book.getYearBook());
        System.out.println("");

        Author author2 = new Author("Федор", "Доставеский");
        System.out.println("Автор - " + author2.getFirstName() + " " + author2.getLastName());

        Book book2 = new Book("Бесы", 1871);
        System.out.println("Название книги - " + book2.getNameBook());
        System.out.println("Год издания - " + book2.getYearBook());
        book.setYearBook(1872);
        System.out.println("Измененный год издания - " + book2.getYearBook());



    }
}
