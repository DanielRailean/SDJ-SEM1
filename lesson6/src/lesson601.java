import java.util.Scanner;
public class lesson601
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input your age!");
    int age = keyboard.nextInt();
    if(age<0){
      System.out.println("Error in age");
    }else if (age<13)
    {
      System.out.println("You are child");
    }else if (age<20){
      System.out.println("You are teenager");
    }else if (age <66){
      System.out.println("You are adult");
    }else{
      System.out.println("You are senior");
    }
  }
}
