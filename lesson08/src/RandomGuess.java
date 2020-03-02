import java.util.Scanner;
import java.util.Random;
public class RandomGuess
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    Random randomNrGenerator = new Random();
    int randomNr = randomNrGenerator.nextInt(11);
    System.out.println("Guess a number in range 1-10");
    int guess = keyboard.nextInt();
    System.out.println(guess==randomNr ? "You guessed":"You missed, the number was "+randomNr);
  }
}
