package beginner;

import java.util.Scanner;
public class ChatGPT {
        public static void main(String[] args) {
            // Create a Scanner object to read user input
            Scanner scanner = new Scanner(System.in);

            // Prompt the user for input
            System.out.print("Enter a value: ");

            // Read the user's input as a string
            String userInput = scanner.nextLine();

            // Close the scanner
            scanner.close();

            // Print the user's input
            System.out.println("Your input: " + userInput);
        }
    }
