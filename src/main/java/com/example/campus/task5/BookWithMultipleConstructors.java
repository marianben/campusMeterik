package com.example.campus.task5;

public class BookWithMultipleConstructors {

    public static void main(String s[])
    {
        Book book1 = new Book("Java, The Complete Reference");
        Book book2 = new Book("Java, The Complete Reference", "Herbert Schildt");
        Book book3 = new Book("Java, The Complete Reference", "Herbert Schildt", 8);

        System.out.println("Book 1 = " + book1.name);
        System.out.println("Book 2 = " + book2.name + " - " + book2.author);
        System.out.println("Book 3 = " + book3.name + " - " + book3.author + " - " + book3.edition);

    }


}
class Book
{
    String name;
    String author;
    int edition;

    public Book(String name) {
        this.name=name;
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int edition) {
        this.name = name;
        this.author = author;
        this.edition = edition;
    }
}
