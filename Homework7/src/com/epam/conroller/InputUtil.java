package com.epam.conroller;

import java.time.Year;
import java.util.Scanner;

public class InputUtil {
    private static Scanner sc = new Scanner(System.in);

    public static int inputInt() {
        return Integer.parseInt(sc.nextLine());
    }

    private static float inputDouble() {
        return Float.parseFloat(sc.nextLine());
    }

    private static String inputString() {
        return sc.nextLine();
    }

    public static int getSize() {
        int size = 0;
        boolean correctArraySize = false;
        do {
            System.out.print("Input size of array, that bigger than 0: ");
            size = inputInt();

            if (size > 0) {
                correctArraySize = true;
            } else {
                System.out.println("Incorrect array size. Try again.");
            }
        } while (!correctArraySize);
        return size;
    }

    public static double getPercent() {
        double percent = 0;
        boolean correctPercent = false;
        do {
            System.out.print("Input percentage to change the price: ");
            percent = inputDouble();

            if (percent != 0) {
                correctPercent = true;
            } else {
                System.out.println("Incorrect percentage. Try again.");
            }
        } while (!correctPercent);
        return percent;
    }

    public static String getAuthor() {

        System.out.print("Input author to search: ");
        String author = inputString();

        return author;
    }

    public static int getPublishYear() {
        int publishYear = 0;
        boolean correctYear = false;
        do {
            System.out.print("Input year to search: ");
            publishYear = inputInt();

            if (validYear(publishYear)) {
                correctYear = true;
            } else {
                System.out.println("Incorrect year. Try again.");
            }
        } while (!correctYear);
        return publishYear;
    }

    private static boolean validYear(int publishYear) {
        return ((publishYear > 0) && (publishYear <= Year.now().getValue()));
    }
}
