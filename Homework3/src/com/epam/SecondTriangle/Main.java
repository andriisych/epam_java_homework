package com.epam.SecondTriangle;

public class Main {
    public static void main(String[] args)
    {
        int rowNumber = 10;

        drawFirstTriangle (rowNumber);
        drawSecondTriangle (rowNumber);

    }
    static void printOneTriangleRow (int charsInRow, int rowCounter)
    {
        int starsCounter = rowCounter;
        int emptyCounter = charsInRow - starsCounter;
        printNchars(emptyCounter, ' ');
        printNchars(starsCounter, '*');
        System.out.println();
    }
    static void printNchars(int nuberOfChars, char printedChar)
    {
        while(nuberOfChars > 0)
        {
            nuberOfChars--;
            System.out.print(printedChar);
        }
    }
    static void drawFirstTriangle (int rowNumber)
    {
        int rowCounter = 0;
        while (rowCounter < rowNumber)
        {
            System.out.println();
            rowCounter++;
        }
    }
    static void drawSecondTriangle (int rowNumber)
    {
        int rowCounter = rowNumber;
        while (rowCounter != 0)
        {
            printOneTriangleRow (rowNumber, rowCounter);
            rowCounter--;
        }
    }

}
