package com.epam.conroller;

import com.epam.model.Book;
import com.epam.model.Books;

import static com.epam.view.ViewBooks.print;

public class ControllerBooks {
    private Books books;
    private int command = 0;
    private boolean exit = false;

    public void run() {
        initBooksStorage();
        do {
            print("Type command number: ");
            print("0.Add up to 6 books");
            print("1.View all books");
            print("2.Change price on percent: ");
            print("3.Search by author");
            print("4.Search by year");
            print("5.Exit");
            command = InputUtil.inputInt();
            switch (command) {
                case 0:
                    addSixBooks();
                    break;
                case 1:
                    viewAllBooks();
                    break;
                case 2:
                    double percent = InputUtil.getPercent();
                    books.changePrice(percent);
                    viewAllBooks();
                    break;
                case 3:
                    String author = InputUtil.getAuthor();
                    print(books.searchByAuthor(author).displayBooks());
                    break;
                case 4:
                    int year = InputUtil.getPublishYear();
                    print(books.searchPublishedAfterYear(year).displayBooks());
                    break;
                case 5:
                    exit = true;
                default:
                    System.out.println("Incorrect command, try again.");
                    break;
            }
        } while (!exit);
    }

    public void viewAllBooks() {
        print(books.displayBooks());
    }

    public void initBooksStorage() {
        int numberOfBooks = InputUtil.getSize();
        books = new Books(numberOfBooks);
    }

    public void addSixBooks() {
        books.addBook(new Book("title1", "author1", "Publisher1", 2011, 161, 111));
        books.addBook(new Book("title2", "author2", "Publisher2", 2012, 162, 222));
        books.addBook(new Book("title3", "author3", "Publisher3", 2013, 163, 333));
        books.addBook(new Book("title4", "author4", "Publisher4", 2014, 164, 444));
        books.addBook(new Book("title5", "author5", "Publisher5", 2015, 165, 555));
        books.addBook(new Book("title6", "author6", "Publisher6", 2016, 166, 666));
    }
}
//  public void addBookManually(){
//        print("\nEnter all info about book: ");
//        print("Enter book name: ");
//        String name = InputUtil.inputString();
//        print("\nEnter book author: ");
//        String author = InputUtil.inputString();
//        print("\nEnter book publisher: ");
//        String publisher = InputUtil.inputString();
//        print("\nEnter book year: ");
//        int year = InputUtil.inputInt();
//        print("\nEnter book pages number: ");
//        int pages = InputUtil.inputInt();
//        print("\nEnter book price: ");
//        float price = InputUtil.inputDouble();
//
//        books.addBook(new Book(name, author, publisher, year, pages, price));
//    }
