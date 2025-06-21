package org.example.java_programming.Level_01;


import java.util.Scanner;


public class ArmstrongCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int original = sc.nextInt();
        int num = original;
        int result = 0;

        while (num !=0) {
            int digit = num % 10;
            result += digit * digit * digit;
            num /= 10;

        }

        if (original == result)
            System.out.println(original + " is an ArmStrong Number");
        else {
            System.out.println(original + " is NOT an ArmStrong Number");
        }
    }
}
