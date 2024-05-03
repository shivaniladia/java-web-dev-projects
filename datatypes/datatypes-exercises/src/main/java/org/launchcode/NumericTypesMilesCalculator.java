package org.launchcode;

import java.util.Scanner;

public class NumericTypesMilesCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting the user for the number of miles they have driven
        System.out.println("Enter the number of miles driven: ");
        double miles = input.nextDouble();

        // Prompting the user for the amount of gas they’ve consumed (in gallons)
        System.out.println("Enter the amount of gas consumed (in gallons): ");
        double gallons = input.nextDouble();

        // Calculating the miles-per-gallon
        double mpg = calculateMileNumericType(miles / gallons);

        // Displaying the result
        System.out.println("The total miles per gallon is: " + mpg);
    }

    private static double calculateMileNumericType(double miles) {
        return miles;
        }
    }


