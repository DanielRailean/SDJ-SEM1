import java.util.Scanner;
public class lesson201
{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Input a string!\n");
  String city = input.nextLine();
  System.out.print("Your input: " +city + "\n");
  System.out.print("Your input lowercase: " +city.toLowerCase() + "\n");
  System.out.print("Your input uppercase: " +city.toUpperCase() + "\n");
  System.out.print("Your input length: " +city.length() + "\n");

  }
}
