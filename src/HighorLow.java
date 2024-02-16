import java.util.Random;
import java.util.Scanner;

public class HighorLow {
    public static void main(String[] args) {
        //initiate scanner
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 10
        int randomNumber = random.nextInt(10) + 1;
        int userGuess = 0;

        // Prompt the user for a guess within the valid range
        do {
            System.out.print("Guess a number between 1 and 10: ");
            while (!scanner.hasNextInt()) {
                System.out.println("That's not a valid number!");
                scanner.next();
                System.out.print("Guess a number between 1 and 10: ");
            }
            userGuess = scanner.nextInt();
        } while (userGuess < 1 || userGuess > 10);

        // Displaying the result
        System.out.println("The random number was: " + randomNumber);
        if (userGuess == randomNumber) {
            System.out.println("Your guess is on the money!");
        } else if (userGuess > randomNumber) {
            System.out.println("Your guess was too high.");
        } else {
            System.out.println("Your guess was too low.");
        }
    }
}
