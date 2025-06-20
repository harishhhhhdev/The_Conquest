package org.example.java_programming.Level_01;

import java.util.Scanner;

public class PallindromeCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int original = sc.nextInt();
        int num = original;
        int reversed = 0;

        while (num!=0) {
            int digit = num%10;
            reversed = reversed * 10 + digit;
            num /=10;
        }

        if (original == reversed)
            System.out.println(original + " is a Pallindrome !");
        else {
            System.out.println(original + " is NOT a Pallindrome !");
        }
    }
}
