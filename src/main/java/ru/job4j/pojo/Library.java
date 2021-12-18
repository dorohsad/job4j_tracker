package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book mathematics = new Book("Математика", 500);
        Book cleanCode = new Book("Clean code", 400);
        Book history = new Book("История", 1000);
        Book chemistry = new Book("Химия", 450);
        Book[] books = new Book[4];
        books[0] = mathematics;
        books[1] = cleanCode;
        books[2] = history;
        books[3] = chemistry;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        Book store = books[0];
        books[0] = books[3];
        books[3] = store;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getPages());
        }
        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getPages());
            }
        }
    }
}
