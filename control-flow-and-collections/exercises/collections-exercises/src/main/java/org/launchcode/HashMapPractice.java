package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    private Map<Integer, String> roster;

    public HashMapPractice() {
        this.roster = new HashMap<>();
    }

    public void addStudent(int studentId, String studentName){
        roster.put(studentId, studentName);
    }

    public void printRoster() {
        System.out.println("Student Roster:");
        for (Map.Entry<Integer, String> entry : roster.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    public static void main(String[] args){
        HashMapPractice roster = new HashMapPractice();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter 'A' to add a student,'P' to print the roster, or 'Q' to quit: ");
            String choice = scanner.nextLine().toUpperCase();

            switch (choice) {
                case "A":
                    System.out.println("Enter student ID: ");
                    int studentId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter student name: ");
                    String studentName = scanner.nextLine();
                    roster.addStudent(studentId, studentName);
                    break;
                case "P":
                    roster.printRoster();
                    break;
                case "Q":
                    System.out.println("Existing program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter 'A', 'P', or 'Q'.");
            }

        }
    }
}


