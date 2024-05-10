package org.launchcode;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {
//        // Create an ArrayList with at least 10 integers
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.add(8);
//        numbers.add(9);
//        numbers.add(10);
//
//        // Call the method to find the sum of even numbers
//        int sumOfEvens = findSumOfEven(numbers);
//        System.out.println("Sum of even numbers: " + sumOfEvens);
//    }
//
//        // Method to find the sum of all even numbers in an ArrayList
//        public static int findSumOfEven(ArrayList<Integer> numbers) {
//            int sum = 0;
//            for (int number : numbers) {
//                if (number % 2 == 0) {
//                    sum += number;
//                }
//            }
//            return sum;

        // Create an ArrayList of words
        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("apple");
        wordsList.add("banana");
        wordsList.add("orange");
        wordsList.add("grape");
        wordsList.add("melon");
        wordsList.add("peach");

        // Call the method to print words with exactly 5 letters
        printWordsWith5Letters(wordsList);
        }
    // Method to print words with exactly 5 letters
    public static void printWordsWith5Letters(ArrayList<String> words) {
        System.out.println("Words with exactly 5 letters:");
        for (String word : words) {
            if (word.length() == 5) {
                System.out.println(word);
            }
        }
    }
}
