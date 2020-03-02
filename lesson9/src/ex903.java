import java.util.Scanner;
public class ex903
{
  public static void main(String[] args)
  {
    Scanner keybooard = new Scanner(System.in);
    System.out.println("Input two years and i will tell how many years passed since then");
    int year = keybooard.nextInt();
    int nextYear = keybooard.nextInt();
    MyDate test = new MyDate(0,0, year);
    MyDate test2 = new MyDate(0,0,nextYear);
    System.out.println(test.leapYearsSinceIntroduced());
    System.out.println("Leap years between : "+ year +" and "+nextYear+" = " +(test2.leapYearsSinceIntroduced()-test.leapYearsSinceIntroduced()));

  }
}
