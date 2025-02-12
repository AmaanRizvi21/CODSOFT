import java.util.*;

public class NumberGuessingGame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalScore = 0;

        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1; // 1 to 100
            int attempts = 0;
            int maxAttempts = 5;
            boolean guessedCorrectly = false;

            System.out.println("\nWelcome to the Number Guessing Game!");
            System.out.println("Guess the number between 1 to 100.(both Included)");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                    guessedCorrectly = true;
                    totalScore = (maxAttempts - attempts + 1);
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all attempts! The number was: " + targetNumber);
            }

            System.out.println("Your current score: " + totalScore);
            System.out.print("Do you want to play again? (yes/no): ");
            char response = sc.next().charAt(0);
            playAgain = (response=='Y'|| response=='y');
        }

        System.out.println("Thanks for playing! Your final score: " + totalScore);
        sc.close();
    }
}
