import java.util.Scanner;

public class TestScoresTest
{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Input three test scores!");
    TestScores SDJexam = new TestScores(keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt());
    System.out.print("\nExam average: "+SDJexam.average());
  }
}
