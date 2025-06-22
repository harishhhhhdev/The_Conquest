package org.example.java_programming.Patterns;

public class RightAngledTriangle {
    public static void main(String[] args) {
        int rows = 5;

        // Outer loop → rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Star print
            }
            System.out.println(); //
        }
    }
}


