package org.launchcode;

import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // You can now use the 'input' Scanner object to read input from the user
        System.out.println("Hello, what is your name:");

        // Reading the user's input
        String name = input.nextLine();

        // Displaying a personalized greeting
        System.out.println("Hello, " + name + "! Welcome to the program.");
    }
}
