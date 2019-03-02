package com.epam.FifthTriangle;

    public class Main {
        public static void main(String[] args)
        {
            int rowNumber = 10;

            drawFullTriangle(rowNumber);
            drawFullTriangle(rowNumber);
        }
        static void printOneTriangleRow (int charsInRow, int rowCounter)
        {
            int starsCounter = rowCounter;
            int emptyCounter = charsInRow - starsCounter;
            printNchars(emptyCounter, ' ');
            printNchars(starsCounter, '*');
            printNchars(starsCounter-1, '*');
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
        static void drawFullTriangle (int rowNumber)
        {
            int rowCounter = 1;
            while (rowCounter < rowNumber)
            {
                printOneTriangleRow (rowNumber, rowCounter);
                rowCounter++;
            }
        }
    }

