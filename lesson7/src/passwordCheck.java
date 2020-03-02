import java.util.Scanner;
public class passwordCheck
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input an username:");
    String username = keyboard.nextLine();
    System.out.println("Input a password:");
    String passwd1 = keyboard.nextLine();
    System.out.println("Confirm your password:");
    String passwd2 = keyboard.nextLine();
    System.out.println(username);
    if(passwd1.equals(passwd2)){
      System.out.println("Password confirmed successfully");
    }else{
      System.out.println("Passwords are not the same");
    }
  }
}
