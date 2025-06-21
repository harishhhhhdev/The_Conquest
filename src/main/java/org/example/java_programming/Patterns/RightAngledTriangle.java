package org.example.java_programming.Patterns;

public class RightAngledTriangle {
    public static void main(String[] args) {
        int rows = 5; // Namma ethana row venum-nu kudukurathu

        // Outer loop → rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop → ithu row-ku ethana star print pannanum-nu
            for (int j = 1; j <= i; j++) {
                System.out.print("* "); // Star print pannuvom
            }
            System.out.println(); // Oru row mudinja, next line poganum
        }
    }
}


//git add
//git commit -m "✅ Q1: Right-Angled Triangle pattern with Tanglish explanation"
//git push
