package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book cleanCode = new Book("Clean Code", 400);
        Book headFirstJava = new Book("Head First Java", 700);
        Book greenMile = new Book("Green Mile", 550);
        Book source = new Book("Source", 1000);

        Book[] books = new Book[4];
        books[0] = cleanCode;
        books[1] = headFirstJava;
        books[2] = greenMile;
        books[3] = source;
        for (Book b : books) {
            System.out.println(b.getName() + " : " + b.getCount());
        }

        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book b : books) {
            System.out.println(b.getName() + " : " + b.getCount());
        }

        System.out.println();
        for (Book b : books) {
            if (b.equals(cleanCode)) {
                System.out.println(b.getName() + " : " + b.getCount());
            }
        }
    }
}
