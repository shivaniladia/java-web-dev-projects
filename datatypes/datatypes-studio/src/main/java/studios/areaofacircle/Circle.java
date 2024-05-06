package studios.areaofacircle;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");

        double radius = input.nextDouble();
        input.close();
       // double area = Math.PI * Math.pow(radius, 2);
        double area = getArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
    }

    public static Double getArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
