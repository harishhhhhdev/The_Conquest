package org.example.java_programming.Patterns;

public class Pyramidpattern {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop – 1 to rows
        for (int i = 1; i <= rows; i++) {

            // Space print – rows - i times
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            // Star print – i times
            for (int star = 1; star <= i; star++) {
                System.out.print("* ");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}