import java.util.Random;
import java.util.Scanner;

public class NumberGame {

  public static void main(String[] args) {
    Random rand = new Random();
    int randomNumber = rand.nextInt(100) + 1;
    int attempts = 5;
    int score = 0;

    System.out.println("Let's play the number game!");
    System.out.println(
      "You have " + attempts + " attempts to guess the number."
    );
    Scanner sc = new Scanner(System.in);

    for (int i = 1; i <= attempts; i++) {
      System.out.print("Attempt " + i + ": Enter your guess: ");
      int userGuess = sc.nextInt();

      if (userGuess == randomNumber) {
        System.out.println(" Congratulations! You guessed the correct number.");
        score = i;
        break;
      } else if (userGuess > randomNumber) {
        System.out.println("Too high! Try again.");
      } else {
        System.out.println("Too low! Try again.");
      }
    }

    if (attempts == 5) {
      System.out.println(
        "You ran out of attempts. The correct number was " + randomNumber + "."
      );
    }

    System.out.println("Your score is " + score + " attempts.");

    System.out.print("Do you want to play again? (yes/no): ");
    String response = sc.next();
    if (response.equalsIgnoreCase("yes")) {
      System.out.println("Welcome Again!!");
    }
  }
}
