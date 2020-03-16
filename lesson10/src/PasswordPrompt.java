import java.util.Scanner;
public class PasswordPrompt
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter a username");
    String username = keyboard.nextLine();
    System.out.println("Enter a password");
    String passwd1 = keyboard.nextLine();
    System.out.println("Confirm password");
    String passwd2 = keyboard.nextLine();
    while(!passwd1.equals(passwd2)){
      System.out.println("passwords are not equal, try again");
      System.out.println("Enter a password");
       passwd1 = keyboard.nextLine();
      System.out.println("Confirm password");
       passwd2 = keyboard.nextLine();
    }
    System.out.println("Username: "+ username+"\nPassword: "+ passwd1);
  }
}
