package org.launchcode;

public class ArrayIntPractice {

    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        // Loop through the array and print each value
        System.out.println("All numbers: ");
        for (int number : integerArray) {
            System.out.println(number);
        }

        // Modify the loop to print only odd numbers
        //System.out.println("\nOdd numbers:");
        //for (int i = 0; i < array.length; i++) {
        //        if (array[i] % 2 != 0) {
        //            System.out.println(array[i]);
        System.out.println("Odd numbers:");
        for (int number : integerArray) {
            // for (int i = 0; i < integerArray.length; i++) {
            // replace with enhanced 'for'
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

            String phrase = "I would not, could not, in a box. " +
                    "I would not, could not with a fox. " +
                    "I will not eat them in a house. " +
                    "I will not eat them with a mouse.";
            String[] words = phrase.split(" ");
            System.out.println(java.util.Arrays.toString(words));

        String[] sentences = phrase.split("\\.");
        System.out.println(java.util.Arrays.toString(sentences));
        }
    }