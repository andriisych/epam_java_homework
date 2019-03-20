package com.epam.task1;


public class Books {

    int counter = 0;
    Book[] books;

    public Books(int size) {
        this.books = new Book[size];
    }

    public void addOneBook(Book book) {
        try {
            this.books[counter] = book;
        } catch (ArrayIndexOutOfBoundsException e) {
            e.getMessage();
        }
        counter++;
    }

    public void displayBooks() {

        for (Book element : books) {
            try {
                element.view();
            } catch (NullPointerException e) {

            }
        }
    }

    public void changeBooksPrice(int percent) {

        try {
            for (Book element : books) {
                element.setPrice(element.getPrice() + (element.getPrice() * percent / 100));
            }
        } catch (NullPointerException e) {

        }


    }

    public void searchByAuthor(String author) {
        try {
            for (Book element : books) {
                if (element.getAuthor().equals(author)) {
                    element.view();
                }
            }
        } catch (NullPointerException e) {

        }
    }

    public void searchPublishedAfterYear(int year) {
        try {
            for (Book element : books) {
                if (element.getYearOfPublishing() > year) {
                    element.view();
                }
            }
        } catch (NullPointerException e) {

        }
    }
}





