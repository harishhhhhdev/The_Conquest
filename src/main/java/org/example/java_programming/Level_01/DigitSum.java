package org.example.java_programming.Level_01;

import java.util.Scanner;

public class DigitSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int sum = 0;

        while (num!=0) {
            sum += num%10;
            num /= 10;
        }

        System.out.println("Sum of Digits: "+ sum);
    }
}
