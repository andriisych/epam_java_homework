package com.epam.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int size = getSize();
        Books books = new Books(size);

        addSixBooks(books);

        books.displayBooks();
        addDivider();

        books.changeBooksPrice(getPercent());
        books.displayBooks();
        addDivider();

        books.searchByAuthor(getAuthor());
        addDivider();

        books.searchPublishedAfterYear(getPublishYear());

    }

    public static int getPublishYear() {
        int publishYear = 0;
        boolean correctYear = false;
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Input year to search: ");
            publishYear = in.nextInt();

            if (publishYear > 0) {
                correctYear = true;
            } else {
                System.out.println("Incorrect year. Try again.");
            }
        } while (!correctYear);
        return publishYear;
    }

    public static String getAuthor() {
        String author = new String();
        Scanner in = new Scanner(System.in);
        System.out.print("Input author to search: ");
        author = in.nextLine();

        return author;
    }

    public static void addDivider() {
        System.out.println("-----------------------------------------------------------------------------------");
    }

    public static int getPercent() {
        int percent = 0;
        boolean correctPercent = false;
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Input percentage to change the price: ");
            percent = in.nextInt();

            if (percent != 0) {
                correctPercent = true;
            } else {
                System.out.println("Incorrect percentage. Try again.");
            }
        } while (!correctPercent);
        return percent;
    }

    public static void addSixBooks(Books books) {
        books.addOneBook(new Book(1, "title1", "author1", "Publisher1", 2011, 161, 111));
        books.addOneBook(new Book(2, "title2", "author2", "Publisher2", 2012, 162, 222));
        books.addOneBook(new Book(3, "title3", "author3", "Publisher3", 2013, 163, 333));
        books.addOneBook(new Book(4, "title4", "author4", "Publisher4", 2014, 164, 444));
        books.addOneBook(new Book(5, "title5", "author5", "Publisher5", 2015, 165, 555));
        books.addOneBook(new Book(6, "title6", "author6", "Publisher6", 2016, 166, 666));
    }

    public static int getSize() {
        int size = 0;
        boolean correctArraySize = false;
        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Input size of array, that bigger than 0: ");
            size = in.nextInt();

            if (size > 0) {
                correctArraySize = true;
            } else {
                System.out.println("Incorrect array size. Try again.");
            }
        } while (!correctArraySize);
        return size;
    }
}