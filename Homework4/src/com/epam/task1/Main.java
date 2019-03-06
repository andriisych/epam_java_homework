package com.epam.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number = numberInserting();
        System.out.println ("Transformed number " + number + " to binary. Result: " + transformNumberToBinary (number));
    }
    static int numberInserting (){
        Scanner in = new Scanner(System.in);
        System.out.print("Input number for binary transformation: ");
        int number = in.nextInt();
        return number;
    }
    static String transformNumberToBinary (int number){

        int binaryDivider = 2;
        int numberToTransform = number;
        String binaryNumber = "";

        while (numberToTransform >= 1) {
            binaryNumber = (numberToTransform % binaryDivider) + binaryNumber;
            numberToTransform = numberToTransform / binaryDivider;
        }

        return binaryNumber;
    }
}
