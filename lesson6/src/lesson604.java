import java.util.Scanner;
public class lesson604
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input three numbers");
    int nr1 = keyboard.nextInt();
    int nr2 = keyboard.nextInt();
    int nr3 = keyboard.nextInt();
    if (nr1 > nr2)
    {
      System.out.println(
          "The biggest nr of the " + nr1 + " and " + nr2 + " is " + nr1);
      System.out.println("Number sorted: " + nr2 + " " + nr1);
    }
    else
    {
      System.out.println(
          "The biggest nr of the " + nr1 + " and " + nr2 + " is " + nr2);
      System.out.println("Number sorted: " + nr1 + " " + nr2);
    }

    if((nr1>nr2)&&(nr2>nr3)){
    System.out.println("Order is "+ nr1+ " "+nr2+" "+nr3);
    }
    if((nr1>nr3)&&(nr2<nr3)){
      System.out.println("Order is "+ nr1+ " "+nr3+" "+nr2);
    }
    if((nr2>nr1)&&(nr1>nr3)){
      System.out.println("Order is "+ nr2+ " "+nr1+" "+nr3);
    }
    if((nr2>nr3)&&(nr3>nr1)){
      System.out.println("Order is "+ nr2+ " "+nr3+" "+nr1);
    }
    if((nr3>nr1)&&(nr1>nr2)){
      System.out.println("Order is "+ nr3+ " "+nr1+" "+nr2);
    }
    if((nr3>nr2)&&(nr2>nr1)){
      System.out.println("Order is "+ nr3+ " "+nr2+" "+nr1);
    }
  }
}
