import java.util.Scanner;

public class TestMyDate
{
  public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    MyDate myBirthday = new MyDate(27,9,2000);
    MyDate herBirthday = new MyDate(24,9,2000);
    System.out.println(myBirthday);
    System.out.println(herBirthday);
    System.out.println(myBirthday.isBefore(herBirthday));
    herBirthday = MyDate.today();
    System.out.println(myBirthday.isBefore(herBirthday));

    System.out.println(Area.getArea(3,10d));
    LandTract land1 = new LandTract(keyboard.nextDouble(),keyboard.nextDouble());
    LandTract land2 = new LandTract(keyboard.nextDouble(),keyboard.nextDouble());
    System.out.println(land1.equals(land2));
  }
}
