public class MyDate
{
  private int day;
  private int month;
  private int year;

  public MyDate(int day, int month, int year){
    this.day = day;
    this.month = month;
    this.year = year;
  }
  public MyDate(){
    day = 0;
    month = 0;
    year = 0;
  }
  public String toString(){
    return "\n"+day+"/"+month+"/"+year;
  }
  public void setDay(int d){
    day = d;
  }
  public void setMonth(int m){
    month = m;
  }
  public void setYear(int y){
    year = y;
  }
  public int getDay(){
    return day;
  }
  public int getMonth(){
    return month;
  }
  public int getYear(){
    return year;
  }
  public String displayDate(){
    return "\n"+day+"/"+month+"/"+year;
  }
  public boolean isLeapYear(){
    if(year%4==0){
      if(year%100==0){
        return year%400==0;
      }
      return true;
    }else
      {
    return false;
    }
  }
}
