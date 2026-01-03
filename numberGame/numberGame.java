import java.util.Scanner;
import java.util.Random;

class numberGame {

    // Method to play one round
    public static int guessNumber(Scanner sc) {
        Random random = new Random();
        int num = random.nextInt(100) + 1; 
        int attempts = 10;

        System.out.println("\nGuess the number between 1 and 100");
        System.out.println("You have only " + attempts + " guesses");

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": ");
            int userInput = sc.nextInt();

            if (userInput == num) {
                System.out.println("Correct! You guessed the number in " + i + " attempts.");
                return 1;
            } 
            else if (userInput > num) {
                System.out.println("Try a lower number.");
            } 
            else {
                System.out.println("Try a higher number.");
            }
        }

        System.out.println("You lost! The correct number was: " + num);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int decision;

        do {
            score += guessNumber(sc);

            System.out.print("\nDo you want to play again? (1 = Yes, 0 = No): ");
            decision = sc.nextInt();

        } while (decision == 1);

        System.out.println("\nFinal Score = " + score);
        sc.close();
    }
}
