import java.util.Scanner;
public class lesson602
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input your gender!");
    String gender = keyboard.nextLine();
    char g = gender.charAt(0);
    System.out.println("Input your age!");
    int age = keyboard.nextInt();
    if(age<0){
      System.out.println("Error in age!");
    }
    if(g=='M'){
      if(age<18){
        System.out.println("You are boy");
      }else{
        System.out.println("You are man");
      }
    }else if(g=='F'){
      if(age<18){
        System.out.println("You are Girl");
      }else{
        System.out.println("You are Woman");
      }
    }else{
      System.out.println("Error in gender!");
    }
  }
}
