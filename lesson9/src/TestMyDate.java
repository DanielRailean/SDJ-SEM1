public class TestMyDate
{
  public static void main(String[] args){
    MyDate myBirthday = new MyDate(28,2,2020);
//   for (int i =1; i<=12;i++){
//      myBirthday.setMonth(i);
//      for(int j=1; j<=myBirthday.daysInMonth(i,2020);j++){
//        myBirthday.setDay(j);
//        System.out.println("You are born on "+myBirthday.getDayOfWeek()+" "+myBirthday.getDay()+" "+myBirthday.getMonth()+" under the sign "+myBirthday.getAstroSign());
//      }
//    }
    System.out.println(myBirthday);
    myBirthday.nextDay();
    System.out.println(myBirthday);
    myBirthday.nextDay();
    System.out.println(myBirthday);
    System.out.println(myBirthday.getDayOfWeek());
    System.out.println(myBirthday.getMonthName());
    System.out.println(myBirthday.leapYearsSinceIntroduced());
    myBirthday.setDate(31,12,2020);
    myBirthday.nextDay();
    System.out.println(myBirthday);
  // System.out.print("Your age in days is "+myBirthday.getAgeInDays());
  }
}
