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
            while (integer != 0) {
                binary.append(integer & 1);
                integer >>= 1;
            }
            binary.reverse().toString();
            System.out.println("Binary: " + binary);
        } else {
            System.out.println("Binary: 0");
        }
    }
}