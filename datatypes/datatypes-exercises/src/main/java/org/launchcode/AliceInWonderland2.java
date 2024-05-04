package org.launchcode;

import java.util.Locale;
import java.util.Scanner;

public class AliceInWonderland2 {

    public static void main(String[] args) {
        // Store the sentence in a string
        String bookSentence = "Alice was beginning to get very tired of sitting by her sister on the " +
                "bank, and of having nothing to do: once or twice she had peeped into the book her " +
                "sister was reading, but it had no pictures or conversations in it, ‘and what is the " +
                "use of a book,’ thought Alice ‘without pictures or conversation?’";

        // Prompt the user for a term to search for
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a term to search for within the sentence: ");
        String searchTerm = input.nextLine();

        // Make the search case-insensitive
        String lowercaseSentence = bookSentence.toLowerCase(Locale.ROOT);
        String lowercaseSearchTerm = searchTerm.toLowerCase();
        boolean found = lowercaseSentence.contains(lowercaseSearchTerm);

    }
}
