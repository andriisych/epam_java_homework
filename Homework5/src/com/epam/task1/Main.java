package com.epam.task1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] array = createArray(sizeRequest());
        displayArray(array);
        displayArray(reverseArray(array));

    }

    public static int sizeRequest() {
        boolean correctArraySize = false;
        int size;

        do {
            Scanner in = new Scanner(System.in);
            System.out.print("Input size of array, that bigger than 0, to reverse: ");
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
        return array;
    }

    public static int[] reverseArray( int[] arrayToRevers ) {

        for(int i=0; i<arrayToRevers.length/2; i++){
            int tempArray = arrayToRevers[i];
            arrayToRevers[i] = arrayToRevers[arrayToRevers.length -i -1];
            arrayToRevers[arrayToRevers.length -i -1] = tempArray;
        }
        return arrayToRevers;
    }


    public static void displayArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
