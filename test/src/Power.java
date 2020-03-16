import java.util.Scanner;
public class Power
{
  public static void main(String[] args)
  {
    double result=1;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input a double");
    double x  = keyboard.nextDouble();
    System.out.println("Input a power");
    int n = keyboard.nextInt();
    while(n<0){
      System.out.println("Input a positive power");
      n = keyboard.nextInt();

    }
    for(int i = 0; i<n; i++)
    {
      result=result*x;
    }
    System.out.println("Result: " +result);
  }
}
