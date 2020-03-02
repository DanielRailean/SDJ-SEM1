import java.util.Scanner;

public class BookTest
{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Hi, please input Author, Title , Price and Pages number\n");
    Book Mobydick = new Book(keyboard.nextLine(),keyboard.nextLine(),keyboard.nextDouble(),keyboard.nextInt());
    System.out.print(Mobydick);
    Mobydick.setPrice(0.8*Mobydick.getPrice());
    System.out.print("\n\nOHH, Look, this book is now on 20% off sale!"+Mobydick);

  }
}
