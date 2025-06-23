package org.example.java_programming.Patterns;

// An inverted Triangle - Pattern

public class InvertedTriangle {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop -> 5 to 1
        for (int i = rows; i >= 1; i--) {
            // Inner loop -> i stars for that row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Next row
        }
    }
}
