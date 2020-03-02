import java.util.Scanner;

public class Question1
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Type an integer:");
    int int1 = keyboard.nextInt();
    System.out.print("Type a second integer integer:");
    int int2 = keyboard.nextInt();
    System.out.print("Type a third integer integer:");
    int int3 = keyboard.nextInt();
    System.out.print("The product of ("+int1 +" * "+ int2+" ) is "+ (int1*int2) );
    System.out.print("\nThe sum of ("+int1 +" + "+ int2+" ) is "+ (int1+int2) );
    System.out.print("\nThe quotient of ("+int2 +" / "+ int3+" ) is "+ ((double)int2/int3) );
    System.out.print("\nThe difeerence of ("+int2 +" - "+ int3+" ) is "+ (int2-int3) );
  }
}
