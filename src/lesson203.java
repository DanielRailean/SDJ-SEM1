import java.util.Scanner;
public class lesson203
{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Input the sales tax:\n");
    double tax = input.nextDouble();
    System.out.print("Now input the price of three items\n");
    System.out.print("Item nr1 price=\n");
    int price1 = input.nextInt();
    System.out.print("Item nr2 price=\n");
    int price2 = input.nextInt();
    System.out.print("Item nr3 price=\n");
    int price3 = input.nextInt();
    double tax1,tax2,tax3;
    tax1 = tax* price1;
    tax2 = tax* price2;
    tax3 = tax* price3;
    System.out.print("Tax for item1 is : "+ tax1+
        " And the total price is: "+ (tax1+price1) + "\n");
    System.out.print("Tax for item2 is : "+ tax2+
        " And the total price is: "+ (tax2+price2) + "\n");
    System.out.print("Tax for item3 is : "+ tax3+
        " And the total price is: "+ (tax3+price3) + "\n");
  }
}
