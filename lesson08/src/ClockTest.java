public class ClockTest
{
  public static void main(String[] args)
  {
    Clock time1 = new Clock(12,60, 30);
    Clock time2 = new Clock(1,60,30);
    time1.setTimeFormat(24);
    time2.setTimeFormat(24);
    System.out.println(time1.isBeforeTime(time2));
    System.out.println(time1.timeInSecondsTo(time2));
    System.out.println(time1.timeTo(time2));

  }
}
