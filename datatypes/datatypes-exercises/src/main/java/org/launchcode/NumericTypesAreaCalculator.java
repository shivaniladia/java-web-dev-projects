package org.launchcode;

import java.util.Scanner;

public class NumericTypesAreaCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting the user for the length of the rectangle
        System.out.println("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        // Prompting the user for the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        // Calculating the area of the rectangle
        double area = calculateNumericType(length, width);

        // Displaying the result
        System.out.println("The area of the rectangle is: " + area);
    }

    // Method to calculate the area of a rectangle
    public static double calculateNumericType(double length, double width) {
        return length * width;
    }

}
