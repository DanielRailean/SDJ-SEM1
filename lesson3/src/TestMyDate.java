public class TestMyDate
{
  public static void main(String[] args){
    MyDate myBirthday = new MyDate(27,9,2000);
    MyDate hisBirthday = new MyDate(9,11,1998);
    System.out.print("My birthday is on "+ myBirthday.displayDate()
        +"\nHis birthday is on "+ hisBirthday.displayDate());
    MyDate herBirthday = new MyDate(24,9,2000);
    System.out.print(herBirthday);
  }
}
