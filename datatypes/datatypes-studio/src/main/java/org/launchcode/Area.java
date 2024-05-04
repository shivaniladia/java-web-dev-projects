package org.launchcode;

import studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){
        double radius;
        System.out.println("Enter a radius: ");
        Scanner scanner = new Scanner(System.in);
        radius = Double.parseDouble(scanner.nextLine());
        System.out.println(radius);
        System.out.println("The area of a circle of radius "
                + radius + " is: " + Circle.getArea(radius));
        //System.out.println("The area of a circle of radius " + radius + " is: " + 3.14 * radius * radius);

       // System.out.println("Area of circle is = "  + Circle.getArea(4.25));
    }
}
