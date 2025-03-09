import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        // Using separate variables to store the inputs. An Array could be used here instead.
        double input1 = 0.0;
        double input2 = 0.0;
        double input3 = 0.0;
        double input4 = 0.0;
        double input5 = 0.0;

        double total = 0.0;
        double average;
        double interest;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;
        int inputCounter = 1;
        double interestRate = 0.20;
        double input;

        while (inputCounter <= 5) {
            System.out.print("Please enter value " + inputCounter + ": ");
            input = scnr.nextDouble();

            if (inputCounter == 1) input1 = input;
            else if (inputCounter == 2) input2 = input;
            else if (inputCounter == 3) input3 = input;
            else if (inputCounter == 4) input4 = input;
            else if (inputCounter == 5) input5 = input;

            total += input;

            if (input > max) max = input; // This line checks for a new maximum value
            if (input < min) min = input; // This line checks for a new minimum value

            inputCounter++;
        }

        average = total / (inputCounter - 1);
        interest = total * interestRate;

        System.out.println("\nYou entered the following values:");
        System.out.println("Value 1: " + input1);
        System.out.println("Value 2: " + input2);
        System.out.println("Value 3: " + input3);
        System.out.println("Value 4: " + input4);
        System.out.println("Value 5: " + input5);

        System.out.println("\nTotal: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on " + total + ": " + interest);

        scnr.close();
    }
}