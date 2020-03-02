import java.util.Scanner;
public class lesson603
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Input your score!");
    int score = keyboard.nextInt();
    if(score==12){
      System.out.println("Your grade in internation grading scale is "+
          "A");
    }else if(score == 10){
      System.out.println("Your grade in internation grading scale is "+
          "B");
    }
    else if(score == 7){
      System.out.println("Your grade in internation grading scale is "+
          "C");
    }else if(score == 4){
      System.out.println("Your grade in internation grading scale is "+
          "D");
    }else if(score == 2){
      System.out.println("Your grade in internation grading scale is "+
          "E");
    }else if(score == 0){
      System.out.println("Your grade in internation grading scale is "+
          "Ex");
    }else if(score == -3){
      System.out.println("Your grade in internation grading scale is "+
          "F");
    }else{
      System.out.println("Wrong grade , try again!");
    }
  }
}
