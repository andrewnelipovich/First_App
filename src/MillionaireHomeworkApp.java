import java.util.Scanner;

public class MillionaireHomeworkApp {
    public static void main(String[] args) {
        char correctAnswer = 'c';

        System.out.println("Who invented the light bolb? \na.Him \nb.Her \nc.Thomas \nd.They");

        Scanner inputText = new Scanner(System.in);

        System.out.println("Enter your answer:");

        char userInput = inputText.next().charAt(0);

        if (userInput == correctAnswer) {
            System.out.println("That's right!");
        } else {
            System.out.println("Wrong answer");
        }
        inputText.close();
    }
}