package com.epam.task3;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int finalSize = 0;
        finalSize = (sizeRequest(finalSize));

        int[] sumArray = new int[finalSize];
        int[] firstArray = createArray(finalSize);
        int[] secondArray = createArray(finalSize);

        addOneArrayToSum(sumArray, firstArray);
        addOneArrayToSum(sumArray, secondArray);

        System.out.println("Sum of arrays element = " + Arrays.toString(sumArray));
    }

    public static int sizeRequest(int finalSize){
        if (finalSize == 0) {
            finalSize = sizeInput();
            return finalSize;
        }
        return finalSize;
    }

    public static int sizeInput () {
        int size = 0;
        if (size == 0) {
            boolean correctArraySize = false;
            do {
                Scanner in = new Scanner(System.in);
                System.out.print("Input size of array, that bigger than 0, to find sum of their elements: ");
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

    public static int[] createArray (int size) {

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30) - 10;
        }
        System.out.println("Array: " + Arrays.toString(array));
        return array;
    }

    public static int[] addOneArrayToSum (int[]sumArray, int[] array) {

        for (int i = 0; i < array.length; i++) {
            sumArray[i] = sumArray[i] + array[i];
        }
        return sumArray;
    }
}
