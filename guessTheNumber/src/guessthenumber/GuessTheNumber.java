package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to... Guess the Number Game!");
        System.out.print("Enter the maximum range for the secret number: ");
        int maxRange = scanner.nextInt();
        NumberGame game = new NumberGame(maxRange);
        System.out.println("I chose a secret number between 1 and " + maxRange + ". Try to guess it!");
        
        boolean hasGuessedCorrectly = false;
        int numberOfTries = 0;
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;
            
            GuessResult result = game.verifyGuess(userGuess);
            
            if (result == GuessResult.correct) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
            } else {
                System.out.println(result.getMessage());
            }
        }
        
        scanner.close();
    }
}

class NumberGame {
    private int secretNumber;
    private int maxRange;
    
    public NumberGame(int maxRange) {
        this.maxRange = maxRange;
        Random random = new Random();
        secretNumber = random.nextInt(maxRange) + 1;
    }
    
    public GuessResult verifyGuess(int guess) {
        if (guess < 1 || guess > maxRange) {
            return GuessResult.outOfRange;
        } else if (guess < secretNumber) {
            return GuessResult.tooLow;
        } else if (guess > secretNumber) {
            return GuessResult.tooHigh;
        } else {
            return GuessResult.correct;
        }
    }
}

enum GuessResult {
    tooLow("You guessed is too low."),
    tooHigh("You guessed is too high."),
    correct("Congratulations! You guessed correctly."),
    outOfRange("Your guess is out of range.");
    
    private final String message;
    
    private GuessResult(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
}


    
    


    
    

