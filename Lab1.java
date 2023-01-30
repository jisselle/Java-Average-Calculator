// Jisselle Garcia
// Lab 1, 01/20/23
// This program asks the user for three inputs, and calculates the average at the end.

import java.util.Scanner;

public class Lab1
{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// Title of program
        System.out.println("\tPrint each number input by the user and their average");

//Prompt the user for three numbers
        System.out.print("Please enter a first number: ");
        double number1 = input.nextDouble();

        System.out.print("Please enter a second number: ");
        double number2 = input.nextDouble();

        System.out.print("Please enter a third number: ");
        double number3 = input.nextDouble();

//calculation
        double avg = ((number1 + number2 + number3) / 3);

// output of the average result
        System.out.printf("The average of %.2f, %.2f and %.2f is %.2f", number1, number2, number3, avg);
    }
}

