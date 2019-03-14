package com.epam.task4;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int finalSize = 0;
        finalSize = (sizeRequest(finalSize));
        int[] array = createArray(finalSize);
        arrayDividing(array);
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
                System.out.print("Input size of array, that bigger than 0, to divide elements to positive and negative: ");
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

    public static void arrayDividing(int[] array) {

        int[] positiveArray = new int[positiveSizeArray(array)];
        int[] negativeArray = new int[negativeSizeArray(array)];
        int zeroCounter = 0;
        for (int i = 0, p = 0, n = 0; i < array.length;i++ ) {
            if (array[i] > 0) {
                positiveArray[p] = positiveArray[p] + array[i];
                p++;
            } else if (array[i] < 0) {
                negativeArray[n] = negativeArray[n] + array[i];
                n++;
            } else if (array[i] == 0){
                zeroCounter++;
            }
        }
        System.out.println("Positive Array: " + Arrays.toString(positiveArray));
        System.out.println("Negative Array: " + Arrays.toString(negativeArray));
        System.out.println("Quantity of 0 in array: " + zeroCounter);
    }

    public static int positiveSizeArray(int[] array) {
        int positiveSize = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                positiveSize++;
            }
        }
        return positiveSize;
    }
        public static int negativeSizeArray (int[] array) {
            int negativeSize = 0;
            for (int i = 0; i < array.length; i++){
                if (array[i] < 0) {
                    negativeSize++;
                }
            }
            return negativeSize;
        }
}
