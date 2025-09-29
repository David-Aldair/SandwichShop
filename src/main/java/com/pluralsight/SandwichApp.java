package com.pluralsight;

import java.util.Scanner;

public class SandwichApp {
    public static void main(String[] args) {

        // I is my variable name for the scanner
        Scanner I = new Scanner(System.in);

        System.out.println("""
                            Welcome to our wonderful Sandwich Shop!
                            Pick a Sandwich
                            Type (1) for Regular: $5.45
                            Type (2) for Large: $8.95
                            """);

        int size = I.nextInt();

        double price = 0;

        if (size == 1){
            price = 5.45;
        }
        else if (size == 2){
            price = 8.95;
        }

        System.out.println("What is your age ?: ");

        int age = I.nextInt();

        if (age >= 65) {

            price *= 0.8;
        }

        else if (age <= 17){

            price *= 0.9;

        }

        System.out.printf("Total Price: $%.2f",price);










        }







    }

