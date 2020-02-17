public class TestMyDate
{
  public static void main(String[] args){
    MyDate myBirthday = new MyDate();
    MyDate hisBirthday = new MyDate();
    myBirthday.setDate(27, 9,2000);
    hisBirthday.setDate(9,11,1998);
    System.out.print("My birthday is on "+ myBirthday.displayDate()
        +"\nHis birthday is on "+ hisBirthday.displayDate());
  }
}
