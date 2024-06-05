package com.gvacharya.operators.main;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int sum = 0, temp = number;
        int digits = String.valueOf(number).length();
        
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        System.out.println(number + (sum == number ? " is an Armstrong number." : " is not an Armstrong number."));
        
   
        scanner.close();
    }
}



