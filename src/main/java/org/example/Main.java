package org.example;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    // Converts an integer input to binary.
    public static void main(String[] args) {

        // Ask an integer from user.
        System.out.print("Type in an integer: ");
        int integer = scanner.nextInt();

        // Convert integer to binary
        if (integer > 0) {
            StringBuilder binary = new StringBuilder();
            while (integer > 0) {
                // bit-by-bit AND operation. For example 1110 & 1 = 0 and 1101 = 1.
                binary.append(integer & 1);
                // Shift binary representation to the right by one bit.
                // For example before 111101.
                integer >>= 1;
                // After it becomes 11110.
            }
            binary.reverse().toString();
            System.out.println("Binary: " + binary);
        } else {
            System.out.println("Binary: 0");
        }
    }
}