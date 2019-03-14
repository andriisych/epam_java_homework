package com.epam.task5;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main2 {
    public static void main(String[] args) {
        int finalSize = 0;
        finalSize = (sizeRequest(finalSize));
        double[] array = createArray(finalSize);

        displayArrayWithElementsThatMoreThanAverageAndAverage(array);
    }
    public static int sizeRequest(int finalSize) {
        if (finalSize == 0) {
            finalSize = sizeInput();
            return finalSize;
        }
        return finalSize;
    }

    public static int sizeInput() {
        int size = 0;
        if (size == 0) {
            boolean correctArraySize = false;
            do {
                Scanner in = new Scanner(System.in);
                System.out.print("Input size of array, that bigger than 0, to find average: ");
                size = in.nextInt();

                if (size > 0) {
                    correctArraySize = true;
                } else {
                    System.out.println("Incorrect array size. Try again.");
                }
            } while (!correctArraySize);
        }
        return size;
    }

    public static double[] createArray(int size) {

        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = (double) (Math.random() * 30) - 10;
        }
        System.out.println("Array: " + Arrays.toString(array));

        return array;
    }
    public static double averageCalculation (double[] array){

        double sum = sumCalculation(array);
        double numberOfElements = array.length +1;
        double average = sum / numberOfElements;
        return average;
    }
    public static double sumCalculation (double[] array){

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static int sizeOfArrayWithElementsThatMoreThanAverage (double[] array){
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > averageCalculation(array)) {
                size++;
            }
        }
        return size;
    }
    public  static void displayArrayWithElementsThatMoreThanAverageAndAverage (double[] array){
        double[] biggerThanAverageArray = new double[sizeOfArrayWithElementsThatMoreThanAverage (array)];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] > averageCalculation(array)) {
                biggerThanAverageArray[j] += array[i];
                j++;
            }
        }
        System.out.println("The average of array: " + averageCalculation(array));
        System.out.println("Array with elements that bigger than average: " + Arrays.toString(biggerThanAverageArray));
    }
}
