package com.epam.task1;

public class Book {

    private int id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int pageNumber;
    private double price;

    public Book() {
    }

    public Book(int id, String title, String author, String publisher, int yearOfPublishing, int pageNumber, int price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.pageNumber = pageNumber;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void view() {
        System.out.println("id: " + id + " ;" + "\n"
                + "Title: " + title + " ;" + "\n"
                + "Author: " + author + " ;" + "\n"
                + "Publisher: " + publisher + " ;" + "\n"
                + "Year of publishing: " + yearOfPublishing + " ;" + "\n"
                + "Number of pages: " + pageNumber + " ;" + "\n"
                + "Price: " + price + " ;" + "\n");

    }
}

