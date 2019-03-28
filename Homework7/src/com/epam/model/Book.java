package com.epam.model;

public class Book {
    private static int nextID = 1;
    private int id;
    private String name;
    private String author;
    private String publisher;
    private int yearOfPublishing;
    private int pages;
    private double price;

    public Book(String name, String author,
                String publisher, int yearOfPublishing, int pages,
                double price) {
        this();
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublishing = yearOfPublishing;
        this.pages = pages;
        this.price = price;
    }

    public Book() {
        this.id = nextID++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setYearOfPublishing(int year) {
        this.yearOfPublishing = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String viewBook() {
        return "ID = " + id
                + ";\nName = " + name
                + ";\nAuthor = " + author
                + ";\nPublisher = " + publisher
                + ";\nYear = " + yearOfPublishing
                + ";\nPages = " + pages
                + ";\nPrice = " + price + ";\n";
    }

    public void changePrice(double percent) {
        this.price = (price + price * percent / 100);
    }
}
