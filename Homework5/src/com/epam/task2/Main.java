package com.epam.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = createArray(sizeRequest());
        displaySumAndQuantityOfOddArrayElements(countQuantityOddArrayElements(array), countValuseSumOddArrayElements(array));

    }
    public static int sizeRequest() {
        boolean correctArraySize = false;
        int size;

        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Input size of array, that bigger than 0, to calculate quantity and sum of odd numbers: ");
            size = in.nextInt();

            if (size > 0) {
                correctArraySize = true;
            } else {
                System.out.println("Incorrect array size. Try again.");
            }
        } while (!correctArraySize);
        return size;
    }

    public static int[] createArray(int size) {

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30) - 10;
        }
        System.out.println("Array: " + Arrays.toString(array));
        return array;

    }
    public static int countQuantityOddArrayElements (int[] array){
        int quantity = 0;
        for (int i: array) {
            if ((i % 2) != 0) {
                quantity++;
            }
        }
        return quantity;
    }
    public static int countValuseSumOddArrayElements (int[] array){
        int valuesSum = 0;
        for (int i: array) {
            if ((i % 2) != 0) {
                valuesSum = valuesSum + i;
            }
        }
        return valuesSum;
    }
    public static void displaySumAndQuantityOfOddArrayElements (int quantity, int valuesSum){
        System.out.println("Quantity of odd numbers in array = " + quantity + ",");
        System.out.println("Sum of odd numbers in array = " + valuesSum + ".");
    }
}
