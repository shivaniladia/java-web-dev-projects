package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {
        String myString = "Hello, world!";

        // Convert the string to an array of characters
        char[] charactersInString = myString.toCharArray();

        // Print each character in the array
        System.out.println("Characters in the string:");
        for (char c : charactersInString) {
            System.out.println(c);
        }
    }
}
