import java.util.Scanner;
public class lesson202
{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Give me 1st number:\n");
    int nr1 = input.nextInt();
    System.out.print("Give me 2nd number:\n");
    int nr2 = input.nextInt();
    System.out.print("Give me 3rd number:\n");
    int nr3 = input.nextInt();
    int sum = nr1+nr2+nr3;
    System.out.print("The sum is :\n"+ sum);
  }
}
