package com.epam.model;

public class Books {
    private int counter = 0;
    private Book[] books;

    public Books(int arraySize) {
        this.books = new Book[arraySize];
    }

    public boolean addBook(Book book) {
        if (counter >= books.length) {
            return false;
        }
        books[counter++] = book;
        return true;
    }

    public String displayBooks() {
        if (counter == 0) {
            return "No books!";
        }
        String books = "";
        for (int i = 0; i < counter; i++) {
            books += this.books[i].viewBook();
            books += "\n";
        }
        return books;
    }

    public void changePrice(double percent) {
        System.out.println("Change price by "
                + percent + "%");
        for (int i = 0; i < counter; i++) {
            books[i].changePrice(percent);
        }
    }

    public Books searchByAuthor(String author) {
        Books newBooks = new Books(counter);
        for (int i = 0; i < counter; i++) {
            if (books[i].getAuthor().equalsIgnoreCase(author)) {
                newBooks.addBook(books[i]);
            }
        }
        return newBooks;
    }

    public Books searchPublishedAfterYear(int year) {

        Books newBooks = new Books(counter);
        for (int i = 0; i < counter; i++) {
            if (books[i].getYearOfPublishing() > year) {
                newBooks.addBook(books[i]);
            }
        }
        return newBooks;
    }

}
