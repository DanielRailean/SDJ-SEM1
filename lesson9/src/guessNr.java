import java.util.Scanner;
public class guessNr
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int nr =  (int)(Math.round(Math.random()*1000));
    int guesses;
    System.out.println("Guess a number in range 1-1000 or enter -1 to quit");
    int userGuess = keyboard.nextInt();
    while(userGuess!=-1){
      if(userGuess==nr){
        System.out.println("You guessed!");
        System.out.println("Wanna have another play?, enter -2 to confirm");
        userGuess = keyboard.nextInt();
        if(userGuess==-2){
          nr =  (int)(Math.round(Math.random()*1000));
        }else{
          break;
        }
      }else if(userGuess>nr){
        System.out.println("too big");
      }else{
        System.out.println("too small");
      }
      System.out.println("guess now or -1 to exit");
      userGuess = keyboard.nextInt();

    }

  }
}
