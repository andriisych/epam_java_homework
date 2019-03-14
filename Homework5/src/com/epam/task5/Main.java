package com.epam.task5;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) {
        int finalSize = 0;
        finalSize = (sizeRequest(finalSize));
        int[] array = createArray(finalSize);

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

    public static int[] createArray(int size) {

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 30) - 10;
        }
        System.out.println("Array: " + Arrays.toString(array));

        return array;
    }
    public static double averageCalculation (int[] array){

        int sum = sumCalculation(array);
        int numberOfElements = array.length +1;
        double average = sum / numberOfElements;
        return average;
    }
    public static int sumCalculation (int[] array){

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    public static int sizeOfArrayWithElementsThatMoreThanAverage (int[] array){
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > averageCalculation(array)) {
                size++;
            }
        }
        return size;
    }
    public  static void displayArrayWithElementsThatMoreThanAverageAndAverage (int[] array){
        int[] biggerThanAverageArray = new int[sizeOfArrayWithElementsThatMoreThanAverage (array)];
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
//Не понимаю, почему среднее арифметическое считает неправильно. Рядом лежит клас Main2 там, данные типа дабл и, вроде как, результат ближе к истине, тем не менее.