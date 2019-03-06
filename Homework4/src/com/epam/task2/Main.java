package com.epam.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Unique chars in phrase: " + uniqueCharsChecker(phraseInserting()));

    }

    static String phraseInserting() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input phrase to showing unique chars: ");
        String phrase = in.nextLine();
        return phrase;

    }
    static String uniqueCharsChecker (String phrase){

        String uniqueCharsInPhrase = "";
        int phraseLenght = phrase.length();
        int counter = 0;
        while (counter < phraseLenght) {
            char oneChar = phrase.charAt(counter++);
            if (phrase.indexOf(String.valueOf(oneChar)) == phrase.lastIndexOf(String.valueOf(oneChar))) {
                uniqueCharsInPhrase = uniqueCharsInPhrase + oneChar;
            }
        }
        return  uniqueCharsInPhrase;

    }

}
