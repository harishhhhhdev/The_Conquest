package org.example.java_programming.Patterns;

public class RightAngledTriangle {
    public static void main(String[] args) {
       int rows = 5;

       for (int i = 1; i <= rows; i++) {
           for (int j = 1; j<= i; j++){
               System.out.print("*  ");
           }
           System.out.println();
       }

        }
    }


//git add
//git commit -m "✅ Q1: Right-Angled Triangle pattern with Tanglish explanation"
//git push
