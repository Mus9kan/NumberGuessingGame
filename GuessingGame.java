package OasisInfobyte;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            // Generating a random number between 1 and 100
            int numberToGuess = random.nextInt(100) + 1;
            int numberOfTries = 0;
            int userGuess = 0;
            boolean win = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("I have randomly selected a number between 1 and 100.");
            System.out.println("Can you guess what it is?");

            while (!win) {
                System.out.print("Enter your guess: ");
                userGuess = scanner.nextInt();
                numberOfTries++;

                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    win = true;
                }
            }

            System.out.println("Congratulations! You've guessed the number.");
            System.out.println("It took you " + numberOfTries + " tries.");
            scanner.close();
        }
    }

